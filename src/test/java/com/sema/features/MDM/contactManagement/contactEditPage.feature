@regression
Feature: Contact Management Test Cases- Contact Edit Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Contact item home page
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    When The user open side accordion in overview
    When The user clicks on Contact  category
    And The user enters "5071245698" into Code field
    And The user clicks on Edit Button
    Then The user verify Edit Page
    And the user selects "<ItemStatus>"
       #And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks save button
       #And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Approved   |

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    When The user open side accordion in overview
    When The user clicks on Contact  category
    And The user enters "semaotomasyon" into Code field
    And The user clicks on Edit Button
    Then The user verify Edit Page
    And the user selects "<ItemStatus>"
       #And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
     #  And The user clicks cancel button
      # And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Passive    |
      |Active     |
      #|Approved   |

  Scenario: Edit item added list
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And  The user clicks list drop down button
    And  The user clicks new list item-contact
  #  Then The user verifies item is added

  Scenario: Edit item removed list
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And  The user clicks removed button
    #Then The user verifies item is removed

  Scenario:Contact Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    #And  The user verifies previous button is not clickable asset

  Scenario:Contact Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Contact Group Permission Verify Item next Button clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset

  Scenario:Contact Group Permission Verify Previous Page Button clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario:Contact Group Permission Verify Last Page Button clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario:Contact Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is unclickable asset

  Scenario:Contact Group Permission Verify Item next Button unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies next button is unclickable asset

  Scenario:Contact Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
   # And  The user verifies first page button is clickable asset

  Scenario:Contact User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies first page button is not clickable user

  Scenario:Contact User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies previous page button is not clickable user

  Scenario:Contact User Permission Verify Item next Button clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    And  The user verifies next button is clickable user

  Scenario:Contact User Permission Verify Previous Page Button clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    When The user clicks next page button user
    When The user clicks previous page button user
    And  The user verifies previous button is clickable user


  Scenario:Contact User Permission Verify Last Page Button clickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is clickable user

  Scenario:Contact User Permission Verify Last Page Button Unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is unclickable asset

  Scenario:Contact User Permission Verify Item next Button unclickable Condition
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies next button is unclickable user

  Scenario:Contact User Permission Verify Item First Page Button Clickable Condition
    And The user enters "5325589874" into Code field
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies first page button is clickable user

  Scenario:Contact edit -Preview Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Preview" tab
    Then The user verifies preview tab details is displayed

  Scenario:Contact edit -Item Comment Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "ItemComment" tab

  Scenario:Contact edit - ACCOUNT_CONTACT Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "ACCOUNT_CONTACT" tab

  Scenario:Contact edit -  ACCOUNT_CONTACT Tab Associated
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "ACCOUNT_CONTACT" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Contact edit -  ACCOUNT_CONTACT Tab Associated Filter No
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "ACCOUNT_CONTACT" tab
    And The user Assocaited No filter
    Then The user verify No Filter

   # Then The user verifies My Account tab details is displayed

 # Scenario:Contact edit - My Account Tab export
   # And The user enters "semaotomasyon" into Code field
  #  And the user clicks on Search button
   # And  The user clicks on Edit Button
   # And The user clicks "My Account" tab
   # When  The user clicks on Export button ediitem
    #Then  The user verify that the export was "Success"

  Scenario:Contact edit - Gift Contact Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Gift Contact" tab

  Scenario:Account edit - Gift Contact Tab Associated
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Gift-Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Contact edit - Gift Contact Tab Associated Filter No
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Gift-Contact" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:Contact edit - Categories Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab

  Scenario:Contact edit - History Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:Contact edit - Vanue-Contact Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Venue-Contact" tab

  Scenario:Contact edit - Vanue-Contact Tab Associated
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Venue-Contact" tab
    And The user Assocaited All filter
      # And The user clicks item
       #And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks save button
      # And the user verifies item status success message

  Scenario:Contact edit - Vanue-Contact Tab Associated Filter No
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Venue-Contact" tab
    And The user Assocaited No filter
   # Then The user verify No Filter

  Scenario:Contact edit -Attributes Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Attributes" tab

  Scenario:Contact edit - CAMPAIGN_CONNCTT Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Campaign- Contact" tab

  Scenario:Contact edit - CAMPAIGN_CONNT Tab Associated
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Campaign- Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Contact edit -CAMPAIGN_CONNT Tab Associated Filter No
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Campaign- Contact" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:Contact edit -Event-Contact Tab
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Event-Contact" tab

  Scenario:Contact edit - Event-Contact Tab Associated
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Event-Contact" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:Contact edit -Event-Contact Tab Associated Filter No
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Event-Contact" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:Contact edit -Preview Tab Export Button
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks "Preview" tab
    And The user clicks Export PDF button
    Then The user verifies the file is downloaded

  Scenario:Contact edit -Preview Tab Refresh  Button
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And  The user clicks "Preview" tab
    And  The user clicks Refresh button
    Then The user verifies refresh button

  Scenario: Contact Export Entity Button - Attributes
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: Contact Export Entity Button - Associations
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: Contact Export Entity Button - Permission
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario Outline: Campaign-Account Associated Tab Status Fılter "<Status>"
    And The user enters "semaotomasyon" into Code field
    And  The user clicks on Edit Button
    And  The user clicks "Event-Contact" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |
