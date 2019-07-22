Feature: Validations for Flights link on left page

  Scenario: Load currencies page fot Flight link
    Given I load PHP travels page for Flights link
    And set my credentials  on 'Login' page for flights link
    And click 'Flights' link on 'Left Panel' page
    And click on 'Settings' after click on 'Flights' link
    And select 'Off' option from the selector
    And click on 'Submit' bottom after select option
