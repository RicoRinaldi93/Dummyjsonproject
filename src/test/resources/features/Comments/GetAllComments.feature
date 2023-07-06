Feature: Get All Comments
  Scenario: Get All Comments with Valid Auth
    Given Get All Comments
    When Send Request Get All Comments
    Then Should return status code 200