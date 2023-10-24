@regression
Feature: Contact Management Test Cases- Contact Edit Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Contact Management element
    And   The User performs a mouseover on the Contact element
    And   The User clicks on the Contact element
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario: Edit Page Upload Photo-Cancel
    When The user clicks on Contact  category
    And The user enters "TEST1" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    Then The user verify Edit Page
    When The user clicks upload button
    And The user enters "-------" in comment area
    And The user clicks upload photo cancel button
    Then The user verifies the photo unuploaded

  Scenario: Edit Page Upload Photo-Save Button
    When The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    Then The user verify Edit Page
    When The user clicks upload button
    And The user enters "-------" in comment area
    And The user clicks upload photo save button
    And The user verifies the photo uploaded

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
      |Active     |
      |Passive    |
      |Approved   |


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