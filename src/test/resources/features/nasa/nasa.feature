Feature: Validate NASA site

Scenario: Compare get information
  Given I load NASA page
  And Click NASA API Listing link
  And Click NASA API Listing second time
  And Click Earth left panel
  And Click Imagery sub menu option
  Then Validate get information in the page