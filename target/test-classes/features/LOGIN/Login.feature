@LoginTest
Feature: Login to Facebook
  Login to facebook

  @LoginValid
  Scenario Outline: Login to facebook with valid inputs
    Given I am o n the lgin page facebook
    When I enter the"<username>" and "<password>"
    And I click on the login button
    Then I am able to successfully login

    Examples: 
      | username | password |
      |          |          |
