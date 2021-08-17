@report2
Feature: US1011_Amazon Arama
@amazonSearch
  Scenario: TC15_Kullanici Amazonda Mehmet aratir
    Given kullanici "amazonUrl" sayfasina gider
    Then Today's Deals sekmesine tiklar
    And Today's Deals sayfasinda "Mehmet" yazip arama yapar
    Then ilk ilan isminde "Mehmet" gectigini test eder.
