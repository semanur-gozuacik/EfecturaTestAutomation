
Feature: Campaign Management Test Cases- Campaign Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a  mouseover on the Campaign Management element
    And   The User performs a  mouseover on the Campaign element
    And   The User clicks on the Campaign element
    And   The User gets the current URL and stores it in "itemType=Campaign" Asset page
  @semooo
  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "testsema123" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality "testsema123"-Campaign

  Scenario:  Verify Code Filter -Valid Unique Code partial
    And The user enters "TEST" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality with partial unique code "Test"- Campaign

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Verify Label Filter - Valid Label
    And The user enters "TestWelcomeCampaignFirstPreview" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "TestWelcomeCampaignFirstPreview"- Campaign

  Scenario: Verify Label Filter - Partial Label
    And The user enters "test" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test"- Campaign

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"
