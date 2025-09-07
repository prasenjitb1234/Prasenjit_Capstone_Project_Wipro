# Feature: Check user is able to login using valid credentials


# Scenario: Successful Login
# Given Login Page should open in default browser
# When Page Loads click on Log In Button
# And click on email and enter email
# And click on password and enter password
# And click on login button 
# Then successfully logged and open home page


Feature: Check user is able to login using valid credentials

@Priority02
Scenario Outline: Login with multiple credentials
  Given Login Page should open in default browser
  When Page Loads click on Log In Button
  And click on email and enter <email>
  And click on password and enter <password>
  And click on login button
  Then login successful and <status>

Examples:
  | email                          | password     | status |
   | prasenjitbhosale1234@gmail.com  | Bhosale@1234   | true   |
  | user1@test.com                  | randomfakepass | false  |
  | prasenjitbhosale1234@gmail.com  | Bhosale@1234   | true   |
  | prasenjit101@gmail.com          | Bhosale@1234   | true   |
  | peter01@gmail.com               | Bhosale@1234   | true   |

  
  
  
#    | spiderman01@gmail.com | spiderman01 | true   |
#    | spiderman02@gmail.com | spiderman02 | true   | 
#    | prasenjitbhosale10@gmail.com | Bhosale@1234  | true   |

