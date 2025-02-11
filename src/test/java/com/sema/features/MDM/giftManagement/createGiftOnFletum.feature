@regression
Feature: Gift Creation and Management
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Gift item home page
    And   The User gets the current URL and stores it in "itemType=Gift"

  Scenario: Create Gift on Fletum invalid
    And   The User clicks on the Categories element
    Then   The User waits until the ROOT element in the gift is visible with a timeout of 120 seconds
    And   The User clicks on the TEST element
   # Then   The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

