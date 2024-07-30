@regression
Feature: EVENT_CONTACT Rule Test Cases

  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds


  Scenario: When a gift rule is created, Contacts that meet the rule with or operator must be associated.
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with or
    When The user clicks Set Rules button
    Then The user go to rule association tab 'GIFT_CONTACT'
    Then The user go to items to verify detail info with two step for or 'ACCOUNT_CONTACT'
    Then The user tear down all rules 'itemIdForGiftRuleTests'


  Scenario: When a gift rule is created, Contacts that meet the rule with and operator must be associated.
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button
    Then The user go to rule association tab 'GIFT_CONTACT'
    Then The user go to items to verify detail info with two step for and 'ACCOUNT_CONTACT'
    Then The user tear down all rules 'itemIdForGiftRuleTests'


  Scenario: While a contact who does not meet with the relevant rule is added to the inList for this gift,
  this contact should be added to the associates.
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets a rule
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item in rule which is not in rule
    When The user clicks Set Rules button
    Then The item that is set in rule should appear in InList
    Then The item that is set in rule should been associated according to 'GIFT_CONTACT'
    Then The user tear down all rules 'itemIdForGiftRuleTests'


  Scenario: While a contact who meet the rule is added to the NotInList for this gift,
  this contact should be removed from the associates.
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item out rule which is in rule
    When The user clicks Set Rules button
    Then The item that is set out rule should appear in NotInList
    Then The item that is set out rule should not been associated 'GIFT_CONTACT' 'itemIdForGiftRuleTests'
    Then The user tear down all rules 'itemIdForGiftRuleTests'
    Then The user edit an account to meet the rules 'TearDown'

  Scenario: When an account is edited to meet the gift rules, contact that is associated with this account must be associated.
    When The user edit an account to meet the rules 'TearDown'
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks Set Rules button
    When The user edit an account to meet the rules 'TestAutomation'
    Then The user verifies edited item is associated with two step 'GIFT_CONTACT' 'itemIdForGiftRuleTests' 'itemIdForAssociationForContact'
    When The user edit an account to meet the rules 'TearDown'
    Then The user tear down all rules 'itemIdForGiftRuleTests'


  Scenario: When an account is edited to not meet the gift rules, associate of this item should be removed
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks Set Rules button
    Then The user verifies edited item is associated with two step 'GIFT_CONTACT' 'itemIdForGiftRuleTests' 'itemIdForAssociationForContact'
    When The user edit an account to meet the rules 'TearDown'
    Then The user verifies that association of this item is removed 'GIFT_CONTACT' 'itemIdForGiftRuleTests'
    Then The user tear down all rules 'itemIdForGiftRuleTests'


  Scenario: When rule is created with association name, this name should be seen in association table for gift
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button with association name 'RuleTestAutomation'
    Then The user go to rule association tab 'GIFT_CONTACT'
    Then The user verifies that associated item has association name 'RuleTestAutomation'
    Then The user tear down all rules 'itemIdForGiftRuleTests'


  Scenario: When rule is created with a random association name,this name should be seen in association table for gift
    When The user go in to item 'itemIdForGiftRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button with random association name
    Then The user go to rule association tab 'GIFT_CONTACT'
    Then The user verifies that associated item has association name 'Random'
    Then The user tear down all rules 'itemIdForGiftRuleTests'



