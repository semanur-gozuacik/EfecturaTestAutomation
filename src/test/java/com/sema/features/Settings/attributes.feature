@regression
Feature: Attributes Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    #isimlendirme değişecek
#    Then  The User waits until the System element is visible with a timeout of 120 seconds
    Given The user on the settings attribute page
    And   The User gets the current URL and stores it in "Settings/Attributes"

  Scenario: Attributes pages tables verification
    Then The User verifies Attributes page table is displayed


  Scenario: Attributes pages -Reset Button Control
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user reset the basic filters
    And the user verify Reset button functionality-Settings Attibutes

  Scenario:Attributes pages Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "FirstPage" button is "Passive"

  Scenario:Attributes pages Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_previous" button is "Passive"

  Scenario:Attributes pages Group Permission Verify Item next Button clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_next" button is "Active"

  Scenario:Attributes pages Group Permission Verify Previous Page Button clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_previous" button is "Active"

  Scenario:Attributes pages Group Permission Verify Last Page Button clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "LastPage" button is "Active"

  Scenario:Attributes pages Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "LastPage" button is "Passive"

  Scenario:Attributes pages Group Permission Verify Item next Button unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "_next" button is "Passive"

  Scenario:Attributes pages Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "FirstPage" button is "Active"

  Scenario:Attributes pages User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "FirstPage" button is "Passive"

  Scenario:Attributes pages User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "_previous" button is "Passive"

  Scenario:Attributes pages User Permission Verify Item next Button clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_next" button is "Active"

  Scenario:Attributes pages User Permission Verify Previous Page Button clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_previous" button is "Active"

  Scenario:Attributes pages User Permission Verify Last Page Button clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "LastPage" button is "Active"

  Scenario:Attributes pages User Permission Verify Last Page Button Unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "LastPage" button is "Passive"

  Scenario:Attributes pages User Permission Verify Item next Button unclickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "_next" button is "Passive"

  Scenario:Attributes pages User Permission Verify Item First Page Button Clickable Condition
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "FirstPage" button is "Active"


  Scenario Outline:Attributes Page-User selects different options for show entries
#    When  The user selects "<entries>" into show entries attributes
    When The user select "<entry>" in table show entry select
#    Then  The user should see  "<entry>" entrie in everypage attributes
#    Then The user verifies that table contains right rows according to "<length>" in Currencies
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 10 Entries  |
      | 25 Entries  |
      | 50 Entries  |
      | 100 Entries |

  Scenario:Attributes Export Button
    Then The user export button attributes

  Scenario Outline: Attributes All Item Types
    Then The user  "<families>"
   Examples:
   |families|
    |Product|
    |All Item Pages|

  Scenario Outline: Attributes AttributesGroups
    Then The user  "<AttributesGroups>"
    Examples:
    |AttributesGroups|
      |FileGropus|
      |AttributesGroups|

  Scenario Outline: Attributes filter
    Then The user  "<filter>"
    Examples:
      |filter|
      |Yes|
      |No|

  Scenario Outline: Attributes localizable filter
    Then The user  "<localizable>"
    Examples:
      |localizable|
      |Yes|
      |No|

  Scenario:Attributes pages Properties tab Transaction
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user properties tab Transaction


  Scenario:Attributes pages Properties tab generalPropertiesTab
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user properties tab generalPropertiesTab

  Scenario:Attributes pages Properties tab Validation_Rules
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The user properties tab Validation_Rules

  Scenario:Attributes pages Properties tab Validation_Rules
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table

  Scenario:Attributes pages  History
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The History Tab


  Scenario:Attributes pages History Reset Button
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The History Tab
    And the user clicks on Reset button attribute edit

  Scenario:Attributes pages History Refresh  Button functionality
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The History Tab
    And the user clicks on Refresh button

  Scenario Outline: Attributes pages selects different options for show entries
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And The user clicks on edit button in table
    And The History Tab
    When  The user selects "<entries>" into show entries edit attribute
    Then  The user should see  "<entries>" entrie in everypage edit attribute
    Examples:
      | entries|
      |10 |
      |25 |
