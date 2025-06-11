@regression
Feature: RoofCard Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the RoofCard item home page
    And   The User gets the current URL and stores it in "itemType=RoofCard"

  Scenario:RoofCard Verify export button
    When  The user clicks on Export button
    #Then  The user verify that the export was "Success"

  Scenario:RoofCard Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstPageTable" button is "Passive"

  Scenario:RoofCard Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "items_previous" button is "Passive"

  Scenario Outline: RoofCard Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |

  Scenario: RoofCard Home Page Reset Button Control
    And The user enters "roofcard" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario:RoofCard Home Page Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
#    And the user clicks on Search button
    And The user verify empty data table info 'No matching records found'

  Scenario:RoofCard Organization edit - Categories Tab
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:RoofCard Organization  edit - Categories Tab
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario:RoofCard Organization  edit - Categories Tab
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Attributes" tab

  Scenario: RoofCard Export Entity Button - Associations
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: RoofCard Export Entity Button - Permission
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |


  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "roof_card_test" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"

    Examples:
      | ItemStatus |
      | Active     |
      | Passive    |
      | Approved   |