@regression
Feature: Attributes Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    #isimlendirme değişecek
    Then  The User waits until the System element is visible with a timeout of 120 seconds
    Given The user on the settings attribute page
    And   The User gets the current URL and stores it in "Settings/Attributes"

  Scenario: Attributes pages tables verification
    Then The User verifies Attributes page table is displayed

@SS
  Scenario: Attributes pages -Reset Button Control
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And the user clicks on Reset button
    And the user verify Reset button functionality-Settings Attibutes

  Scenario:Attributes pages Group Permission Verify Item First Page Button Unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    #And  The user verifies previous button is not clickable asset

  Scenario:Attributes pages Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Attributes pages Group Permission Verify Item next Button clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset

  Scenario:Attributes pages Group Permission Verify Previous Page Button clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario:Attributes pages Group Permission Verify Last Page Button clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario:Attributes pages Group Permission Verify Last Page Button Unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is unclickable asset

  Scenario:Attributes pages Group Permission Verify Item next Button unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies next button is unclickable asset

  Scenario:Attributes pages Group Permission Verify Item First Page Button Clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks group permission tab
    When The user clicks last page button asset
 #   And  The user verifies first page button is clickable asset

  Scenario:Attributes pages User Permission Verify Item First Page Button Unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    And  The user verifies first page button is not clickable user

  Scenario:Attributes pages User Permission Verify Item Previous Page Button Unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    And  The user verifies previous page button is not clickable user

  Scenario:Attributes pages User Permission Verify Item next Button clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    When The user clicks next page button user
    And  The user verifies next button is clickable user

  Scenario:Attributes pages User Permission Verify Previous Page Button clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    When The user clicks next page button user
    When The user clicks next page button user
    When The user clicks previous page button user
    And  The user verifies previous button is clickable user

  Scenario:Attributes pages User Permission Verify Last Page Button clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is clickable user

  Scenario:Attributes pages User Permission Verify Last Page Button Unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is unclickable asset

  Scenario:Attributes pages User Permission Verify Item next Button unclickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies next button is unclickable user

  Scenario:Attributes pages User Permission Verify Item First Page Button Clickable Condition
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies first page button is clickable user


  Scenario Outline:Attributes Page-User selects different options for show entries
    When  The user selects "<entries>" into show entries attributes
    Then  The user should see  "<entries>" entrie in everypage attributes
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|

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
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The user properties tab Transaction


  Scenario:Attributes pages Properties tab generalPropertiesTab
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The user properties tab generalPropertiesTab

  Scenario:Attributes pages Properties tab Validation_Rules
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The user properties tab Validation_Rules

  Scenario:Attributes pages Properties tab Validation_Rules
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes

  Scenario:Attributes pages  History
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The History Tab


  Scenario:Attributes pages History Reset Button
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The History Tab
    And the user clicks on Reset button attribute edit

  Scenario:Attributes pages History Refresh  Button functionality
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The History Tab
    And the user clicks on Refresh button

  Scenario Outline: Attributes pages selects different options for show entries
    And The user clicks "Code" attributes
    And The user enters "Account_Outlet_Code__c" into Code field-Settings Attributes
    And  The user clicks on Edit Button-Attributes
    And The History Tab
    When  The user selects "<entries>" into show entries edit attribute
    Then  The user should see  "<entries>" entrie in everypage edit attribute
    Examples:
      | entries|
      |10 |
      |25 |
