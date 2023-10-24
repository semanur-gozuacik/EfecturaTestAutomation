Feature: Goal Management and Item Operations
  Background:


    When   The User opens the browser with the given url
    And   The User inputs a valid username "Efectura"
    And   The User inputs a valid password "@3f3c1ur4"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Goal Management element
    And   The User performs a mouseover on the Goal element
    And   The User clicks on the Goal element
    And   The User gets the current URL and stores it in "itemType=Goal"
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field

  Scenario: And the user Performs Goal Management and Item Operations

    And the user clicks on the "_fast-categories" element
    And the user waits until the "tree_158" element is visible
    And the user clicks on the "tree_158" element at coordinates (20, 0)
    And the user clicks on the "saveItem" element
    And the user waits until the "dropdownMenuButton1" element is visible with a timeout of 2 minutes and 20 seconds
    And the user performs a mouseover on the "dropdownMenuButton1" element
    And the user clicks on the "deletItemButton" element
    And the user clicks on the "removeItemBtn" element
    And   The User clicks on the createButton element
