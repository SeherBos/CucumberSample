package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Country {
    /*
     {
        "id": 85694,
        "firstName": "Winona",
        "lastName": "Abernathy",
        "middleInitial": "S",
        "email": "winonaabernathy@gmail.com",
        "mobilePhoneNumber": "222-230-1890",
        "phoneNumber": "271-169-8836",
        "zipCode": "09848-7861",
        "address": "1956 Hackett Mission",
        "city": "Fairfax",
        "ssn": "779-99-4600",
        "createDate": "2021-03-03T06:00:00Z",
        "zelleEnrolled": false,
        "country": {
            "id": 3,
            "name": "USA",
            "states": null
        },
        "state": "Virginia",
        "user": {
            "id": 86453,
            "login": "dino.kohler",
            "firstName": "Winona",
            "lastName": "Abernathy",
            "email": "winonaabernathy@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null
        },
        "accounts": null
    }
     */
    private  int id;
    private String name;
    private String states;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }



}
