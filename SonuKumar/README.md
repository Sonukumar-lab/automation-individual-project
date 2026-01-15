# OrangeHRM Login Automation Project 

Student Name: Sonu Kumar  
Milestone: 1  

## Overview
This project focuses on automating the login module of the OrangeHRM demo website. The automation is implemented using Selenium WebDriver with Java, following best practices like the Page Object Model (POM) for better maintainability and scalability.

## Tools & Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver

## Framework Architecture
- Page Object Model (POM) design pattern
- Base test class for browser initialization and cleanup
- Automatic screenshot capture on test failure
- Maven Surefire Plugin for test execution

## Automated Test Scenarios
1. Login with valid username and valid password
2. Login with valid username and invalid password
3. Login with invalid username and valid password
4. Login with invalid username and invalid password
5. Login with empty username field
6. Login with empty password field
7. Login with both username and password empty
8. Username input containing spaces
9. Verification of password field masking
10. Login button enable/disable validation

## How to Execute the Tests
Open Git Bash or terminal and run the following command:

mvn clean test
