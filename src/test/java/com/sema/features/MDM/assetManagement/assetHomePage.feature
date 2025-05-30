@regression
Feature: Asset Management Test Cases- Asset Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Given The user is on the Asset item home page
    And   The User gets the current URL and stores it in "itemType=Asset"

  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "TEST123456" into "Code" filter text input box
#    And the user clicks on Search button
    Then The user verify "Code" text filter with value "TEST123456" in "overviewTable"

  Scenario:  Verify Code Filter -Valid Unique Code partial
    And The user enters "TEST" into "Code" filter text input box
    Then The user verify "Code" text filter with value "TEST" in "overviewTable"

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into "Code" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Verify Label Filter - Valid Label
    And The user enters "TEST12345" into "Label" filter text input box
    Then The user verify "Label" text filter with value "TEST12345" in "overviewTable"

  Scenario: Verify Label Filter - Partial Label
    And The user enters "test" into "Label" filter text input box
    Then The user verify "Label" text filter with value "test" in "overviewTable"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Create List- cancel button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    # And  The user enters "_5458429214" Can view
   #  And  The user enters "1757483988_5392786463" Can edit
     And The user clicks cancel button-New List
     Then The user verifies "otomasyon" is not visible

  Scenario: Create List- create button
    And  The user clicks plus icon
     Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    # And  The user enters "_5458429214" Can view
    #  And  The user enters "1757483988_5392786463" Can edit
    # And The user clicks create button-New List
     # Then The user verifies "otomasyon" is visible

  Scenario: Create List- create button-exist user
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "Sematestyeni" List Name
   #  And  The user enters "_5458429214" Can view
     #And  The user enters "1757483988_5392786463" Can edit
    # And  The user clicks create button-New List
  #   Then The user verifies error message "USER_LIST_ALREADY_EXISTS" is displayed

  Scenario: Create List- delete list-cancel button
     And The user selects deleted element-asset
   #  And The user clicks cancel button in delete popup-asset
  #   Then The user verifies "otomasyon" is visible

  Scenario: Create List- delete list
     And The user selects deleted element-asset
      #And The user clicks cancel button in delete popup-asset
    # And The user clicks delete button in delete popup
     # Then The user verifies "otomasyon" is not visible


  Scenario:Asset Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Asset Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:Asset Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:Asset Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:Asset Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:Asset Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:Asset Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario:Asset Home Page Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable

  Scenario: Verify export button
    When  The user clicks on Export button
   # Then  The user verify that the export was "Success"

  Scenario Outline: Asset Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|


  Scenario: Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And the user clicks on Reset button
#    And the user verify Reset button functionality
    And The user verify Reset button func for "Code" filter

