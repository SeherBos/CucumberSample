
Feature: US1005_Amazon Scenario Outline
  Scenario Outline: TC10_Amazon Coklu Arama

    Given kullanici amazon sayfasina gider
    Then "<Mouse>" icin arama yapar
    And sonuclarin "<Mouse>" icerdigini test eder

    Examples:
    |Mouse|
    |keyboard|
    |computer|
    |glasses |

