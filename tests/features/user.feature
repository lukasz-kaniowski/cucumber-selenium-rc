Feature: Users
  In order to quickly manage users
  An administrtor wants to have gui interface for management

  Scenario: Add User
    Given I am on the "User" page
    When I press "add"
    And I fill "name" with "extra user"
    And I submit
    Then I should see notification "User created!"
    And I should see "extra user"
