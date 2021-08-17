package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    public static WebDriver driver;

    public Elements(WebDriver webDriver) {
        driver = webDriver;

    }

    public WebElement txtUserName() {
        return driver.findElement(By.id("user_login"));
    }

    public WebElement txtEmail() {
        return driver.findElement(By.id("user_email"));
    }

    public WebElement txtConfirmEmail() {
        return driver.findElement(By.id("user_email"));
    }

    public WebElement txtPassword() {
        return driver.findElement(By.id("user_pass"));
    }

    public WebElement txtConfirmPassword() {
        return driver.findElement(By.id("user_confirm_password"));
    }


    public WebElement btnUyeOl() {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
}
