@regression
Feature: Product Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Product item home page
    And   The User gets the current URL and stores it in "itemType=Product"

  Scenario:Product Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario:Product Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:Product Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario Outline: Product Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |

  Scenario: User Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario:Product Home Page Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario:Product edit -SO_MRP Associated
    And The user enters "Product_179" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Web_Images" tab
    And The user Assocaited All filter


  Scenario:Product  edit - SO_MRP Tab Associated Filter No
    And The user enters "Product_179" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Web_Images" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"


  Scenario:Product edit -EVENT_PRODUCT Associated
    And The user enters "Product_179" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Event-Product" tab
    And The user Assocaited All filter

  Scenario:Product  edit - EVENT_PRODUCT Tab Associated Filter No
    And The user enters "Product_179" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Event-Product" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"


  Scenario:Product edit -Item Comment Tab
    And The user enters "Product_179" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Item Comment" tab

  Scenario:Product edit -Product_Account Associated
    And The user enters "Product_179" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Product_Account" tab
    And The user Assocaited All filter

  Scenario:Product  edit - Product_Account Tab Associated Filter No
    And The user enters "Product_179" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Product_Account" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"
