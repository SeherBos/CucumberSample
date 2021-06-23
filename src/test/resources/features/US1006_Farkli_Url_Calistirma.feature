Feature: US1006_Farkli Url Calistirma
  @report
  Scenario Outline:

   Given kullanici "<sayfaUrl>" gider


   Examples:
   |sayfaUrl|
   |amazonUrl|
   |facebookUrl|
   |yandexUrl  |