# Autor: xxxxxxxxxx
@stories
Feature: Create User
  As a user, I want to be able to create an account on the Utest platform.
  @scenario1
  Scenario: Successful user registration
    Given Jeferson is a user who wants to create an account on the platform

    When He sends the information required for registration

      | strName                    | strLastName  |
      | Jeferson                   | Bettin       |
      | strEmail                   | strMonth     |
      | jeferson.bettin@cun.edu.co | Junio        |
      | strEmail                   | strMonth     |
      | jeferson.bettin@cun.edu.co | Junio        |
      | day                        | year         |
      | 10                         | 1994         |
      | strCity                    | postal       |
      | Chía, Cundinamarca         | 250001       |
      | strPassword                | strConfirm   |
      | SoyPKfO@6F%A               | SoyPKfO@6F%A |

    Then He must obtain a virtual account to be able to enter when required
