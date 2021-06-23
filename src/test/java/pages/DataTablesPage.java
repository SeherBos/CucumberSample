package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DataTablesPage {

    public Actions action = new Actions(Driver.getDriver());

    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='unit w-3-4']//div/div/div/button/span")
    public WebElement newButton;

    @FindBy (xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameBox;

    @FindBy (css = "#DTE_Field_start_date")
    public WebElement dateBox;

   @FindBy (css = ".btn")
   public WebElement createButton;

   @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

   @FindBy (xpath = "//div[@id='example_wrapper']")
   public List<WebElement> table;

    @FindBy (xpath = "//td[@class='sorting_1']")
    public WebElement verifyName;









}
