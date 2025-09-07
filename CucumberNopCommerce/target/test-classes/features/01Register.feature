Feature: Check user is able to register to nopcommerce website
@Priority01
Scenario Outline: Successful Registration

Given Register page should open in default browser
When Page Loads click on Register button
And Select Gender
And click on First Name and add "<fname>"
And click on Last Name and add "<lname>"
And click on Email and add "<email>"
And click on Company and add "<company>"
And click on Password and add "<password>"
And click on Confirm Password and enter "<confirmPassword>"
And click on Register Button
And click on continue button to navigate to home page
Then Successfully Registered and open home page

Examples:
Examples:
  | fname     | lname   | email                  | company | password     | confirmPassword |
  | Prasenjit | Bhosale | prasenjit101@gmail.com | Wipro   | Bhosale@1234 | Bhosale@1234    |
  | Prasenjit | Bhosale | prasenjit1234@gmail.com| Wipro   | Bhosale@1234 | Bhosale@1234    |
  | Peter     | Parker  | peter01@gmail.com      | Infosys | Bhosale@1234 | Bhosale@1234    |





