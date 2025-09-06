Feature: Check user is able to remove item from the cart
@Priority06
Scenario:
Successfully removed item from the cart
Given Open Website and hover check shopping cart
When Page loads first login to the website for smooth cart flow 
And  Hover over shopping cart and click on go to cart 
And Click on remove product cross button
Then successful item removed from cart 