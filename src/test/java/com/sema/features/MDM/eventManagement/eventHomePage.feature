@regression
Feature: Event Management Test Cases- Event Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Event item home page
    And   The User gets the current URL and stores it in "itemType=Event"


  Scenario:Event Verify export button
    When  The user clicks on Export button
    #Then  The user verify that the export was "Success"

  Scenario:Event Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Event Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:Event Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:Event Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:Event Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:Event Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:Event Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario:Event Home Page Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable

  Scenario:Event Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario Outline: Event Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|

  Scenario: Event page edit verify
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks cancel button
       #And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |
      # |Passive    |


  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
       #And The user clicks save button
      # And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |

  Scenario: Edit item added list
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks list drop down button
    And  The user clicks new list item-event
    # Then The user verifies item is added

  Scenario: Edit item removed list
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks removed button
    # Then The user verifies item is removed

  Scenario:Event edit - EVENT_LOCATION Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_LOCATION" tab

  Scenario:Event edit - ItemComment Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:Event edit - history Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "history" tab

  Scenario:Event edit - Categories Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario: Verify My Count Star Item Functionality- One Contact
    And The user enters "event" into "Code" filter text input box
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario: Event Home Page Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Event edit - Event-Product Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event-Product" tab

  Scenario:Event edit - Event-Product Tab Associated
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_PRODUCT" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Event edit -Event-Product Tab Associated Filter No
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_PRODUCT" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Event edit - EVENT_CONTACT Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_CONTACT" tab

  Scenario:Event edit - EVENT_CONTACT Tab Associated
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_CONTACT" tab
    And The user Assocaited All filter

  Scenario:Event edit EVENT_CONTACT Tab Associated Filter No
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_CONTACT" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Event edit - Event-Gift Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event_Gift" tab

  Scenario:Event edit - Event-Gift Tab Associated
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event_Gift" tab
    And The user Assocaited All filter
    # And The user clicks item
    # And the user clicks on unsaved change button
     #And The user enters "-------" in  comment area
    # And The user clicks save button
     #And the user verifies item status success message

  Scenario:Event edit Event-Gift Tab Associated Filter No
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event_Gift" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Event edit - EVENT_DIGITAL_ASSET Tab
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_DIGITAL_ASSET" tab

  Scenario:Event edit - EVENT_DIGITAL_ASSET Tab Associated
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_DIGITAL_ASSET" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Event edit EVENT_DIGITAL_ASSET Tab Associated Filter No
    And The user enters "DIAGEOEVENT" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "EVENT_DIGITAL_ASSET" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario: Event Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns

  Scenario:  Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns