Feature: Add multiple participant through API

  Scenario: To verify UserRegistration API for mulltiple users : POST
    Given I want to execute UserRegistration API
    When I submit the POST request to create Single User
    Then I should get 201 success status code with respose body
