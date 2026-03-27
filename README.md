# 🚀 Selenium Automation Framework – OpenCart

## 📌 Project Overview
This project is a Selenium-based Test Automation Framework developed using Java, TestNG, and Maven. It follows the Page Object Model (POM) design pattern to ensure scalability, maintainability, and reusability.

The framework automates key functionalities of an OpenCart web application, including user registration, login, product search, and add-to-cart workflows.

---

## 🛠️ Tech Stack
- Programming Language: Java  
- Automation Tool: Selenium WebDriver  
- Test Framework: TestNG  
- Build Tool: Maven  
- Design Pattern: Page Object Model (POM)  
- Reporting: Extent Reports  
- Data Handling: Excel (Data-Driven Testing)  
- Version Control: Git & GitHub  

---

## 📂 Project Structure

OpenCart/
│
├── src/test/java
│   ├── pageObjects        # Page classes (POM design)
│   ├── testBase           # Base class (setup & configuration)
│   ├── testCases          # Test cases
│   └── utilities          # Utility classes (Excel, Reports, DataProvider)
│
├── src/test/resources     # Config files (config.properties)
│
├── reports                # Extent Reports
├── screenshots            # Failure screenshots
├── testData               # Test data (Excel files)
│
├── testng.xml             # Test suite execution
├── grouping.xml           # Test grouping
├── crossbrowsertesting.xml # Cross-browser execution
├── pom.xml                # Maven dependencies
├── run.bat                # Command-line execution

---

## ✅ Features Implemented
- Page Object Model (POM) design pattern  
- Data-Driven Testing using Excel  
- Cross-browser testing  
- Parallel execution using TestNG  
- Test grouping using TestNG XML  
- Extent Reports integration  
- Screenshot capture on test failure  
- Maven-based build and execution  
- Command-line execution using run.bat  

---

## 🧪 Test Scenarios Covered
- User Registration  
- Login Functionality  
- Login with Data-Driven Testing  
- Product Search  
- Add to Cart  

---

## ▶️ How to Run the Project

### Using TestNG (IDE)
Right-click on testng.xml → Run as TestNG Suite  

### Using Maven (Command Line)
mvn clean test  

### Using Batch File
run.bat  

---

## 📊 Reporting
- Reports are generated using Extent Reports  
- Available in /reports folder  
- Screenshots captured in /screenshots for failed tests  

---

## 🔄 Data-Driven Testing
- Test data is stored in Excel files inside /testData  
- Data is read using DataProvider Utility  

---

## 🌐 Cross Browser Testing
- Configured using crossbrowsertesting.xml  
- Supports execution on multiple browsers  

---

## 📌 Key Highlights
- Modular and scalable framework  
- Reusable page classes  
- Clean separation of test logic  
- Industry-standard automation practices  

---

## 👩‍💻 Author
Manisha Bathala  
Email: bathalamanisha@gmail.com  
LinkedIn: https://www.linkedin.com/in/manishabathala24
GitHub: https://github.com/manishabathala  
