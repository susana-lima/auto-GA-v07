Feature: Validactiones de la pagina de Login

#  Background: Load main page


  Scenario: Test Case 01: CMS-AUTO-01 - Verificar que cuando hacemos clic en "CMS" menú muestra el sub-menú de Page
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'CMS' link on 'Left Panel' page
    And click 'Page' link on 'Left Panel' page
    And click 'Logout' button on 'Header' page



  Scenario: Test Case 02: CMS-AUTO-02 - Verificar que cuando hacemos clic en "FLIGHT BOOKINGS" menú muestra el sub-menú de BOOKINGS.
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'FLIGHT BOOKINGS' link on 'Left Panel' page
    And click 'BOOKINGS' link on 'Left Panel' page
    And click 'Logout' button on 'Header' page



  Scenario: Test Case 03: CMS-AUTO-03 - Verificar que el hover-help del boton edit diga "Edit"
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'CMS' link on 'Left Panel' page
    And click 'Page' link on 'Left Panel' page
    Then Verify that the hover-help of the edit button says Edit





  Scenario: Test Case 04: CMS-AUTO-04 - Verificar que el hover-help del boton eliminar diga "DELETE"
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'CMS' link on 'Left Panel' page
    And click 'Page' link on 'Left Panel' page
    Then Verify that the hover-help of the edit button says DELETE



  Scenario: Test Case 05:CMS-AUTO-05 - Verify that the title of CMS-> Page appears the title CMS MANAGEMENT
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'CMS' link on 'Left Panel' page
    And click 'Page' link on 'Left Panel' page
    Then Verify that the title of CMS-> Page appears the title CMS MANAGEMENT




  Scenario: Test Case 06:Verify that the column title is “Adults” in the FLIGHT BOOKINGS table
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'FLIGHT BOOKINGS' link on 'Left Panel' page
    And click 'BOOKINGS' link on 'Left Panel' page
    Then Verify that the column title is Adults in the FLIGHT BOOKINGS table

  Scenario: Test Case 07:CMS-AUTO-07 - Verify that the column title is “Booking Id” from the FLIGHT BOOKINGS table
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'FLIGHT BOOKINGS' link on 'Left Panel' page
    And click 'BOOKINGS' link on 'Left Panel' page
    Then Verify that the column title is Booking Id in the FLIGHT BOOKINGS table


  Scenario: Test Case 08:CMS-AUTO-08 - Verificar que el titulo de la columna es “Origin” en la tabla FLIGHT BOOKINGS
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'FLIGHT BOOKINGS' link on 'Left Panel' page
    And click 'BOOKINGS' link on 'Left Panel' page
    Then Verify that the column title is Origin in the FLIGHT BOOKINGS table



  Scenario: Test Case 09:CMS-AUTO-09 - Verify that when we click on the “Arrival Date” column the items are sorted.
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'FLIGHT BOOKINGS' link on 'Left Panel' page
    And click 'BOOKINGS' link on 'Left Panel' page
    And click en un field de un item de la columna Arrival Date
    And click 'Logout' button on 'Header' page
   # Then Verify that when we click on the Arrival Date column the items are sorted

