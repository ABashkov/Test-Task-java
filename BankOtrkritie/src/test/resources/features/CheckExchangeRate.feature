Feature: We are checking the correctness of the exchange rate
  Scenario: User going to exchange rate
    When User go to google for searching our site by word "Октрытие"
    Then User see "https://www.open.ru/" in search results and click on it
    Then User on the home page with url "https://www.open.ru/"
    Then User see on exchange rate
    Then User sale rate more purchase rate