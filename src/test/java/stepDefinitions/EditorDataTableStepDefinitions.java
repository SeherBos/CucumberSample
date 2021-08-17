package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class EditorDataTableStepDefinitions {

    Faker fake = new Faker();
    String firstName= fake.name().firstName();

    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {

        ReusableMethods.waitForPageToLoad(3000);
      dataTablesPage.newButton.click();

    }
    @Then("Tum bilgileri girer")
    public void tum_bilgileri_girer() {

                dataTablesPage.action.click(dataTablesPage.firstNameBox).sendKeys(firstName).
                sendKeys(Keys.TAB).sendKeys(fake.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(fake.name().title()).
                sendKeys(Keys.TAB).sendKeys(fake.address().city()).
                sendKeys(Keys.TAB).sendKeys(fake.number().digits(3)).
                sendKeys(Keys.TAB).sendKeys("2019-03-01").
                sendKeys(Keys.TAB).sendKeys(fake.number().digits(5)).build().perform();
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButton.click();

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        dataTablesPage.searchBox.sendKeys(firstName+Keys.ENTER);

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() throws InterruptedException {
        Thread.sleep(3000);
        String name= dataTablesPage.verifyName.getText();
       Assert.assertTrue(name.contains(firstName));


    }


}
