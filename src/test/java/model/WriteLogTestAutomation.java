package model;
import io.github.bonigarcia.wdm.WebDriverManager;
import log4j.Log4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigReader;
import utilities.Driver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class WriteLogTestAutomation {
    public static WebDriver driver;
    private static String baseUrl;

    public static String userName = "seher";
    public static String email = "seherbos@hotmail.com";
    public static String confirmEmail = "seherbos@gmail.com";
    public static String userPassword = "bos123";
    public static String confirmPassword = "bos123";

    public static Elements elementPage; //Modelimizin bulunduğu paket dosyası
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/christian/Documents/Selenium Dependencies/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://test.mobilhanem.com.tr/registration/";

        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);
        driver.manage().window().maximize();

        elementPage = new Elements(driver);
    }

    @Test
    public void testUyeol() throws Exception {
        Log4j.startLog("Test  is Starting");
        driver.get(baseUrl);
        Log4j.info("Opening Page : " + baseUrl);
        elementPage.txtUserName().clear();
        elementPage.txtUserName().sendKeys(userName);
        Log4j.info("User Name :" + userName);
        elementPage.txtEmail().clear();
        elementPage.txtEmail().sendKeys(email);
        Log4j.info("Email :" + email);
        elementPage.txtConfirmEmail().clear();
        elementPage.txtConfirmEmail().sendKeys(confirmEmail);
        Log4j.info("Confirm Email :" + confirmEmail);
        if(email != confirmEmail){
            Log4j.error("Mismatch EMail");
        }

        elementPage.txtPassword().clear();
        elementPage.txtPassword().sendKeys(userPassword);

        elementPage.txtConfirmPassword().clear();
        elementPage.txtConfirmPassword().sendKeys(confirmPassword);

        elementPage.btnUyeOl().click();

    }

    @After
    public void endDown(){
        Log4j.endLog("Test is Ending");
        driver.quit();
    }
}