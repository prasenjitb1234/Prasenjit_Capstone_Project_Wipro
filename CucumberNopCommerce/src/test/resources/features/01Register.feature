Feature: Check user is able to register to nopcommerce website
@Priority01
Scenario: Successful Registration
Given Register page should open in default browser
When Page Loads click on Register button
And  Select Gender 
And click on First Name and add First Name
And click on Last Name and add Last Name 
And click on Email and add your email
And click on Company and add Company name 
And click on Password and add password 
And click on Confirm Password and enter Confirm Password
And click on Register Button
And click on continue button to navigate to home page
Then Successfully Registered and open home page



