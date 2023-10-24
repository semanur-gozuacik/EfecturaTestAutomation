@regression
Feature: Asset Management Test Cases- Asset Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a    mouseover on the Asset Management element
    And   The User performs a    mouseover on the Asset element
    And   The User clicks on the Asset element
    And   The User gets the current URL and stores it in "itemType=Asset" Asset page

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button-Asset
    And The user enters "TEST123456" into Code field
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
      |Passive    |
      |Approved   |
      |On Hold    |
      |Running    |
      |Draftt     |

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "TEST123456" into Code field
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
      |Approved   |
      |On Hold    |
      |Running    |
      |Draftt     |

