Feature:create product
Background:
When   The User opens the browser with the given url
And   The User inputs a valid username "Efectura"
And   The User inputs a valid password "@3f3c1ur4"
And   The User clicks the Submit button
Then   The User waits until the MDM element is visible with a timeout of 120 seconds
And   The User performs a mouseover on the MDM element
And   The User performs a mouseover on the Product Management element
And   The User performs a mouseover on the Product element
And   The User clicks on the Product element
And   The User gets the current URL and stores it in "itemType=Gift"
Then   The User waits until the createItem element is visible with a timeout of 120 seconds
And   The User clicks on the createItem element
Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
And   The User inputs the value from cont into the inputCode field

Scenario: Create Gift on Fletum with invalid family- test
And   The User presses the down arrow key and then presses Enter in the Choose Family element
And   The User clicks on the Categories element
Then   The User waits until the PRODUCT element in the gift is visible with a timeout of 120 seconds
And   The User clicks on the TEST element
And   The User clicks on the createButton element
Then   The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create Product on Fletum with invalid family- new node
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    Then   The User waits until the PRODUCT element in the gift is visible with a timeout of 120 seconds
    And   The User clicks on the new node element
    And   The User clicks on the createButton element
    Then   The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create Product on Fletum with invalid family- test
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    Then  The User waits until the leftdenemecategory  element in the gift is visible with a timeout of 120 seconds
    And   The User clicks on the leftdenemecategory element
    And   The User clicks on the denemecategory element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create Product on Fletum without Categories
    And   The User presses the down arrow key and then presses Enter in the System Product element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "Please choose categories" text with a timeout of 120 seconds
