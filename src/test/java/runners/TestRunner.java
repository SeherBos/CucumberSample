package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin={"html:target//cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},

        //Bu notasyonun gorevi feature dosyalari ile stepDefinition dosylarini birlestirmek
        features="src/test/resources/features",
        glue="stepDefinitions",
  // Boylece paketleri birbirine bagliyoruz.
  // Bu iki paket altinda kac tane class olursa olsun,
  // herhangi bir class'da yazilan her adim diger class'larda ki adimlarla uyusursa yeni adim olusturmaya gerek kalmaz

        tags="@report1", // stands for WorkInProgress
        // @TestNG de'ki group gibi calisir
        // eger sadece bir feature veya 1 scenario calistiracaksak, gidip feature dosyasindan calistirabiliriz
        // birden fazla Feature veya Scenario'lara ortak bir tag atamamiz gerekir ve bu tag'i runner'da belirtmek gerekir

        //  @ testNG'degi group gibi calisir
        // eger sadece 1 Feature veya 1 Scenario calistiracaksak, gidip feature dosyasindan calistirabiliriz
        // birden fazla Feature veya Scenario calistirmak istedigimizde
        // calistiracagimiz F veya S 'lara ortak bir tag atamamiz ve bu tag'i
        // runner'da belirtmemiz gerekir
        // and dendiginde yazilan taglarin tamamina sahip olanlar calistirilir
        // or dedigimde yazilan taglardan herhangi birine veya daha fazlasina sahip olanlar calisir
        // eger tum test case'leri calistirmak isterseniz tag'i yorum haline getirmeniz yeterli olur

        dryRun=false,

        // true oldugunda test case'leri calistirmayi denemeden sadece eksik olan step'leri bana verir
        // false oldugunda test case'leri calistirmayi dener eksik step' bulursa onu rapor eder

        publish = true
)

public class TestRunner {


}
