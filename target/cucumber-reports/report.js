$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Login Check",
  "description": "",
  "id": "login-check",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8714189421,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Valid Login Test",
  "description": "",
  "id": "login-check;valid-login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LoginCheck"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Credentials to LogIn",
  "rows": [
    {
      "cells": [
        "User",
        "Pass"
      ],
      "line": 8
    },
    {
      "cells": [
        "testuser_1",
        "Test@153"
      ],
      "line": 9
    },
    {
      "cells": [
        "testuser_2",
        "Test@154"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 133106926,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 2642317802,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_Credentials_to_LogIn(Credentials\u003e)"
});
formatter.result({
  "duration": 5875562616,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 1794873,
  "status": "passed"
});
formatter.after({
  "duration": 170667,
  "status": "passed"
});
});