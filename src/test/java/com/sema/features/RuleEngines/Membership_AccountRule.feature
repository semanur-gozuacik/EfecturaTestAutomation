@regression
Feature: Membership_Account Rule Test Cases

  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds
#    When  The User is on the Similar overview

  Scenario: When a rule is created, accounts that meet the rule with or operator must be associated.
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with or
    When The user clicks Set Rules button
    Then The user go to rule association tab 'MEMBERSHIP_ACCOUNT'
    Then The user verify detail info of associated items for or 'MEMBERSHIP_ACCOUNT'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'

  Scenario: When a rule is created, accounts that meet the rule with and operator must be associated.
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button
    Then The user go to rule association tab 'MEMBERSHIP_ACCOUNT'
    Then The user verify detail info of associated items for and
    Then The user tear down all rules 'itemIdForMembershipRuleTests'

  Scenario: While an account who does not meet with the relevant rule is added to the inList for this membership,
  this user should be added to the associates.
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets a rule
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item in rule which is not in rule
    When The user clicks Set Rules button
    Then The item that is set in rule should appear in InList
    Then The item that is set in rule should been associated according to 'MEMBERSHIP_ACCOUNT'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When an account is edited to meet the rules, this account must be associated for membership.
    When The user edit an account to meet the rules 'TearDown'
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks Set Rules button
    When The user edit an account to meet the rules 'TestAutomation'
    Then The user verifies that the edited item is associated 'MEMBERSHIP_ACCOUNT' 'itemIdForMembershipRuleTests'
    When The user edit an account to meet the rules 'TearDown'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When an account is edited to not meet the rules, associate of this item should be removed for membership
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks Set Rules button
    When The user verifies that the edited item is associated 'MEMBERSHIP_ACCOUNT' 'itemIdForMembershipRuleTests'
    When The user edit an account to meet the rules 'TearDown'
    Then The user verifies that association of this item is removed 'MEMBERSHIP_ACCOUNT' 'itemIdForMembershipRuleTests'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: While an account who meet the rule is added to the NotInList for this membership,
  this user should be removed from the associates.
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item out rule which is in rule
    When The user clicks Set Rules button
    Then The item that is set out rule should appear in NotInList
    Then The item that is set out rule should not been associated 'MEMBERSHIP_ACCOUNT' 'itemIdForMembershipRuleTests'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'
    Then The user edit an account to meet the rules 'TearDown'


  Scenario: When rule is created with a association name, this name should be seen in association table for membership
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button with association name 'RuleTestAutomation'
    Then The user go to rule association tab 'MEMBERSHIP_ACCOUNT'
    Then The user verifies that associated item has association name 'RuleTestAutomation'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When rule is created with a random association name,this name should be seen in association table for membership
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button with random association name
    Then The user go to rule association tab 'MEMBERSHIP_ACCOUNT'
    Then The user verifies that associated item has association name 'Random'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When an account which is inList is deleted from inList without saving rules, it should not be deleted
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets a rule
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item in rule which is not in rule
    When The user clicks Set Rules button
    Then The item that is set in rule should appear in InList
    When The user clicks clearAll button in "inList"
    When The user refresh the page
    When The user click rule tab
    Then The item that is set in rule should appear in InList
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When an account which is inList is deleted from inList by saving rules, it should be deleted
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets a rule
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item in rule which is not in rule
    When The user clicks Set Rules button
    Then The item that is set in rule should appear in InList
    When The user clicks clearAll button in "inList"
    When The user clicks Set Rules button
    When The user refresh the page
    When The user click rule tab
    Then The item that is set in rule should not appear in InList
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When an account which is notInList is deleted from notInList without saving rules, it should not be deleted
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item out rule which is in rule
    When The user clicks Set Rules button
    Then The item that is set out rule should appear in NotInList
    When The user clicks clearAll button in "notInList"
    When The user refresh the page
    When The user click rule tab
    Then The item that is set out rule should appear in NotInList
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: When an account which is notInList is deleted from notInList by saving rules, it should be deleted
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item out rule which is in rule
    When The user clicks Set Rules button
    Then The item that is set out rule should appear in NotInList
    When The user clicks clearAll button in "notInList"
    When The user clicks Set Rules button
    When The user refresh the page
    When The user click rule tab
    Then The item that is set out rule should not appear in NotInList
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: While an account who does not meet with the relevant rule is added to the inList via list selection
  for this membership, this user should be added to the associates.
    When The user go to 'Account' overview page
    When The user select 'ruleTestAutomation' list
    When The user take the "CODE" values of item in item overview
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets a rule
    When The user click Calculate button
    When The user select 'ruleTestAutomation' list in "InList" area
    Then The item that is set in rule should appear in InList
    When The user clicks Set Rules button
    Then The item that is set in rule should been associated according to 'MEMBERSHIP_ACCOUNT'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'


  Scenario: While an account which meet with the relevant rule is added to the inList via list selection
  for this membership, this user should not be added to the associates.
    When The user go to 'Account' overview page
    When The user select 'rule_for_notInList' list
    When The user take the "CODE" values of item in item overview
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForMembershipRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user select 'rule_for_notInList' list in "NotInList" area
    When The user clicks Set Rules button
    Then The item that is set out rule should appear in NotInList
    Then The item that is set out rule should not been associated 'MEMBERSHIP_ACCOUNT' 'itemIdForMembershipRuleTests'
    Then The user tear down all rules 'itemIdForMembershipRuleTests'
    Then The user edit an account to meet the rules 'TearDown'
