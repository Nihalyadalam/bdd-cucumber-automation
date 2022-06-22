Feature: Contact Us Feature

  Scenario Outline: Contact Us scenario with different set of data
    Given user navigates to contact us page
    When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on send button
    And it shows a successful message "Your message has been successfully sent to our team."
    Then the browser is closed

    Examples:
      |SheetName|RowNumber|
      |contactus|0|
      |contactus|1|



