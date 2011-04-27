Feature: Users
  In order to quickly manage users
  An administrtor wants to have gui interface for management

  @wip
  Scenario: Add User
    Given I am on the "User" page
    When I press "add"
    And I fill "name" with "extra user"
    And I submit
    And I should see "User list"
    And I should see "extra user"
