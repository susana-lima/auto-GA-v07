Feature: Validactiones de la pagina de Nasa APIs

#  Background: Load main page


#  Scenario: Cargar Pagina PHP Travels
#    Given I load PHP travels
#    And set my credencials  on 'Login' page
#    And click 'Cars' link on 'Left Panel' page
#    And click 'Logout' button on 'Header' page

  Scenario: Comparar links response en la pagina de "Nasa APIs"
    Given I load Nasa APIS Page
      And click "NASA APIs Listing" link on left panel
      And click "NASA APIs Listing" link once again
      And click "Earth" link
      And click on "Gallery" from sub menu
      Then Compare with with the text from "GET https://api.nasa.gov/planetary/earth/imagery" if they are equals


#  Scenario Outline: Validar "Login" label en la pagina de LOGIN multiples scenarios
#    Given I load PHP travels
#      And fill "<email>" email field on 'Login' page
#      And fill "<password>" password field on 'Login' page
#    Then verify the "<login label>" label button is displayed on 'Login' page
#
#    Examples:
#    |email          | password      | login label|
#    |test1@test.com | test1@test.com| LOGIN|
#    |test2@test.com | test2@test.com| LOGIN|

#  Scenario Outline: Validar "Login" label en la pagina de LOGIN multiples scenarios 2
#    Given I load PHP travels
#      And fill "<email>" email field on 'Login' page
#      And fill "<password>" password field on 'Login' page
#    Then verify the "<login label>" label button is displayed on 'Login' page
#
#    Examples:
#    |email          | password      | login label|
#    |test3@test.com | test3@test.com| LOGIN|

#  Scenario: Reading entries
#    Given I load PHP travels
#    And fill email field using json file on 'Login' page
