@regression
Feature: Asset Management Test Case
Background:
  When   The User opens the browser with the given url
  And    The User inputs a valid username "validUsername"
  And    The User inputs a valid password "validPassword"
  And    The User clicks the Submit button
  Given The user is on the Asset item home page
  And   The User gets the current URL and stores it in "itemType=Asset"


  Scenario: Create Asset on Fletum with invalid family
    And   The User clicks on the createItem element
    Given The user waits until the element with id  Infoitem is visible.
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And  The User presses the down arrow key and then presses Enter in the Choose Family element
#    And  The User clicks on the Categories element
    And The user click on 'Categories' tab in create modal
    Then The User waits until the Asset Categories element is visible with a timeout of 120 seconds
#    And   The User clicks on the new node element
    And The user select 'New node' for category in create
#    And   The User clicks on the createButton element
    And The user click on 'Create' button in create modal
#    Then   The User waits until the page contains "EMPTY_FAMILY" with a timeout of 15 seconds
    Then The user verify 'EMPTY_FAMILY' warning


  Scenario: Create Asset on Fletum without Categories
    And   The User clicks on the createItem element
    Given The user waits until the element with id  Infoitem is visible.
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
#    And   The User presses the down arrow key and then presses Enter in the Cooler element
    And The user select family 'Cooler' in create modal
#    And   The User clicks on the createButton element
    And The user click on 'Create' button in create modal
#    Then   The User waits until the page contains "Please choose categories" text with a timeout of 120 seconds
    Then The user verify 'Please choose categories' warning

  Scenario: Cancel Asset creation in Fletum
    And   The User clicks on the createItem element
    Given The user waits until the element with id  Infoitem is visible.
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
#    And   The User presses the down arrow key and then presses Enter in the Cooler element
    And The user select family 'Cooler' in create modal
#    And   The User clicks on the Categories element
    And The user click on 'Categories' tab in create modal
    Then The User waits until the Asset Categories element is visible with a timeout of 120 seconds
#    And   The User clicks on the new node element
    And The user select 'New node' for category in create
#    And   The User clicks on the cancelButton element
    And The user click on 'Cancel' button in create modal
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds

  Scenario: Create Asset on Fletum with valid credentials - "<Family>"
    And   The User clicks on the createItem element
    Given The user waits until the element with id  Infoitem is visible.
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
#    And   The User presses the down arrow key and then presses enter in the "<Family>" element in Asset
    And The user select family 'Cooler' in create modal
#    And  The User clicks on the Categories element
    And The user click on 'Categories' tab in create modal
    And  The User clicks on the Asset Categories element
#    And  The User clicks on the new node element
    And The user select 'New node' for category in create
#    And  The User clicks on the createButton element
    And The user click on 'Create' button in create modal
#    Examples:
#      |Family|
#      |Cooler|


Scenario Outline: Delete Asset on Fletum with valid credentials - "<Family>"-cancel button
#  And  The user enters "199955523515555" into Code field
  And The user enters "199955523515555" into "Code" filter text input box
#  And  the user clicks on Search button
  And  The user clicks delete button- "<Family>"
  And  The user clicks cancel button in popup
  Examples:
    |Family|
    |Cooler|

  Scenario Outline: Delete Asset on Fletum with valid credentials - "<Family>"
#    And  The user enters "199955523515555" into Code field
    And The user enters "199955523515555" into "Code" filter text input box
#    And  the user clicks on Search button
    And  The user clicks delete button- "<Family>"
    And  The user clicks delete button in popup
#    Then The User waits until the page contains "Item Deleted Succesfully." with a timeout of 120 seconds-Asset
    Then The user verify 'Item Deleted Succesfully.' warning
    Examples:
      |Family|
      |Cooler|


