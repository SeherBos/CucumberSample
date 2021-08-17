@report1
Feature: US1008_Koala Resort Negatif Login
  @koalaResortNegatifLogin
  Scenario: TC12 kullanici gecersiz bilgilerle giris yapamaz

    Given kullanici "kr_url" gider
    Then Log in yazisina tiklar
    And kullanici ismi olarak "kr_wrong_username" girer
    And kullanici sifresi olarak "kr_wrong_password" girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    Then sayfayi kapatir


