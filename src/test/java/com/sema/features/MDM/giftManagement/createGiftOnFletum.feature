Feature: Gift Creation and Management
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Gift Management element
    And   The User performs a mouseover on the Gift element
    And   The User clicks on the Gİft element
    And   The User gets the current URL and stores it in "itemType=Gift"
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    #And The user enters the same random string into the "2027" input field
    #And     And The user waits for the "2027" input field to be visible
    #And  The User presses the down arrow key and then presses Enter in the Choose Family element
@regression
  Scenario: Create Gift on Fletum with invalid family
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    Then   The User waits until the ROOT element in the gift is visible with a timeout of 120 seconds
    And   The User clicks on the TEST element
    And   The User clicks on the createButton element
    Then   The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create Contract on Fletum without Categories
    And The User presses the down arrow key and then presses Enter in the Gift Family element
    And The user clicks the "XGift_TYPE" dropdown
    And The user enters a XGIFT_NAME "sematest" input fields
    And The user enters a XGIFT_PERCENT 5.2 input fields
    And The user enter a XGIFT_COST 4.5 input fiels
    And The user enter a Start Date input 03.05.2023 fiels
    And The user enter a And Date 02.10.2023 input fiels
    And The User clicks on the createButton element
    Then The User waits until the page contains "Please choose categories" text with a timeout of 120 seconds
