
Feature: US1003_Yandex Arama
    Background: kullanici Yandex'e gider
      Given kullanici Yandex'e gider

    Scenario: TC05_iPhone arama
      When Yandex'de iphone icin arama yapar
      Then Yandex'de sonuclarin iPhone icerdigini test eder

    Scenario: TC06_Tea pot arama
      When Yandex'de tea pot icin arama yapar
      Then Yandex'de sonuclarin tea pot icerdigini test eder
      And sayfayi kapatir

      # CUCUMBER OLUSTURURKEN YAPILACAK ILK ADIMLAR
  # 1- FEATURE dosyasini olusturup, yapilacak adimlari yaziyorum
  # 2- Eksik step definition'lari elde etmek icin testimizi calistiriyoruz.Ability:
  #    Eger feature dosyasindan calistirirsak calisan adimlari run eder ve eksik kalan adimlari bize verir.
  #    var olan adimlari calistirmadan bize eksik olan step;leri vermesi icin ise ;
  #    runner 'a gidip @dryRun tag'ini true yapip calistiririz. Eksik stepleri aldiktan sonra yeniden false hale getirilir.
  # 3- Eksik stepler kopyalanip stepDefinition class'ina yapistirilir
  # 4- Stepleri calistiracak Java kodlarimizi method'larin icine yazariz
  # 5- Locate yapilacak elementler ise Page Class olusturulup oraya yazilir.

  #     StepDefinition class'inda birden fazla method da page objesini kullanacagim icin , class level'da (instance) olustururum