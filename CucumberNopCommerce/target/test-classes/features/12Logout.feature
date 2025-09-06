Feature: check user is able to logout from website
@Priority12
Scenario: successful logout
Given page should open in default browser 
When the page loads first login to the website 
And click on Logout button 
Then successfully logged out 