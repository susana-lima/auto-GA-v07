Feature: Validations of currencies list

  Scenario: Main currencies are in the list
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    Then verify standard currencies are present in column Name

  Scenario: Create new currency
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    And click 'Add' button
    And set my currency data