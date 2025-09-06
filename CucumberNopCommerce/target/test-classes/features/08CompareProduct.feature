Feature: compare product
@Priority8
Scenario: successfully compare product 
Given open website to compare 
When Page loads hover on computers and go to notebooks
And add first product to compare 
And add second product to compare 
And go to compare products list and wait and scroll down
Then successfully compared product 
