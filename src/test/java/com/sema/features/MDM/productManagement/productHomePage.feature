@regression
Feature: Product Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    Given The user is on the Product item home page
    And   The User gets the current URL and stores it in "itemType=Product"

  Scenario:Product Verify export button
    When  The user clicks on Export button
    #Then  The user verify that the export was "Success"

  Scenario:Product Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Product Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario Outline: Product Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|

  Scenario: User Reset Button Control
    And The user enters "test2123" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Product Home Page Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario:Product edit -SO_MRP Associated
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Web_Images" tab
    And The user Assocaited All filter


  Scenario:Product  edit - SO_MRP Tab Associated Filter No
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Web_Images" tab
    And The user Assocaited No filter
    Then The user verify No Filter


  Scenario:Product edit -EVENT_PRODUCT Associated
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "EVENT_PRODUCT" tab
    And The user Assocaited All filter

  Scenario:Product  edit - EVENT_PRODUCT Tab Associated Filter No
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "EVENT_PRODUCT" tab
    And The user Assocaited No filter
    Then The user verify No Filter


  Scenario:Product edit -Item Comment Tab
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Item Comment" tab

  Scenario:Product edit -Product_Account Associated
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product_Account" tab
    And The user Assocaited All filter

  Scenario:Product  edit - Product_Account Tab Associated Filter No
    And The user enters "Product_179" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Product_Account" tab
    And The user Assocaited No filter
    Then The user verify No Filter
