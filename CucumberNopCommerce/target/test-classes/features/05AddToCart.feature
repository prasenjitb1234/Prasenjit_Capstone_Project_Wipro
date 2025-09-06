Feature: Check user is able to add item to cart
@Priority05
Scenario: Successfully added item to cart
Given Open Website and add to cart 
When Page loads login to website 
And click on searchbar then  enter an item and search 
And open and view product 
And add item to cart 
And go to cart 
Then successful add item to cart 
