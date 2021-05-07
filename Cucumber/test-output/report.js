$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/DataTable/DataTable.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Login",
  "description": "",
  "id": "customer-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successfull Login",
  "description": "",
  "id": "customer-login;successfull-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enters url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "He enters userName",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "He enters password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Home page is displayed",
  "keyword": "Then "
});
});