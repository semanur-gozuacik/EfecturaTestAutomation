
Feature: Contact Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Contact Management element
    And   The User performs a mouseover on the Contact element
    And   The User clicks on the Contact element
    And   The User gets the current URL and stores it in "itemType=Contact"
@semaosdıjf
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

  Scenario: Deleting an item and accepting the popup message-invalid authentication
    And The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Delete
    And The user accepts the popup message
    Then The user should see the message

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
@semali
    Scenario Outline: Verify "<starFeature>" visibility and badge count
      Then The user verifies that "<starFeature>" is visible
      Given The user clicks "<starFeature>"
      And The user verifies that the badge count for feature is correct
      Examples:
      |starFeature   |
     # |My Partners   |
     |My Events     |
      #|My Contacts   |

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
    And  The user verifies next button is not clickable

  Scenario: Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario: Verify Last Page Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies last page button is not clickable

  Scenario: Verify the redirection to the My Partners page
    Then The user verifies that " My Partners" is visible
    Given The user clicks " My Partners"
    And   The User gets the current URL and stores it in "ItemType=Account&isFavorite=true"

  Scenario: Verify the redirection to the My Contacts page
    Then The user verifies that " My Contacts" is visible
    Given The user clicks " My Contacts"
    And   The User gets the current URL and stores it in "ItemType=Contact&isFavorite=true"

  Scenario: Verify the redirection to the My Event page
    Then The user verifies that " My Events" is visible
    Given The user clicks " My Events"
    And   The User gets the current URL and stores it in "ItemType=Event&isFavorite=true"
