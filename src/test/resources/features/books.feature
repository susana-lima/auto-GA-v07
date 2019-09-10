Feature: Validation of the books page

  Scenario: Verify if book title is visible
    Given I load books app
    Then verify the "book title" is displayed on the page

  Scenario: Verify if button Save Book is present
    Given I load books app
    Then verify the Save button is displayed


  Scenario: Validate message when we only enter Book Title
    Given I load books app
    And fill "Vivir para Contarla" Book Title field on the page
    Then Verify validation message when we enter only Book Title


  Scenario: Validate the name of the header
    Given I load books app
    Then Verify the name of the header is "Books App"
