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

  Scenario: Verify PRINT option is visible
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    Then verify the PRINT option is displayed on 'top' of the list

  Scenario: Verify delete currency has danger style
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    And select delete option of first row of the list
    Then verify style of delete option
