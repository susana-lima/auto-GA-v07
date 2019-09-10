Feature: Validation of the books page

  Scenario: Verify if book title is visible
    Given I load books app
    Then verify the "book title" is displayed on the page

  Scenario: Verify if button Save Book is present
    Given I load books app
    Then verify the Save button is displayed