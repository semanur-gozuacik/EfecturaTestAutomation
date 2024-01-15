@regression
Feature: Account Management Test Cases- Account Home Page
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
@semosos
  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
   # And the user clicks on unsaved change button
   # And The user enters "-------" in  comment area
  #  And The user clicks cancel button
    #And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
     #  |Approved     |
@semosos
  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
   # And the user clicks on unsaved change button
   # And The user enters "-------" in  comment area
   # And The user clicks save button
   # And the user verifies item status success message

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

  Scenario:Account edit -Product-Account Tab Associated Filter No
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:Account edit -My Contact Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ACCOUNT_CONTACT" tab

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
  @semamuss
  Scenario:Account edit -Account-Asset Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-Asset" tab

  Scenario:Account edit - Account_CONTACT Tab Associated
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ACCOUNT_CONTACT" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Account edit -Account-MRP Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account MRP" tab

  Scenario:Account edit - Account-MRP Tab Associated
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account MRP" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Account edit -Account-MRP Tab Associated Filter No
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account MRP" tab
    And The user Assocaited No filter
    Then The user verify No Filter


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

  Scenario:Account edit - Campaign-Account Tab Associated
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

  Scenario:Account edit - Campaign-Account Tab Associated Filter No
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

  Scenario:Account Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Account User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies first page button is not clickable user

  Scenario:Account edit -Item Comment Tab
    And The user enters "semaaa" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ItemComment" tab

    Scenario: Account Associated Tab Associated On Fılter
      And The user enters "6193135977" into Code field
      And the user clicks on Search button
      And  The user clicks on Edit Button
      And The user clicks "Account MRP" tab
      And The user clicks Associated on filter
     And  The user enters "09.01.2024" info from field
      And The user enters "09.01.2024" info to field
      And The user clicks update button
     Then The user verifies that associated on filter functionality

  Scenario: Account Associated Tab Label Filter Functionality
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user clicks on Label Filter
  #   And The user enters "test_umit"
    Then The user verifies that labet filter functionality

  Scenario: Account Associated Tab Families  Fılter
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
   And The user associated selects "System Product" families filter
    Then The user verifies that families filter functionality

  Scenario Outline: Account Associated Tab Status Fılter "<Status>"
    And The user enters "9932988664" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks "Product-Account" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
    |Status|
    |Status:All|
    |Enabled   |
    |Disabled  |

  Scenario: Account Associated Tab Code Filter Functionality
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user clicks on code filter Filter
   #  And The user enters "test_umit"
    Then The user verifies that code filter functionality

  Scenario: Account Associated Tab Code Filter Functionality
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user clicks on code filter Filter
    # And The user enters "test_umit"
    And  The user clicks Reset button
    Then The user verifies that code filter reset button functionality

  Scenario: Account Associated Tab Code Filter Functionality
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user clicks on code filter Filter
   #  And The user enters "test_umit"
    And  The user clicks Reset button
    Then The user verifies that code filter reset button functionality

  Scenario Outline: Campaign-Account Associated Tab Status Fılter "<Status>"
    And The user enters "9932988664" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks "Campaign-Account" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |

  Scenario:Account Campaign-Account Associated Tab Code Filter Functionality
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Campaign-Account" tab
    And The user clicks on code filter Filter
    # And The user enters "1310202301"
    Then The user verifies that code filter functionality

  Scenario: Account Associated Tab Fixed Point Filter Functionality
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product-Account" tab
    And The user clicks on Fixed Point  Filter
     #And The user enters "1500"
    Then The user verifies that Fixed Point filter functionality

  Scenario: Account Export Entity Button - Attributes
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: Account Export Entity Button - Associations
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: Account Export Entity Button - Permission
    And The user enters "9932988664" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies
