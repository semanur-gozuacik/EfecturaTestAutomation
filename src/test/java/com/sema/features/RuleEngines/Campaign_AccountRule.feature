@regression
Feature: Campaign_Account Rule Test Cases

  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds
#    When  The User is on the Similar overview

  Scenario: When a rule is created, accounts that meet the rule with or operator must be associated for campaign.
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with or
    When The user clicks Set Rules button
    Then The user go to rule association tab 'CAMPAIGN_ACCOUNT'
    Then The user verify detail info of associated items for or 'CAMPAIGN_ACCOUNT'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'

  Scenario: When a rule is created, accounts that meet the rule with and operator must be associated for campaign.
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button
    Then The user go to rule association tab 'CAMPAIGN_ACCOUNT'
    Then The user verify detail info of associated items for and
    Then The user tear down all rules 'itemIdForCampaignRuleTests'


  Scenario: While an account who does not meet with the relevant rule is added to the inList for this campaign,
  this account should be added to the associates.
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets a rule
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item in rule which is not in rule
    When The user clicks Set Rules button
    Then The item that is set in rule should appear in InList
    Then The item that is set in rule should been associated according to 'CAMPAIGN_ACCOUNT'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'


  Scenario: When an account is edited to meet the rules, this account must be associated for campaign.
    When The user edit an account to meet the rules 'TearDown'
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks Set Rules button
    When The user edit an account to meet the rules 'TestAutomation'
    Then The user verifies that the edited item is associated 'CAMPAIGN_ACCOUNT' 'itemIdForCampaignRuleTests'
    When The user edit an account to meet the rules 'TearDown'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'


  Scenario: When an account is edited to not meet the rules, associate of this item should be removed for campaign.
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks Set Rules button
    When The user verifies that the edited item is associated 'CAMPAIGN_ACCOUNT' 'itemIdForCampaignRuleTests'
    When The user edit an account to meet the rules 'TearDown'
    Then The user verifies that association of this item is removed 'CAMPAIGN_ACCOUNT' 'itemIdForCampaignRuleTests'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'


  Scenario: While an account who meet the rule is added to the NotInList for this campaign,
  this account should be removed from the associates.
    When The user edit an account to meet the rules 'TestAutomation'
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two rule with or operator
    When The user click Calculate button
    When The user clicks view list button
    When The user set an item out rule which is in rule
    When The user clicks Set Rules button
    Then The item that is set out rule should appear in NotInList
    Then The item that is set out rule should not been associated 'CAMPAIGN_ACCOUNT' 'itemIdForCampaignRuleTests'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'
    Then The user edit an account to meet the rules 'TearDown'


  Scenario: When a campaign rule is created with association name, this name should be seen in association table
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button with association name 'RuleTestAutomation'
    Then The user go to rule association tab 'CAMPAIGN_ACCOUNT'
    Then The user verifies that associated item has association name 'RuleTestAutomation'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'


  Scenario: When a campaign rule is created with a random association name,this name should be seen in association table
    When The user go in to item 'itemIdForCampaignRuleTests'
    When The user click rule tab
    When The user delete all rules if any exists
    When The user sets two different rule with and
    When The user clicks Set Rules button with random association name
    Then The user go to rule association tab 'CAMPAIGN_ACCOUNT'
    Then The user verifies that associated item has association name 'Random'
    Then The user tear down all rules 'itemIdForCampaignRuleTests'




