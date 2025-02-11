@regression
Feature: Contract Management Test Cases
Background:

  When   The User opens the browser with the given url
  And   The User inputs a valid username "validUsername"
  And   The User inputs a valid password "validPassword"
  And   The User clicks the Submit button
  Then   The User waits until the Persons element is visible with a timeout of 15 seconds
  Given The user is on the Contract item home page
  And   The User gets the current URL and stores it in "itemType=Contract"

  Scenario: Create Contract on Fletum with invalid family
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    Then   The User waits until the  ROOT element is visible with a timeout of 120 seconds
    And   The User clicks on the ROOT element
    And   The User clicks on the createButton element
    Then   The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create Contract on Fletum without Categories
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User presses the down arrow key and then presses Enter in the Contract_Family element
    And   The User clicks on the createButton element
    Then   The User waits until the page contains "Please choose categories" text with a timeout of 120 seconds

  Scenario: Cancel Contract creation in Fletum
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User presses the down arrow key and then presses Enter in the Contract_Family element
    And   The User clicks on the Categories element
    Then   The User waits until the  ROOT element is visible with a timeout of 120 seconds
    And   The User clicks on the ROOT element
    And   The User clicks on the cancelButton element
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds

 # Scenario: Create Contract on Fletum with valid credentials
   # And   The User clicks on the createItem element
    #Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    #And   The User inputs the value from cont into the inputCode field
    #And   The User presses the down arrow key and then presses Enter in the Contract_Family element
    #And   The User clicks on the Categories element
    #Then   The User waits until the  ROOT element is visible with a timeout of 120 seconds
   # And   The User clicks on the ROOT element
   # And   The User clicks on the createButton element

  #Scenario: Delete Asset on Fletum with valid credentials - "<Family>"
  #  And  The user enters "199955523515555" into Code field
   # And  the user clicks on Search button
   # And  The user clicks delete button- "<Family>"
    #And  The user clicks delete button in popup
    # Then The User waits until the page contains "Item Deleted Succesfully." with a timeout of 120 seconds-Asset

  Scenario: Contract Home Verify export button
    And The user waits ten seconds
    When  The user clicks on Export button
   # Then  The user verify that the export was "Success"