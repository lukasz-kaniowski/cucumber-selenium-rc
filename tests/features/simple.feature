Feature: Spring mvc know how
  In order to learn spring mvc framework
  a developer wants to play with sandbox application

  Scenario: Simple page
    Given I am on the "Simple" page
    When I press "GET /simple"
    Then I should see "Hello world!"
