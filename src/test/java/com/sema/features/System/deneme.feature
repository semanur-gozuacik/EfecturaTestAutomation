Feature: ffff

  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    Given The user is on the Users item home page
    And   The User gets the current URL and stores it in "itemType=MRP"

  Scenario: asd
    When user get column data