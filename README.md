# School Department System

##  Project Overview

The **School Department System** is a console-based Java application developed using **Object-Oriented Programming (OOP)** principles.
The system models the structure and operations of a school environment, including staff management, student enrollment, course allocation, and departmental activities.

This project demonstrates real-world software design by applying core OOP concepts such as **encapsulation, inheritance, abstraction, polymorphism, aggregation, and composition**.

---

## Project Objectives

The main objective of this project is to simulate how a school department operates by modelling different participants and their responsibilities within the system.

The application allows:

* Principals to admit or expel students
* Teachers to teach courses
* Students to take courses
* Management of staff and student records
* Admission of applicants based on eligibility criteria (e.g., age)

---

## 🏫 System Actors

The system consists of the following entities:

* **Principal
* **Teachers
* **Students
* **Applicants
* **Courses
* **School Classes

Each entity performs specific roles reflecting real-life school operations.

---

##  Architecture & Design

The project follows a layered architecture:

```
school-department-system
│
├── model      → Entity classes (Student, Staff, Course, etc.)
├── service    → Business logic implementation
├── enums      → Constant values and system configurations
└── test       → Unit tests (JUnit)
```

### Design Principles Used

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Interfaces & Abstract Classes
* Single Responsibility Principle
* Aggregation & Composition

---

##  Technologies Used

* **Java**
* **JUnit 5** (Unit Testing)
* **IntelliJ IDEA**
* **Git & GitHub**

---

##  Features Implemented

* Applicant admission based on age requirements
* Student enrollment and course participation
* Teacher course assignment
* Staff management system
* Object-oriented class hierarchy
* Unit testing with test coverage

---

##  Testing

The project follows **Test Driven Development (TDD)** principles.

Unit tests were written using **JUnit** to verify:

* Method functionality
* Business logic conditions
* System behaviors

Target test coverage: **~80%**

---

##  How to Run the Project

1. Clone the repository:

```
git clone https://github.com/xtyuchua/SchoolDepartmentSystem.git
```

2. Open the project in IntelliJ IDEA.

3. Build the project:

```
Build → Rebuild Project
```

4. Run the main application class.

---

## 👩‍💻 Author

**Christy Uchua**

---

## 📄 License

This project is created for educational purposes as part of an Object-Oriented Programming coursework assignment.
