Feature: US1002_Amazon Background Kullanma
  Background: sayfayi acma
    Given kullanici amazon sayfasina gider

    @seher
  Scenario: TC02_IPhone arama testi
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder

    @smoke @regression
  Scenario: TC03_Tea pot arama testi
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

    @Bos
  Scenario: TC04_Flower arama testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    And sayfayi kapatir

