@regression
Feature: Contact Management Test Cases- Contact Edit Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Contact Management element
    And   The User performs a mouseover on the Contact element
    And   The User clicks on the Contact element
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    When The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    Then The user verify Edit Page
    And the user selects "<ItemStatus>"
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Approved   |

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    When The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    Then The user verify Edit Page
    And the user selects "<ItemStatus>"
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks cancel button
    And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Passive    |
      |Active     |
      #|Approved   |

  Scenario: Edit item added list
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks list drop down button
    And  The user clicks new list item-contact
    Then The user verifies item is added

  Scenario: Edit item removed list
    And  The user enters "sematestttt" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks removed button
    Then The user verifies item is removed

  Scenario:Contact Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous button is not clickable asset

  Scenario:Contact Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Contact Group Permission Verify Item next Button clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset

  Scenario:Contact Group Permission Verify Previous Page Button clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario:Contact Group Permission Verify Last Page Button clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario:Contact Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is unclickable asset

  Scenario:Contact Group Permission Verify Item next Button unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies next button is unclickable asset

  Scenario:Contact Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies first page button is clickable asset

  Scenario:Contact User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies previous button is not clickable asset

  Scenario:Contact User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Contact User Permission Verify Item next Button clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset

  Scenario:Contact User Permission Verify Previous Page Button clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario:Contact User Permission Verify Last Page Button clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario:Contact User Permission Verify Last Page Button Unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button asset
    And  The user verifies last button is unclickable asset

  Scenario:Contact User Permission Verify Item next Button unclickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button asset
    And  The user verifies next button is unclickable asset

  Scenario:Contact User Permission Verify Item First Page Button Clickable Condition
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button asset
    And  The user verifies first page button is clickable asset
