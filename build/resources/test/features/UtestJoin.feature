# Autor: xxxxxxxxxx
@stories
Feature: Create User
  As a user, I want to be able to create an account on the Utest platform.
  @scenario1
  Scenario: Successful user registration
    Given Jeferson is a user who wants to create an account on the platform

    When He sends the information required for registration
      | strName  | strLastName | strEmail                   | strMonth | strEmail                   | strMonth | day | year | strCity            | postal | strPassword  | strConfirm   |
      | Jeferson | Bettin      | jeferson.bettin@cun.edu.co | Junio    | jeferson.bettin@cun.edu.co | Junio    | 10  | 1994 | Chía, Cundinamarca | 250001 | SoyPKfO@6F%A | SoyPKfO@6F%A |

    Then He must obtain a virtual account to be able to enter when required
