package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.DemoGuruPage;
import utilities.ConfigReader;

public class DemoGuruStepDefinitions {

    DemoGuruPage demoGuruPage = new DemoGuruPage();
    @Given("kullanici Satir no : {string} ve sutun no: {string} olan hucredeki yaziyi yazdirir.")
    public void kullanici_satir_no_ve_sutun_no_olan_hucredeki_yaziyi_yazdirir(String row, String column) {

        int rowNo = Integer.parseInt(ConfigReader.getProperty(row));
        int columnNo = Integer.parseInt(ConfigReader.getProperty(column));

        System.out.println("Hucre Bilgisi = " + demoGuruPage.istenenHucre(rowNo, columnNo));

    }

}
