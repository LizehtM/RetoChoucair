#author: Evelin Lizeht Muñoz Durango
#email: evelinliz.2199@gmail.com

Feature: create a user registration on the Utest page
  The web user can
  register on the Utest page
  to have access to the application

  Background:
    Given  The user is on the utest page in the user registration section


  Scenario: Register successful user

    When enter registration information
      | firstName | lastName | email                     | dateOfBirth  | language | password        |
      | Lizeht    | Munoz    | eveleerl.zz19@yopmail.com | June-21-1999 | Spanish  | 99062111336Liz* |

    Then registration confirmation message is displayed "Welcome to the world's largest community of freelance software testers!"



