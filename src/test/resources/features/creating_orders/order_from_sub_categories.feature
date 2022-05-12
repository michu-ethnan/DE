Feature: Order products from sub categories

  A customer should be able to add products from sub categories

  Scenario: From Ogród
    Given that Alexa wants to order products from Ogród
    When she selects one sub category from Ogród
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Jadalnia
    Given that Alexa wants to order products from Jadalnia
    When she selects one sub category from Jadalnia
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Kuchnia
    Given that Alexa wants to order products from Kuchnia
    When she selects one sub category from Kuchnia
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Łazienka i garderoba
    Given that Alexa wants to order products from ŁazienkaIgarderoba
    When she selects one sub category from ŁazienkaIgarderoba
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Dekoracje
    Given that Alexa wants to order products from Dekoracje
    When she selects one sub category from Dekoracje
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Świat dziecka
    Given that Alexa wants to order products from ŚwiatDziecka
    When she selects one sub category from ŚwiatDziecka
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Nowości
    Given that Alexa wants to order products from Nowości
    When she selects one sub category from Nowości
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page

  Scenario: From Wyprzedaż
    Given that Alexa wants to order products from Wyprzedaż
    When she selects one sub category from Wyprzedaż
    And she adds a product from sub category page
    And goes to checkout as a person
    Then she should be able to see that she on payment page