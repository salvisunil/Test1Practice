Feature: Login to OrangeHRM

  @ValidCredentials
  Scenario: Login with valid credentials
    When user is open home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully


    @InvalidCredentialsError
    Scenario Outline: Login with Invalid Credentials
      When User will on homepage
      When User enters username as "<username_incorrect>"
      And User enters password as "<password_incorrect>"
      Then User will get an error message from this "<username_incorrect>" and "<password_incorrect>"

      Examples:
      |username_incorrect |password_incorrect|
      |     sunil         |   admin123       |
      |     Admin         |   password13     |
      |     sunil         |   password123    |

      @RequiredError
      Scenario Outline: Login with blank credentials
        Given User will get on homepage
        When User will enters name as "<username_blank>"
        And  User will enters password as "<password_blank>"
        Then User will get errors "<username_blank>" and "<password_blank>"
        Examples:
        |username_blank|password_blank|
        |              |              |
        |              |  admin123    |
        | Admin        |              |

















