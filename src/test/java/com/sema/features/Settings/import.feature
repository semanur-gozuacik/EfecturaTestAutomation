@regression
Feature: Import Management Test Cases

  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Then  The User waits until the System element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the System element symbol
    Given The user on the settings ımport page
    And   The User gets the current URL and stores it in "Import"
    And The user accepts the popup OK

  Scenario: Import pages tables verification
    Then The User verifies import page table is displayed

  Scenario: Reset Button Control
    And the user clicks on Reset button

  Scenario Outline:Import Page-User selects different options for show entries
    When  The user selects "<entries>" into show entries import
    Then  The user should see  "<entries>" entrie in everypage import
    Examples:
      | entries |
      | 25      |
      | 10      |

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
    When The user update excel with point "300" and endDate "11-11-2024"
    When The user update excel with TransactionType "earning"
    When The user update excel with TaskId "53550"
#    When The user select AccountCallback for importType
    When The user select "AccountCallback" for importType
    When The user upload AccountCallback file
    When The user import the uploaded file
    Then The user verifies that one earning is added to point history

  Scenario: AccountCallback - Point Delete
    When The user update excel with point "-120" and endDate ""
    When The user update excel with TransactionType "earning"
    When The user update excel with TaskId "53550"
#    When The user select AccountCallback for importType
    When The user select "AccountCallback" for importType
    When The user upload AccountCallback file
    When The user import the uploaded file
    Then The user verifies that one earning is added to point history

  Scenario: AccountCallback - Redemption
    When The user update excel with point "-120" and endDate "11-11-2024"
    When The user update excel with TransactionType "Redemption"
    When The user update excel with TaskId "54932"
#    When The user select AccountCallback for importType
    When The user select "AccountCallback" for importType
    When The user upload AccountCallback file
    When The user import the uploaded file
    Then The user verifies that one earning is added to point history

  Scenario: ResourceTranslations
#    When The user select ResourceTranslations for importType
    When The user select "ResourceTranslations" for importType
    When The user upload ResourceTranslations file
    When The user import the uploaded file
    Then The user verifies that the resource added to Resources
    Then The user tear down changes in resources


  Scenario: Contact Case
    When The user update Contact excel with random sku
    When The user select "Contact" for importType
    When The user upload Contact file
    When The user import the uploaded file
    Then The user verifies that the "contact" is created
    Then The user verifies that the contact is associated with stated account
    Then The user tear down all changes in Contact Case


  Scenario: Account Case
    When The user update Account excel with random sku
    When The user select "Account" for importType
    When The user upload Account file
    When The user import the uploaded file
    Then The user verifies that the "account" is created
    Then The user tear down all changes in Account Case


  Scenario: Association - Account_MRP
    When The user select "Association" for importType
    When The user upload Association file
    When The user import the uploaded file
    Then The user verifies that the "Account" is associated with the "MRP"
    Then The user tear down all changes in Association Case


  Scenario: Attribute Case
    When The user select "Attribute" for importType
    When The user upload Attribute file
    When The user import the uploaded file
    Then The user verifies that attributes are created
    Then The user tear down all changes in Attribute Case


