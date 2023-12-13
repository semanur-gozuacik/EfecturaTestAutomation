Feature: Event Management Test Cases- Event Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    Given The user is on the Event item home page
    And   The User gets the current URL and stores it in "itemType=Event"

  @regression
  Scenario:Event Verify export button
    When  The user clicks on Export button
    #Then  The user verify that the export was "Success"
  @regression
  Scenario:Event Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable
  @regression
  Scenario:Event Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable
  @regression
  Scenario:Event Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable
  @regression
  Scenario:Event Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable
  @regression
  Scenario:Event Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable
  @regression
  Scenario:Event Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable
  @regression
  Scenario:Event Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable
  @regression
  Scenario:Event Home Page Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable

  @regression
  Scenario:Event Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"
  @regression
  Scenario Outline: Event Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|
      |250|
  @regression
  Scenario: Event page edit verify
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
  @regression
  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks cancel button
    And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |
      # |Passive    |

  @regression
  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
  @regression
  Scenario: Edit item added list
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks list drop down button
    And  The user clicks new list item-event
    Then The user verifies item is added
  @regression
  Scenario: Edit item removed list
    And  The user enters "Event-51314" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks removed button
    Then The user verifies item is removed
  @regression
  Scenario:Event edit - EVENT_DIGITAL_ASSET Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "EVENT_DIGITAL_ASSET" tab
  @regression
  Scenario:Event edit - EVENT_CONTACT Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "EVENT_CONTACT" tab
  @regression
  Scenario:Event edit - Event-Gift Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Event-Gift" tab
  @regression
  Scenario:Event edit - EVENT_LOCATION Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "EVENT_LOCATION" tab
  @regression
  Scenario:Event edit - Event-Product Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Event-Product" tab
  @regression
  Scenario:Event edit - ItemComment Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ItemComment" tab
  @regression
  Scenario:Event edit - history Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "history" tab
  @regression
  Scenario:Event edit - Categories Tab
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab
  @sema
  Scenario Outline:Event edit - Event-Product Tab-Associated
    And The user enters "Event-51314" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Event-Product" tab
    And The user clicks Associated status "<associated status>"
Examples:
    |associated status|
    |Associated All   |
    |Yes              |
    |No               |
  @regression
  Scenario: Verify My Count Star Item Functionality- One Contact
    And The user enters "event" into Code field
    And the user clicks on Search button
    And the user clicks on Star items
    And the user verify My Count badge count is correct