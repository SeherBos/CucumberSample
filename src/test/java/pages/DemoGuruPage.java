package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {
    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public String istenenHucre(int row, int column){

    String istenenHucreYazisi = "((//tbody//tr)[" + row  + "]//td)["+ column + "]";

// dinamik olmayan xpath : ((//tbody//tr)[2]//td)[2]
// dinamik olmasi icin          "((//tbody//tr)[" +   row  + "]//td)["    column  " ]";

        return istenenHucreYazisi;

    }



}
