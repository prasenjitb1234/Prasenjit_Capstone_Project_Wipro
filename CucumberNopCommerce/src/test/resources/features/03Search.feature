Feature: Check user is able to search product
@Priority03
Scenario Outline: check search is Succesful 

Given Login User and search bar available
When Enter <item>  and click search button
Then list of output relevant to input

Examples:
  | item   |
  | laptop |
  | shoes  |
  | phone  |
  | book |