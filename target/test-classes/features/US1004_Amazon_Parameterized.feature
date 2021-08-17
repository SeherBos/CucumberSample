
Feature: US1004_Amazon Parameterized
  Background: Amazon sayfasina git
    Given kullanici amazon sayfasina gider

    Scenario: TC07_Amazon iPhone arama parametreli
      When "iPhone" icin arama yapar
      Then sonuclarin "iPhone" icerdigini test eder

      Scenario: TC08_Amazon lamba arama testi parametreli
      When "lamba" icin arama yapar
      Then sonuclarin "lamba" icerdigini test eder

      Scenario: TC09_Amazon candle arama parametreli
       When "candle" icin arama yapar
       Then sonuclarin "candle" icerdigini test eder

       And sayfayi kapatir
