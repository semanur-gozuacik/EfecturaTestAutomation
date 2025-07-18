@regression
Feature: Financial Account Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Financial Account item home page
    And   The User gets the current URL and stores it in "itemType=FinancialAccount"

  Scenario:Financial Account Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario:Financial Account Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:Financial Account Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario Outline: Financial Account Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 10 Entries  |
      | 25 Entries  |
      | 50 Entries  |
      | 100 Entries |

  Scenario:Financial Account Reset Button Control
    And The user enters "NoMask" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario:Financial Account Verify Label Filter - Valid Label
    And The user enters "FinancialAccount_06" into "Label" filter text input box
    Then The user verify "Label" text filter with value "FinancialAccount_06" in "overviewTable"

  Scenario: Financial Account Verify Label Filter - Invalid  Label
    And The user enters "44444" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario:Financial Account Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_previous" button is "Passive"

  Scenario:Financial Account  User Permission Verify Previous Page Button clickable Condition
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_previous" button is "Active"

  Scenario::Financial Account   EVENT_CONTACT Tab
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Deposit" tab

  Scenario:Event edit - Account_Deposit Tab Associated
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Deposit" tab
    And The user Assocaited All filter


  Scenario:Event edit Account_Deposit Tab Associated Filter No
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Deposit" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario Outline: :Financial Account   Associated Tab Status Fılter "<Status>"
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks "Account_Deposit" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |


  Scenario::Financial Account   EVENT_CONTACT Tab
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario::Financial Account   EVENT_CONTACT Tab
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario::Financial Account   EVENT_CONTACT Tab
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Attributes" tab


  Scenario: Financial Account  Export Entity Button - Attributes
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: Financial Account  Export Entity Button - Associations
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: :Financial Account   Entity Button - Permission
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario::Financial Account   EVENT_CONTACT Tab
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account-Financial Account" tab

  Scenario Outline: :Financial Account   Associated Tab Status Fılter "<Status>"
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks "Account-Financial Account" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |

  Scenario:Event edit Account_Deposit Tab Associated Filter No
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account-Financial Account" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario: Account Export Entity Button - Attributes
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: Account Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns

  Scenario:  Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns

  Scenario:Contact edit -Event-Contact Tab
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Deposit" tab

  Scenario:Contact edit - Event-Contact Tab Associated
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Deposit" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Contact edit -Event-Contact Tab Associated Filter No
    And The user enters "FinancialAccount_06" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Account_Deposit" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"