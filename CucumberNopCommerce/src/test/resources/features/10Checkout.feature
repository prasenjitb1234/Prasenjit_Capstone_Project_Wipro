Feature: Check user is able to checkout 
@Priority10
Scenario: Successfully checkout an item 
Given open website in default browser
When Page loads click login account 
And search an item 
And open product description 
And add that product to cart and go to cart 
And click on checkbox of terms of service
And click on checkout button 
And click on continue button billing addresss step
And click on continue button shipping method step
And click on continue button payment method step
And click on continue button payment information step
And click on confirm button confirm order step 
And click on order details link
And view order information page
And see all your order in all orders page 
Then successful checked out item 

