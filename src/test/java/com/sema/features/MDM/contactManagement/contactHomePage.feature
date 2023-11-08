@regression
Feature: Contact Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Contact Management element
    And   The User performs a mouseover on the Contact element
    And   The User clicks on the Contact element
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario: Contact category functionality check
        And The user clicks on Contact  category
        And The user verifies that the codes shown in the Contact label filter are contact categories

   Scenario:Contact category - subcategory New Node functionality check
     And The user clicks on New node
     And The user verifies that the codes shown in the New Node label filter are contact categories

  Scenario: Contact category - subcategory Unassigned Records functionality check
    And The user clicks on Unassigned Records Category category
    And The user verifies that the codes shown in the Unassigned label filter are contact categories

  Scenario: Verify Code Filter -Valid Unique Code
    And The user clicks on Contact  category
    And The user enters "test2123" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality "Test2123"

  Scenario:  Verify Code Filter -Valid Unique Code
    And The user clicks on Contact  category
    And The user enters "test" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality with partial unique code "Test"

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user clicks on Contact  category
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Verify Label Filter - Valid Label
    And The user clicks on Contact  category
    And The user enters "test2123" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test2123"

  Scenario: Verify Label Filter - Partial Unique Code
    And The user clicks on Contact  category
    And The user enters "test" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"
@semaaaaaa
  Scenario: Search for Ekosystem Family
    And The user clicks on Ekosystem Filtre
    And the user clicks on Search button
    And the user verify on family filter Ekosystem functionality

  Scenario: Search for IWSA Family
    And The user clicks on IWSA Filtre
    And the user clicks on Search button
    And the user verify on family filter IWSA functionality

  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
    And the user clicks on Search button
    And the incoming filter for "<ItemStatus>" should contain
    Examples:
    |ItemStatus |
    |Active     |
    |Passive    |
    |Approved   |

    Scenario: Reset Button Control
      And The user clicks on Contact  category
      And The user enters "test2123" into Code field
      And The user clicks on Ekosystem Filtre
      And the user clicks on Reset button
      And the user verify Reset button functionality

  Scenario: Deleting an item and declining the popup message
    And The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Delete
    And The user declines the popup message
    Then The user verify that "sematestttt" is visible

  Scenario Outline: User selects different options for show entries
    Given The user clicks show entries button
    When  The user selects "<entrie>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
    | entries|
    |10 |
    #|25 |
    #|50 |
    #|100|

  Scenario: Contact page edit verify
    And The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    Then The user verify Edit Page

    Scenario Outline: Verify "<starFeature>" visibility and badge count
      Then The user verifies that "<starFeature>" is visible
      Given The user clicks "<starFeature>"
      And The user verifies that the badge count for feature is correct
      Examples:
      |starFeature   |
    #|My Partners   |
     |My Events     |
      |My Contacts   |

  Scenario: Verify My Count Star Item Functionality- One Contact
    And The user clicks on Contact  category
    And The user enters "sema" into Code field
    And the user clicks on Search button
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario: Verify My Count Star Items Functionality- more than One Contact
    And The user clicks on Contact  category
    And The user enters "test" into Code field
    And the user clicks on Search button
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario: Verify export button
    When  The user clicks on Export button
    Then  The user verify that the export was "Success"
   # And   The user verify that the file is located in the downloads folder
    #And   The user verify that the file is in the correct format

  Scenario: Verify Item Previous Button Unclickable Condition
    And  The user verifies previous button is not clickable

  Scenario: Verify Item next Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies next button is not clickable

  Scenario: Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario: Verify Last Page Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies last page button is not clickable

  Scenario: Verify the redirection to the My Contacts page
    Then The user verifies that "My Contacts" is visible
    Given The user clicks "My Contacts"
    And   The User gets the current URL and stores it in "ItemType=Contact&isFavorite=true"

  Scenario: Verify the redirection to the My Event page
    Then The user verifies that "My Events" is visible
    Given The user clicks "My Events"
    And   The User gets the current URL and stores it in "ItemType=Event&isFavorite=true"

  Scenario: Contact Create List- cancel button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    And  The user enters "_5458429214" Can view
    And  The user enters "1757483988_5392786463" Can edit
    And The user clicks cancel button-New List
    Then The user verifies "otomasyon" is not visible

  Scenario:Contact Create List- create button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    And  The user enters "_5458429214" Can view
    And  The user enters "1757483988_5392786463" Can edit
    And The user clicks create button-New List
    Then The user verifies "otomasyon" is visible

  Scenario:Contact Create List- create button-exist user
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    And  The user enters "_5458429214" Can view
    And  The user enters "1757483988_5392786463" Can edit
    And  The user clicks create button-New List
    Then The user verifies error message "USER_LIST_ALREADY_EXISTS" is displayed

  Scenario:Contact Create List- delete list-cancel button
    And The user selects deleted element
    And The user clicks cancel button in delete popup
    Then The user verifies "otomasyon" is visible

  Scenario:Contact Create List- delete list-cancel button
    And The user selects deleted element
    And The user clicks delete button in delete popup
    Then The user verifies "otomasyon" is not visible