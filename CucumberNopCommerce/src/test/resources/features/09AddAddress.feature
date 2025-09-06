Feature: Check user is able to add new address
@Priority09
Scenario: Successfully Added new Address
Given Website must open in default browser 
When Page Loads Login and click on My Account
And click on addresses 
And click on add new Button
And fill address information 
And click on save button 
Then successful add a new address