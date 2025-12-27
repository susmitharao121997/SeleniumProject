# Selenium Automation Project

This repository contains a Selenium WebDriver automation project developed using Java and TestNG. The project demonstrates core web automation concepts and best practices used in real-time QA Automation projects.

## Project Overview

The purpose of this project is to automate functional test scenarios for web applications using Selenium WebDriver. It focuses on browser interaction, element identification, validation, and structured test execution.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Git
- 
## Framework Structure

SeleniumProject
│
├── src
│ ├── main
│ │ └── java
│ │ └── pages
│ │ Page Object classes
│ │
│ └── test
│ └── java
│ └── tests
│ TestNG test classes
│
├── drivers
│ Browser driver executables
│
├── test-output
│ TestNG execution reports
│
├── pom.xml
│ Maven configuration file
│
└── README.md

## Key Features

- Browser launch and navigation
- Element identification using ID, Name, XPath and CSS Selector
- Handling input fields and button actions
- Dropdown handling
- Validation using TestNG assertions
- Test execution using TestNG framework
- Report generation using TestNG

## Prerequisites

- Java JDK 8 or above
- Maven
- Eclipse or IntelliJ IDE
- Compatible browser drivers

## How to Run the Project

1. Clone the repository:
git clone https://github.com/susmitharao121997/SeleniumProject.git

2. Open the project in Eclipse or IntelliJ as a Maven project.

3. Ensure browser drivers are configured correctly.

4. Run the test cases:
   - From IDE: Run as TestNG Test
   - From command line:
mvn test

## Best Practices Followed

- Page Object Model (POM)
- Reusable test methods
- Clear separation of test logic and page elements
- Maintainable and scalable test structure
