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

  Scenario: Verify option RETURN is present in view mode
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    And click 'View' option
    Then verify the RETURN button is displayed

  Scenario: Verify there is only one default currency
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    Then verify there is one default currency

  Scenario: Verify default values to create currency
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    And click 'Add' button
    Then verify Active and Rate has default values

  Scenario: Verify EXPORT INTO CSV option is visible
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    Then verify the EXPORT INTO CSV option is displayed on 'top' of the list

  Scenario: Verify dialog confirmation is present on deleting action
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    And click 'Currencies' link belows 'General' options
    And click 'Delete' option
    Then verify confirmation dialog is present