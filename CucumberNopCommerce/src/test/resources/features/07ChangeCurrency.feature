Feature: Check user is able to change currency 
@Priority07
Scenario: Successfully change currency 
Given open website and currencybox available 
When Page Loads click on Currency Change Dropdown and select currency
Then Successful changed currency 