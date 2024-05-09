@regression
Feature: Tags Page Test Cases
  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds
    When  The user is on the Tags page


  Scenario: Users should reach Tags page.
    Then  The user verifies that reached the "Tags" page.

  Scenario: Refresh button should be active in Tags page
    Then The user verifies that Refresh button is active

  Scenario Outline: The User verify label filter works correctly
    When  The user enters "<entries>" in to label filter
    Then  The User verifies that label filter results contains "<entries>"

    Examples:
      | entries |
      | ika     |
      | patika  |

  Scenario: If there is no value in the filter result, it should say 'No matching records found'
    When The user enters 'quxysobekps' in to label filter
    Then The user verifies that 'No matching records found' is displayed in table

  Scenario: The filter should return IDs between 63 and 67 inclusive
    When The user enters 63 and 67 in to Id filter
    When The user clicks update button in Id filter
    Then The user verifies that ids are between 63 and 67 inclusive

  Scenario: 'IdFromMustBeLessThanIdTo' warning should displayed if idFrom is greater than idTo
    When The user enters 67 and 63 in to Id filter
    When The user clicks update button in Id filter
    Then The user verifies that 'IdFromMustBeLessThanIdTo' warning is displayed

  Scenario: Type filter should filter the selected value
    When The user select 'Account' from Type filter
    Then The user verifies that table has only 'Account' values

  Scenario: The user verifies that filter reset button works correctly on Label filter
    When The user enters "abcd" in to label filter
    When The user clicks reset button
    Then The user verifies that label filter has no value

  Scenario: The user verifies that filter reset button works correctly on Id filter
    When The user enters 67 and 63 in to Id filter
    When The user clicks reset button
    Then The user verifies that Id filter has no value

  Scenario: The user verifies that filter reset button works correctly on ItemType filter
    When The user select 'Account' from Type filter
    When The user clicks reset button
    Then The user verifies that ItemType filter has value 'TypeAll'

  Scenario: Id values should be ascending order with no action
    Then The user verifies that id values are ascending order with no action

  Scenario: Id values should be able to be descending order
    When The user clicks Id header for descending sort
    Then The user verifies that id values are descending order

  Scenario: Label values should be able to be ascending order
    When The user clicks Label header for ascending sort
    Then The user verifies that Label values are ascending order

  Scenario: Label values should be able to be descending order
    When The user clicks Label header for descending sort
    Then The user verifies that Label values are descending order

  Scenario: ItemType values should be able to be ascending order
    When The user clicks ItemType header for ascending sort
    Then The user verifies that ItemType values are ascending order

  Scenario: ItemType values should be able to be descending order
    When The user clicks ItemType header for descending sort
    Then The user verifies that ItemType values are descending order

  Scenario: First and previous buttons should be inactive in first page of Tags table
    When The user enters '1' in to pagination input box
    Then The user verifies that first and previous pagination buttons are inactive in first page of table in Tags page

  Scenario: Last and next buttons should be inactive in last page of Tags table
    When The user enters last page number in to pagination input box in Tags page
    Then The user verifies that last and next pagination buttons are inactive in last page of table in Tags page

  Scenario: The user should go to last page after clicking the last pagination button
    When The user clicks last pagination button in Tags page
    Then The user verifies that table is in last page in Tags page

  Scenario: The user should go to first page after clicking the first pagination button
    When The user clicks last pagination button in Tags page
    When The user clicks first pagination button in Tags page
    Then The user verifies that table is in first page in Tags page

  Scenario: The user should be able to go next page after clicking next pagination button
    When The user clicks next pagination button in Tags page
    Then The user verifies that table go to next page in Tags page

  Scenario: The user should be able to go previous page after clicking previous pagination button
    When The user clicks next pagination button in Tags page
    When The user clicks previous pagination button in Tags page
    Then The user verifies that table go to previous page in Tags page
#--------------------------------------------------------------------------------------------------------
@0105
  Scenario Outline: If there is enough data in the table, there must be as many rows as the number selected in the table length
    When The user select "<length>" from table length in tags page
    Then The user verifies that table contains right rows according to "<length>" in Tag
    Examples:
      | length |
      | 100    |
      | 50     |
      | 25     |
      | 10     |

    #----------create-------------
  Scenario: The Cancel button in CreateTag modal should be active
    When The user clicks CreateNew button in Tags page
    Then The user verifies that Cancel button is active in CreateTag modal

  Scenario: Create button should be passive after only enter Label in CreateNewTag Modal
    When The user clicks CreateNew button in Tags page
    When The user fills the label input in CreateNewTag Modal
    Then The user verifies that Create button is passive in CreateNewTag Modal

  Scenario: Create button should be passive after only select itemType in CreateNewTag Modal
    When The user clicks CreateNew button in Tags page
    When The user select itemType "Account" in CreateOrEditTag Modal
    Then The user verifies that Create button is passive in CreateNewTag Modal

  Scenario: Create button should be active after enter Label and select itemType in CreateNewTag Modal
    When The user clicks CreateNew button in Tags page
    When The user fills the label input in CreateNewTag Modal
    When The user select itemType "Account" in CreateOrEditTag Modal
    Then The user verifies that Create button is active in CreateNewTag Modal

  Scenario: A tag with the non existing label value should be able to create.
    When The user clicks CreateNew button in Tags page
    When The user fills the label input in CreateNewTag Modal
    When The user select itemType "Account" in CreateOrEditTag Modal
    When The user clicks create button in CreateNewTag Modal
    Then The user verifies that the 'Changes saved successfully.' info appears in the top right
    Then The user verifies that current tags include new tag with itemType "Account"

  Scenario: A tag with the different itemType and existing label value should be able to create.
    When The user clicks CreateNew button in Tags page
    When The user fills the label input in CreateNewTag Modal
    When The user select itemType "Contact" in CreateOrEditTag Modal
    When The user clicks create button in CreateNewTag Modal
    Then The user verifies that the 'Changes saved successfully.' info appears in the top right
    Then The user verifies that current tags include new tag with itemType "Contact"

  Scenario: A tag with the same itemType and existing label value should not be able to create.
    When The user clicks CreateNew button in Tags page
    When The user fills the label input in CreateNewTag Modal
    When The user select itemType "Contact" in CreateOrEditTag Modal
    When The user clicks create button in CreateNewTag Modal
    Then The user verifies that the 'ExistingTag' info appears in the top right

  Scenario: CreateNewTag Modal should be closed after clicking the cancel button
    When The user clicks CreateNew button in Tags page
    When The user clicks cancel button in CreateNewTag Modal
    Then The user verifies that CreateNewTag Modal is closed

#---------Edit-----------
  Scenario: The Cancel button in EditTag modal should be active
    When The user clicks EditTag button in Tags page
    Then The user verifies that Cancel button is active in EditTag modal

  Scenario: The Save button in EditTag modal should be passive without any changes
    When The user clicks EditTag button in Tags page
    Then The user verifies that Save button is passive in EditTag modal

  Scenario: EditTag Modal should be closed after clicking the cancel button
    When The user clicks EditTag button in Tags page
    When The user clicks cancel button in EditTag Modal
    Then The user verifies that EditTag Modal is closed

  Scenario: The Save button in EditTag modal should be active after edit Label
    When The user clicks EditTag button in Tags page
    When The user edit Label in EditTag Modal
    Then The user verifies that Save button is active in EditTag modal

  Scenario: The Save button in EditTag modal should be active after edit itemType
    When The user clicks EditTag button in Tags page
    When The user select itemType "Event" in CreateOrEditTag Modal
    Then The user verifies that Save button is active in EditTag modal
@0105
  Scenario: When the label changed and the change is undone, Save button should be passive in EditTag Modal
    When The user clicks EditTag button in Tags page
    When The user edit Label in EditTag Modal
    When The user undone the changes in Label
    Then The user verifies that Save button is passive in EditTag modal

  Scenario: When the itemType changed and the change is undone, Save button should be passive in EditTag Modal
    When The user clicks EditTag button in Tags page
    When The user select itemType "Event" in CreateOrEditTag Modal
    When The user select itemType "Contact" in CreateOrEditTag Modal
    Then The user verifies that Save button is passive in EditTag modal

  Scenario: A tag whose itemType has been changed should not be edited without selecting the 'AreYouSureTagEdit' checkbox
    When The user clicks EditTag button in Tags page
    When The user select itemType "Event" in CreateOrEditTag Modal
    When The user clicks Save button in EditTag modal
    Then The user verifies that the 'ConfirmCheckboxItemType' info appears in the top right

    #bakılacak to-do
  Scenario: A tag should not be edited with an already existing label and itemType
    When The user clicks EditTag button in Tags page
    When The user select itemType "Contact" in CreateOrEditTag Modal
    When The user select AreYouSureTagEdit check box
    When The user clicks Save button in EditTag modal
    Then The user verifies that the 'ExistingTag' info appears in the top right

  Scenario: A tag with the non existing label value should be able to edit.
    When The user clicks EditTag button in Tags page
    When The user edit Label in EditTag Modal
    When The user select AreYouSureTagEdit check box
    When The user clicks Save button in EditTag modal
    Then The user verifies that the 'Changes saved successfully.' info appears in the top right

  Scenario: A tag with the different itemType and existing label value should be able to edit.
    When The user clicks EditTag button in Tags page
    When The user edit Label in EditTag Modal
    When The user select AreYouSureTagEdit check box
    When The user clicks Save button in EditTag modal
   #Then The user verifies that the 'Changes saved successfully.' info appears in the top right

  #--------delete-----------------
  Scenario: The Cancel button in DeleteTag modal should be active
    When The user clicks DeleteTag button in Tags page
    Then The user verifies that Cancel button is active in DeleteTag modal

  Scenario: The Delete button in DeleteTag modal should be active
    When The user clicks DeleteTag button in Tags page
    Then The user verifies that Delete button is active in DeleteTag modal

  Scenario: DeleteTag Modal should be closed after clicking the cancel button
    When The user clicks DeleteTag button in Tags page
    When The user clicks Cancel button in DeleteTag Modal
    Then The user verifies that DeleteTag Modal is closed

  Scenario: A tag should be able to delete
    When The user clicks DeleteTag button in Tags page
    When The user clicks Delete button in DeleteTag modal
    When The user clicks DeleteTag button in Tags page
    When The user clicks Delete button in DeleteTag modal
    Then The user verifies that the 'Changes saved successfully.' info appears in the top right