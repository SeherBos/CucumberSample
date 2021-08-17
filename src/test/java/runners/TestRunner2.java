package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

// Parallel Testing yapilirken ;
// Diger runner ile lokasyonlar ayni olursa , alacagimiz raporlari replace edeceginden ismini degistirdik.
   // cucumber-reports2.html" gibi
// Testleri esit sekilde bolup iki farkli browser'dan calistirmak icin , tag isimlerini runner class'larinda
// farkli yazip feature dosyalarini esit bolmemiz gerekecek.

        plugin={"html:target//cucumber-reports2.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber2.xml"},

        features="src/test/resources/features",

        glue="stepDefinitions",

        tags="@report2",

        dryRun=false,

        publish = true
)

public class TestRunner2 {


}
