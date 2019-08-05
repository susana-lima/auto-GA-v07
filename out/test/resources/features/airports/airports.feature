Feature: Validations of airports option

  Scenario: Main airports are in the list
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'Flights' link on 'Left Panel' page
    And click 'Airports' link belows 'Flights' options
    Then verify main airports are present in column Country