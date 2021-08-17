
Feature: US10_Koala Resort Hotels Pozitif Login
  @koalaResortPozitifLogin
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici "kr_url" gider
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    Then sayfayi kapatir