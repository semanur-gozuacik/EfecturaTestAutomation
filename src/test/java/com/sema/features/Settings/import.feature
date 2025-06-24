@regression
Feature: Import Management Test Cases

  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
#    Then  The User waits until the System element is visible with a timeout of 120 seconds
#    And   The User performs a mouseover on the System element symbol
    Given The user on the settings ımport page
    And   The User gets the current URL and stores it in "Import"
    And The user accepts the popup OK

  Scenario: Import pages tables verification
    Then The User verifies import page table is displayed

  Scenario: Reset Button Control
    And The user enters "Oge Turleri" into "Name" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Name" text filter

  Scenario Outline:Import Page-User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |

  Scenario: Refresh Button Control
    Then The user verifies that Refresh button is active

  Scenario: Name Filter Control
    And The user clicks name button
    And The user "Account" code field
    And The User verifies that name filter results contains "Account"

  Scenario Outline:Import Page-Select status
    When  The user selects "<select status>" into select status
    Then  The user should see  "<select status>"  import select status
    Examples:
      | select status |
      | Completed     |
      | Progress      |
      | Uploaded      |
      | Failed        |

  Scenario: User Filter Control
    And The user clicks user filter
    And The user "test" user field
    And The user verifies user filter

  Scenario: Username Filter Control
    And The user clicks username button
    And The user "Efectura" username field
    And The user verifies username filter import


  #------------------------------------------AccountCallback----------------------------------------------------#

  Scenario: AccountCallback - Point Adding
    When The user update excel with point "300" and endDate "19-11-2028"
    When The user update excel with TransactionType "earning"
    When The user update excel with TaskId "53550"
    When The user select "AccountCallback" for importType
    When The user upload "AccountCallback" file
    When The user import the uploaded file
    Then The user verifies that one earning is added to point history

  Scenario: AccountCallback - Point Delete
    When The user update excel with point "-120" and endDate ""
    When The user update excel with TransactionType "earning"
    When The user update excel with TaskId "53550"
    When The user select "AccountCallback" for importType
    When The user upload "AccountCallback" file
    When The user import the uploaded file
    Then The user verifies that one earning is added to point history

  Scenario: AccountCallback - Redemption
    When The user update excel with point "-120" and endDate "20-03-2026"
    When The user update excel with TransactionType "Redemption"
    When The user update excel with TaskId "294841"
    When The user select "AccountCallback" for importType
    When The user upload "AccountCallback" file
    When The user import the uploaded file
    Then The user verifies that one earning is added to point history

  Scenario: ResourceTranslations
    When The user select "ResourceTranslations" for importType
    When The user upload "ResourceTranslations" file
    When The user import the uploaded file
    Then The user verifies that the "ResourceTranslations" added to Resources
    Then The user tear down changes in resources

  Scenario: Contact Case
    When The user update "Contact" excel with random "SKU" in index 1
    When The user select "Contact" for importType
    When The user upload "Contact" file
    When The user import the uploaded file
#    Then The user verifies that the "Contact" is created
#    Then The user verifies that the "Contact" is associated with stated account
#    Then The user tear down all changes in Contact Case

  Scenario: Account Case
    When The user update "Account" excel with random "SKU" in index 1
    When The user select "Account" for importType
    When The user upload "Account" file
    When The user import the uploaded file
    Then The user verifies that the "Account" is created
    Then The user tear down all changes in Account Case

  Scenario: Association - Account_MRP
    When The user select "Association" for importType
    When The user upload "Association" file
    When The user import the uploaded file
    Then The user verifies that the "Account" is associated with the "MRP"
    Then The user tear down all changes in Association Case

  Scenario: Attribute Case
    When The user select "Attribute" for importType
    When The user upload "Attribute" file
    When The user import the uploaded file
    Then The user verifies that attributes are created
    Then The user tear down all changes in Attribute Case

  Scenario: DynamicEdit - Account
    When The user update "AccountEdit" excel with random "Account_Name" in index 2
    When The user select "DynamicEditItemImport" for importType
    When The user upload "AccountEdit" file
    When The user import the uploaded file
    Then The user verifies that attribute is edited
      | Attribute Label | Account Name |
      | File Name       | AccountEdit  |
      | Column Name     | Account_Name |

  Scenario: DynamicEdit - Contact
    When The user update "ContactEdit" excel with random "DIA_Assistant_Name" in index 2
    When The user select "DynamicEditItemImport" for importType
    When The user upload "ContactEdit" file
    When The user import the uploaded file
    Then The user verifies that attribute is edited
      | Attribute Label | Assistant Name     |
      | File Name       | ContactEdit        |
      | Column Name     | DIA_Assistant_Name |


  Scenario: DynamicEdit - Event
    When The user update "EventEdit" excel with random "DIA_Event_Name" in index 2
    When The user select "DynamicEditItemImport" for importType
    When The user upload "EventEdit" file
    When The user import the uploaded file
    Then The user verifies that attribute is edited
      | Attribute Label | Event Name     |
      | File Name       | EventEdit      |
      | Column Name     | DIA_Event_Name |


  Scenario: DynamicEdit - User
    When The user update "UserEdit" excel with random "ebMobile__UserCode__c" in index 2
    When The user select "DynamicEditItemImport" for importType
    When The user upload "UserEdit" file
    When The user import the uploaded file
    Then The user verifies that attribute is edited
      | Attribute Label | User Code             |
      | File Name       | UserEdit              |
      | Column Name     | ebMobile__UserCode__c |


  Scenario: DynamicEdit - Product
    When The user update "ProductEdit" excel with random "DIA_P_REFERANS" in index 2
    When The user select "DynamicEditItemImport" for importType
    When The user upload "ProductEdit" file
    When The user import the uploaded file
    Then The user verifies that attribute is edited
      | Attribute Label | Reference      |
      | File Name       | ProductEdit    |
      | Column Name     | DIA_P_REFERANS |


  Scenario: Attribute Option Case
    When The user update "Option" excel with random "Code" in index 1
    When The user select "Option" for importType
    When The user upload "Option" file
    When The user import the uploaded file
    When The user go to attributes page and find the attribute "option_import_automation"
    When The user go into attribute edit page
    When The user clicks Values tab
    Then The user verifies that attribute option is added


  Scenario: Dynamic Import - Event
    When The user update "DynamicEvent" excel with random "Code (Optional)" in index 2
    When The user select "DynamicItemImport" for importType
    When The user select "Event" for itemType and "IWSA" for family
    When The user upload "DynamicEvent" file
    When The user import the uploaded file
    Then The user verifies that the "Event" is created
    Then The user tear down all changes in Account Case



