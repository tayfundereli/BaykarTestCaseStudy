Feature: Baykar Uye Girisi Senaryolari

  Background:
    Given kariyer.baykartech.com web sitesine gidilir ve sayfaya gidildigi dogrulanir
    And Giris butonuna tiklanir

  Scenario Outline:Bos Email ve Password kontrolu
    When "<email>" ve "<password>" alani doldurulmadan giris butonuna tiklanir
    Then Bos email ve password hatasi kontrol edilir
    Examples:
      | email                    | password       |
      |                          |                |
      | tayfundereli@outlook.com |                |
      |                          | superPassword1 |
      | tayfundereli@outlook.com | superPassword1 |

  Scenario Outline:Gecersiz Email/Password kontrolu
    When Gecersiz "<email>" "<password>" yazilir
    Then Gecersiz Email Password hatasi kontrol edilir
    Examples:
      | email                       | password       |
      | tayfundereli@outlook.com    | randompassword |
      | tayfundereli123@outlook.com | Td9bask1997    |

  Scenario Outline:Basarili Login Islemi
    When Gecerli "<email>" "<password>" yazilir
    Then Basarili uye girisi yapildigi kontrol edilir
    Examples:
      | email                    | password    |
      | tayfundereli@outlook.com | Td9bask1997 |
