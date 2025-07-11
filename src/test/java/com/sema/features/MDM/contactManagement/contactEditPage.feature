@regression
Feature: Contact Management Test Cases- Contact Edit Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Contact item home page
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    When The user open side accordion in overview
    When The user clicks on Contact  category
    When The user selects "Contact" as main category
    And The user enters "5071245698" into "Code" filter text input box
    And The user clicks on edit button in table
    Then The user verify Edit Page
    And The user select ItemStatus as "<ItemStatus>"
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears
    And The user verify item status is "<ItemStatus>" on item with code "5071245698"
    Examples:
      | ItemStatus |
      | Active     |
      | Passive    |
      | Approved   |


  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    When The user open side accordion in overview
    When The user clicks on Contact  category
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    Then The user verify Edit Page
    And The user select ItemStatus as "<ItemStatus>"
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks cancel button in edit item save modal
    And The user verify item status is not "<ItemStatus>" on item with code "semaotomasyon"
    Examples:
      | ItemStatus |
      | Passive    |
      | Active     |
      #|Approved   |

  Scenario: Edit item added list
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks list drop down button
    And  The user clicks new list item-contact
  #  Then The user verifies item is added

  Scenario: Edit item removed list
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks removed button
    #Then The user verifies item is removed

  Scenario:Contact Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    #And  The user verifies previous button is not clickable asset

  Scenario:Contact Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_previous" button is "Passive"

  Scenario:Contact Group Permission Verify Item next Button clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_next" button is "Active"

  Scenario:Contact Group Permission Verify Previous Page Button clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_previous" button is "Active"

  Scenario:Contact Group Permission Verify Last Page Button clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "LastPage" button is "Active"

  Scenario:Contact Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "LastPage" button is "Passive"

  Scenario:Contact Group Permission Verify Item next Button unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "_next" button is "Passive"

  Scenario:Contact Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
   # And  The user verifies first page button is clickable asset

  Scenario:Contact User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "FirstPage" button is "Passive"

  Scenario:Contact User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "_previous" button is "Passive"

  Scenario:Contact User Permission Verify Item next Button clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_next" button is "Active"

  Scenario:Contact User Permission Verify Previous Page Button clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_previous" button is "Active"


  Scenario:Contact User Permission Verify Last Page Button clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "LastPage" button is "Active"

  Scenario:Contact User Permission Verify Last Page Button Unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "LastPage" button is "Passive"

  Scenario:Contact User Permission Verify Item next Button unclickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "_next" button is "Passive"

  Scenario:Contact User Permission Verify Item First Page Button Clickable Condition
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "FirstPage" button is "Active"

  Scenario:Contact edit -Preview Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Preview" tab
    Then The user verifies preview tab details is displayed

  Scenario:Contact edit -Item Comment Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:Contact edit - ACCOUNT_CONTACT Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Contact" tab

  Scenario:Contact edit -  ACCOUNT_CONTACT Tab Associated
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Contact edit -  ACCOUNT_CONTACT Tab Associated Filter No
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Contact" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Contact edit - Gift Contact Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Gift Contact" tab

  Scenario:Account edit - Gift Contact Tab Associated
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Gift-Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Contact edit - Gift Contact Tab Associated Filter No
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Gift-Contact" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Contact edit - Categories Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:Contact edit - History Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario:Contact edit - Vanue-Contact Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Venue-Contact" tab

  Scenario:Contact edit - Vanue-Contact Tab Associated
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Venue-Contact" tab
    And The user Assocaited All filter
      # And The user clicks item
       #And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks save button
      # And the user verifies item status success message

  Scenario:Contact edit - Vanue-Contact Tab Associated Filter No
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Venue-Contact" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Contact edit -Attributes Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Attributes" tab

  Scenario:Contact edit - CAMPAIGN_CONNCTT Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Campaign- Contact" tab

  Scenario:Contact edit - CAMPAIGN_CONNT Tab Associated
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Campaign- Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Contact edit -CAMPAIGN_CONNT Tab Associated Filter No
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Campaign- Contact" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Contact edit -Event-Contact Tab
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event-Contact" tab

  Scenario:Contact edit - Event-Contact Tab Associated
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event-Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Contact edit -Event-Contact Tab Associated Filter No
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event-Contact" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Contact edit -Preview Tab Export Button
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Preview" tab
    And The user clicks Export PDF button
    Then The user verifies the file is downloaded

  Scenario:Contact edit -Preview Tab Refresh  Button
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks "Preview" tab
    And  The user clicks Refresh button
    Then The user verifies refresh button

  Scenario: Contact Export Entity Button - Attributes
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: Contact Export Entity Button - Associations
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: Contact Export Entity Button - Permission
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario Outline: Campaign-Account Associated Tab Status Fılter "<Status>"
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks "Event-Contact" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |
