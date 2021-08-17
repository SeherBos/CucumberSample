@report1
Feature: US1009_Koala Resort Negative Test Coklu
@multipleNegativeTest
  Scenario Outline: TC13_kullanici farkli gecersiz bilgilerle giris yapamaz

    Given kullanici "kr_url" gider
    Then Log in yazisina tiklar
    And kullanici ismi olarak "<kr_gecersiz_username>" girer
    And kullanici sifresi olarak "<kr_gecersiz_password>" girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    And sayfayi kapatir

  Examples:
    | kr_gecersiz_username  | kr_gecersiz_password  |
    | kr_gecersiz_username5 | kr_gecersiz_password5 |
    | kr_gecersiz_username6 | kr_gecersiz_password6 |
    | kr_gecersiz_username7 | kr_gecersiz_password7 |
    | kr_gecersiz_username8 | kr_gecersiz_password8 |
    | kr_gecersiz_username9 | kr_gecersiz_password9 |






