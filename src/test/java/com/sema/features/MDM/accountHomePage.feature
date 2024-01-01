@regression
Feature: Account Management Test Cases- Event Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    Given The user is on the Account item home page
    And   The User gets the current URL and stores it in "itemType=Account"

  Scenario: Create Account on Fletum with invalid family
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    And   The User clicks on the ROOT  element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario:Account Verify export button
    When  The user clicks on Export button

  Scenario Outline: Account Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|
      |250|

  Scenario: Account Home Page Reset Button Control
    And The user enters "test2123" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Account Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Account Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:Account Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:Account Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:Account Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:Account Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:Account Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario:Account Home Page Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable

  Scenario: Account page edit verify
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button

  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks cancel button
    And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
     #  |Approved     |

  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Approved     |

  Scenario:Account edit -Preview Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Preview" tab

  Scenario:Account edit -Campaign-Account Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Campaign-Account" tab

  Scenario:Account edit -Product-Account Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab

  Scenario:Account edit - Product-Account Tab Associated
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Account edit -My Contact Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "My Contact" tab

  Scenario:Account edit -ReservationData Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ReservationData" tab

  Scenario:Account edit -Point History Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Point History" tab

  Scenario:Account edit -Invoice Data Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Invoice Data" tab

  Scenario:Account edit -Order Data View Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "OrderDataView" tab

  Scenario:Account edit -Training View Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Training View" tab

  Scenario:Account edit - Guest Data View Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Guest Data" tab

  Scenario:Account edit - VisitTransaction View Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "VisitTransaction" tab

  Scenario:Account edit -InvoiceTransaction Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "InvoiceTransaction" tab

  Scenario:Account edit -Nexio Data Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "NexioData" tab

  Scenario:Account edit -Sales Order Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "SalesOrder" tab

  Scenario:Account edit -Account Asset Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-Asset" tab


  Scenario:Account edit -Account-MRP Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab

  Scenario:Account edit -Event-Location Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Event-Location" tab

  Scenario:Account edit -Account Financial Account Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ACCOUNT_FINANCIALACCOUNT" tab


  Scenario:Account edit -Categories Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab

  Scenario:Account edit -History Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:Account edit - My Account Tab Associated
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Campaign-Account" tab
    And The user Assocaited All filter
    And The user clicks item
   And the user clicks on unsaved change button
   And The user enters "-------" in  comment area
   And The user clicks save button
 #  And the user verifies item status success message

  Scenario:Account edit - My Contacts Tab Associated Filter No
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Campaign-Account" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:Account edit -Preview Tab Export Button
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Preview" tab
    And The user clicks Export PDF button
    Then The user verifies the file is downloaded

  Scenario:Account edit -Preview Tab Refresh  Button
    And  The user enters "semaaa" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks "Preview" tab
    And  The user clicks Refresh button
    Then The user verifies refresh button


