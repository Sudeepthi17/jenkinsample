

Feature: Login into Adactin Hotel app
  I want to use this template for my feature file
@SmokeTest @SanityTest
  Scenario: Successful login
    Given I want to login into hotel app using valid username as "Sudeepthi01"
    And valid password as "Pizza#2001"
    When I click on login button
    Then I have to get redirected to another page
 @E2ETest
  Scenario: Select location
    Given I want to login into hotel app using valid username as "Sudeepthi01"
    And valid password as "Pizza#2001"
    When I click on login button
    Then I have to get redirected to another page
    And I select location as "Sydney"
    And Click on the search button
    Then I can see the hotel
    
   

  