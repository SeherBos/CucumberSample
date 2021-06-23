package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;



public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarin_iPhone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("iPhone"));
    }
    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("tea pot"+ Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("tea pot"));
    }
    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("flower"+ Keys.ENTER);
    }
    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("flower"));
    }
    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("{string} icin arama yapar")
    public void icin_arama_yapar(String searchedItem) {

        amazonPage.searchBox.sendKeys(searchedItem + Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String searchedItem) {
    Assert.assertTrue(amazonPage.searchResultText.getText().contains(searchedItem));

    }

    @Given("kullanici {string} gider")
    public void kullaniciGider(String sayfaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(sayfaUrl));
    }
}
