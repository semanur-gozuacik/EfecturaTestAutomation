@regression
Feature: Gift Creation and Management Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Gift item home page
    And   The User gets the current URL and stores it in "itemType=Gift"

  Scenario:Gift Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario:Gift Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:Gift Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario:Gift Home Page Verify Item next Button Clickable Condition
    And  The user verifies "next" button is "Active"

  Scenario:Gift Home Page Verify Last Page Button Clickable Condition
    And  The user verifies "lastpage" button is "Active"

  Scenario:Gift Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario Outline: Gift Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |

  Scenario: Gift Home Page Reset Button Control
    And The user enters "TestGiftForReceived" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario: Gift page edit verify
    And The user enters "TestGiftForReceived" into "Code" filter text input box
    And The user clicks on edit button in table


  Scenario Outline:Gift Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
       #And The user clicks save button
      # And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
     # |Passive    |
      #|Draft    |

  Scenario:Gift edit - Certificate Tab
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Certificate" tab

  Scenario:Gift edit - Gifts image Tab Associated
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Gifts image" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Gift edit -Gifts image Tab Associated Filter No
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Gifts image" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Gift Gifts image Associated Tab Code Filter Functionality
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Gifts image" tab
    And The user clicks on code filter Filter
    # And The user enters "1310202301"
    Then The user verifies that code filter functionality

  Scenario:Gift edit - GIFT_CONTACT Tab Associated
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "GIFT_CONTACT" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Gift edit -GIFT_CONTACT Tab Associated Filter No
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "GIFT_CONTACT" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario:Gift edit - Gifts image Tab Associated
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event-Gift" tab
    And The user Assocaited All filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:Gift edit - history Tab
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "history" tab

  Scenario:Gift edit - ItemComment Tab
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:Gift edit -Gifts image Tab Associated Filter No
    And The user enters "TestGiftForRecieved" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Event-Gift" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"
