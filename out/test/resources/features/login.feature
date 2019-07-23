Feature: Validactiones de la pagina de Login

  Scenario: Cargar Pagina PHP Travels
    Given I load PHP travels
    And set my credencials  on 'Login' page
#    And click 'Cars' link on 'Left Panel' page

  Scenario: Validar "Login" label en la pagina de LOGIN
    Given I load PHP travels
      And fill "test@test.com" email field on 'Login' page
      And fill "test@test.com" password field on 'Login' page
    Then verify the "Login" label button is displayed on 'Login' page
