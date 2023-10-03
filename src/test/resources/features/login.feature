#author: Evelin Lizeht Muñoz Durango
#email: evelinliz.2199@gmail.com

Feature: The user logs in to the Utest page
  The user can
  log in on the Utest page
  to access the application

  Background:
    Given  The user is on the utest page in the user registration section

  @HappyPath
  Scenario: user logs in correctly

    When The user is at the login screen and enters his or her credentials
      | email                    | password        |
      | evelinl.zz19@yopmail.com | 99062111336Liz* |

    Then The user is logged and watch the message "First things first"

  @NoHappyPath
  Scenario: user logs in correctly

    When The user is at the login screen and enters his or her credentials
      | email                   | password        |
      | ejghvel.z19@yopmail.com | 99062111336Liz* |

    Then the user cannot log in and displays the message "Invalid username or password."

