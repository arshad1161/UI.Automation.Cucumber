Feature: Login OrangeHRM 

Scenario: Login with valid credentials
Given launch the "chrome" website
When open the website
 Then user login with valid username "admin" password "admin123"
 And Verfy the Home Page
 Then close the browser



