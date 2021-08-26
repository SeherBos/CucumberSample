package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import org.apache.commons.collections4.map.HashedMap;
import org.junit.Assert;
import pojos.Country;
import pojos.Customer;
import utilities.ConfigReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import utilities.ReadTxt;
import utilities.WriteToTxt;


import static io.restassured.RestAssured.given;
import static jsonModels.CountryJson.createCountry;

@JsonIgnoreProperties(ignoreUnknown = true)
    public class ApiDers {

        private Response response;
        private int createdCountryId;

        @Given("read all customer data using with api endpoint {string}")
        public void read_all_customer_data_using_with_api_endpoint(String api_endpoint) {
            response = given().headers("Authorization","Bearer " +
                                    ConfigReader.getProperty("token"),"Content-Type",
                            ContentType.JSON,"Accept",ContentType.JSON).
                    when().
                    get(api_endpoint).
                    then().
                    contentType(ContentType.JSON).
                    extract().
                    response();
            //   response.prettyPrint();
            System.out.println("__________________________________________________");

        }
        @Then("validate customer data")
        public void validate_customer_data() throws IOException {

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
            System.out.println(customer[0].getFirstName());
            System.out.println(customer[customer.length - 1].getLastName());

            for (int i = 0; i < customer.length; i++) {
                System.out.println(customer[i].getSsn());

            }
            System.out.println("__________________________________________________");

            for (int i = 0; i < customer.length; i++) {
                if (customer[i].getFirstName().startsWith("A")) {
                    System.out.println(customer[i].getFirstName());
                }
            }
            System.out.println("__________________________________________________");


            for (int i = 0; i < customer.length; i++) {
                if (customer[i].getUser() != null) {
                    System.out.println(customer[i].getUser().getFirstName());
                }
            }
        }

        @Then("read all countries and write country ids to txt using api endpoint {string}")
        public void readAllCountriesAndWriteCountryIdsToTxtUsingApiEndpoint(String api_endpoint) throws IOException {
            response = given().headers("Authorization","Bearer " +
                                    ConfigReader.getProperty("token"),"Content-Type",
                                    ContentType.JSON,"Accept",ContentType.JSON).
                                    when().
                                    get(api_endpoint).
                                    then().
                                    contentType(ContentType.JSON).
                                    extract().
                                    response();
            response.prettyPrint();
            // validate islemi icin tum ulkeleri bir listin icine atalim

            List<String> countryId = new ArrayList<>();
            ObjectMapper objectMapper = new ObjectMapper();
            Country[] countries = objectMapper.readValue(response.asString(),Country[].class);

            // for dongusu ile tum country id'lerini daha once bir olusturdugumuz listin icine ekleyeliim

            for(int i=0; i<countries.length; i++){
                countryId.add(String.valueOf(countries[i].getId()));

                // ulke id'lerini txt olarak yazdiralim

                WriteToTxt.saveDataInFileWithCountrId("countryId",countries);

                // txt olarak yazdirdigimiz id'leri readtxt uzerinden okutalim

                List<String> readId = ReadTxt.returnCountryIdList("countryId") ;

                // validation
                Assert.assertEquals("mismatch",countryId,readId);
                System.out.println("Validation is successful");
            }
        }

        @And("create country {string}")
        public void createCountry(String api_url) {
            response = given().headers("Authorization","Bearer " +
                        ConfigReader.getProperty("token"),"Content-Type",
                        ContentType.JSON,"Accept",ContentType.JSON).
                        when().
                        body(createCountry).
                        post(api_url).then().contentType(ContentType.JSON).
                        extract().response();
            response.prettyPrint();

            JsonPath jsonPath = response.jsonPath();
            createdCountryId= jsonPath.getInt("id");
            System.out.println("___________________");
            System.out.println(createdCountryId);
        }

        @Then("validate created a country")
        public void validateCreatedACountry() {
            response = given().headers("Authorization","Bearer " +
                                    ConfigReader.getProperty("token"),"Content-Type",
                            ContentType.JSON,"Accept",ContentType.JSON).
                    when().
                    get("https://www.gmibank.com/api/tp-countries").
                    then().contentType(ContentType.JSON).
                    extract().
                    response();
                JsonPath jsonPath = response.jsonPath();
                String stringIds= jsonPath.getString("id");

                String CreatedCountryIdsAsString = String.valueOf(createdCountryId);
                Assert.assertTrue("mismatch",stringIds.contains(CreatedCountryIdsAsString));
                System.out.println("Validation is successful");

        }


        @And("update created a country using api end point {string}  {string} and its extension {string}")
        public void updateCreatedACountryUsingApiEndPointAndItsExtension(String api_url, String name, String id) {

            Map<String ,Object> putCountry = new HashMap<>();
            putCountry.put("id",id);
            putCountry.put("name",name);
            putCountry.put("states",null);


            response = given().headers("Authorization","Bearer " +
                                    ConfigReader.getProperty("token"),"Content-Type",
                            ContentType.JSON,"Accept",ContentType.JSON).
                            when().
                            body(putCountry).
                            put(api_url).
                            then().
                            contentType(ContentType.JSON).
                            extract().response();
                    response.prettyPrint();

        }

        @Given("delete updated a country using endpoint {string} and its extension {string} and validate")
        public void deleteUpdatedACountryUsingEndpointAndItsExtensionAndValidate(String endPoint, String id) {

                response = given().headers("Authorization","Bearer " +
                            ConfigReader.getProperty("token"),"Content-Type",
                            ContentType.JSON,"Accept",ContentType.JSON).
                            when().
                            delete(endPoint+id).then().
                            contentType(ContentType.JSON).
                            extract().
                            response();

                // validation yapiyoruz
            Response responseNew = given().headers("Authorization","Bearer " +
                            ConfigReader.getProperty("token"),"Content-Type",
                            ContentType.JSON,"Accept",ContentType.JSON).
                            when().get(endPoint).
                            then().
                            contentType(ContentType.JSON).
                            extract().response();
            JsonPath jsonPath = responseNew.jsonPath();
            String ids= jsonPath.getString("id");
            Assert.assertFalse("Failed deletion",ids.contains(id));

            System.out.println("Validation is successful");

        }
    }
