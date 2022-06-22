$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/nihal/IdeaProjects/Cucumber-selenium/Features/ContactUs.feature");
formatter.feature({
  "name": "Contact Us Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Contact Us scenario with different set of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to contact us page",
  "keyword": "Given "
});
formatter.step({
  "name": "user fills the form from given sheetname \"\u003cSheetName\u003e\" and rownumber \u003cRowNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on send button",
  "keyword": "And "
});
formatter.step({
  "name": "it shows a successful message \"Your message has been successfully sent to our team.\"",
  "keyword": "And "
});
formatter.step({
  "name": "the browser is closed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "contactus",
        "0"
      ]
    },
    {
      "cells": [
        "contactus",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Contact Us scenario with different set of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to contact us page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsSteps.user_navigates_to_contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the form from given sheetname \"contactus\" and rownumber 0",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsSteps.user_fills_the_form_from_given_sheetname_and_rownumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on send button",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.user_clicks_on_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it shows a successful message \"Your message has been successfully sent to our team.\"",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.it_shows_a_successful_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.the_browser_is_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Contact Us scenario with different set of data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to contact us page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsSteps.user_navigates_to_contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the form from given sheetname \"contactus\" and rownumber 1",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsSteps.user_fills_the_form_from_given_sheetname_and_rownumber(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on send button",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.user_clicks_on_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it shows a successful message \"Your message has been successfully sent to our team.\"",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.it_shows_a_successful_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the browser is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.the_browser_is_closed()"
});
formatter.result({
  "status": "passed"
});
});