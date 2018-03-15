Feature:
  As an user
  I want to log-in to personal cabinet

  Scenario: Log-in to personal cabinet
    Given I am on Log-in page
    When I fill in "Username" with "admin@admin.com" and "Password" with "adminadmin"

  Scenario Outline: Log-in to personal cabinet
    When I fill in "Username" with "<username>" and "Password" with "<password>"
    Then I should see "<warning>" message
    Examples:
      | username    | password   | warning                           |
      | Test        | !23        | Неправильный логин или пароль.    |
      | Tset        | 123        | Неправильный логин или пароль.    |