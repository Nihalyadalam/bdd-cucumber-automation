Feature: OrangeHRM Login

  Scenario: presence of logo on OrangeHRM home page
    Given I launch chrome browser
    When I open orange HRM homepage
    Then I verify that the logo present on page
    And enter the email id on the text box
    And close browser


