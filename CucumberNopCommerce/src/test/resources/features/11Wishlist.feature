Feature: Check user is able to add and remove item to wishlist 
@Priority11
Scenario: Successfully added item to wishlist
Given Website should open in default browser
When Page loads click on searchbar and enter product 
And view product 

And Add item to Wishlist
And close wishlist popup
And click on wishlist button in navbar

And remove item from wishlist
Then successful updatation in cart

