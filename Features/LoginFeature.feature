
Feature: Login Check
@LoginCheck
 Scenario: Valid Login Test 
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters Credentials to LogIn
 | User  | Pass |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@154 |
 Then Message displayed Login Successfully