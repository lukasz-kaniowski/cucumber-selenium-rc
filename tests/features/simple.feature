Feature: Spring mvc know how
  In order to learn spring mvc framework
  a developer wants to play with sandbox application

  Scenario: Simple page
    Given I am on the "Simple" page
    When I press "GET /simple"
    Then I should see "Hello world!"

  Scenario: Forms validation
    Given I am on the "Forms" page
    When I submit
    Then I should see "Form has errors"

  Scenario: Forms
    Given I am on the "Forms" page
    When I fill "name" with "eric"
    And I fill "age" with "34"
    And I submit
    Then I should see "Form submitted successfully."