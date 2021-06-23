package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YandexStepDefinitions {

    YandexPage yandexPage = new YandexPage();

    @Given("kullanici Yandex'e gider")
    public void kullanici_yandex_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("yandexUrl"));

    }

    @When("Yandex'de iphone icin arama yapar")
    public void yandex_de_iphone_icin_arama_yapar() {
        yandexPage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("Yandex'de sonuclarin iPhone icerdigini test eder")
    public void yandex_de_sonuclarin_i_phone_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }

    @When("Yandex'de tea pot icin arama yapar")
    public void yandex_de_tea_pot_icin_arama_yapar() {
        yandexPage.searchBox.sendKeys("tea pot" + Keys.ENTER);

    }

    @Then("Yandex'de sonuclarin tea pot icerdigini test eder")
    public void yandex_de_sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tea pot"));

    }

}
