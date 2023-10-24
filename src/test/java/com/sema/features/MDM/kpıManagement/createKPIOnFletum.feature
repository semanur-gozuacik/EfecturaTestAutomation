@semoli
Feature: KPI Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the KPI Management element
    And   The User performs a mouseover on the KPI element
    And   The User clicks on the KPI element
    And   The User gets the current URL and stores it in "itemType=KPI#"
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field

  Scenario: Create Contact on Fletum with invalid family
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    And   The User clicks on the ROOT element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create Contact on Fletum without Categories-EKOSYSTEM
    And   The User presses the down arrow key and then presses Enter in the "KPI" element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "Please choose categories" text with a timeout of 120 seconds

