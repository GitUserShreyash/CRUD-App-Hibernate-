# 🧑‍💼 Employee Management CRUD Application

A full-stack Java web application to perform CRUD (Create, Read, Update, Delete) operations on employee records using **Servlets**, **Hibernate**, and **MySQL**, with a basic **HTML/JSP-based UI**.

---

## 🚀 Features

- ➕ Add New Employee
- 🔍 Get Employee by ID
- 📋 Get All Employees
- ✏️ Update Employee Info
- 🗑️ Delete Employee
- ✅ Hibernate ORM for DB interaction
- 🌐 Servlets for backend logic
- 💻 HTML/JSP for UI

---

## 🛠️ Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Language    | Java 17+           |
| Backend     | Servlets + JDBC + Hibernate |
| ORM         | Hibernate          |
| Frontend    | HTML + JSP         |
| Server      | Apache Tomcat      |
| Database    | MySQL              |
| Build Tool  | Maven              |

---

## 📁 Project Structure
 ``` 
src/
└── main/
├── java/
│ └── com/shreyash/CRUDApp/
│ ├── Dao/
│ │ └── EmployeeDao.java
│ ├── Employee/
│ │ └── Employee.java
│ ├── Servlets/
│ │ ├── AddServlet.java
│ │ ├── DeleteServlet.java
│ │ ├── GetAllServlet.java
│ │ ├── GetEmployeeServlet.java
│ │ └── UpdateServlet.java
│ └── Util/
│ └── HibernateUtil.java
│ └── App.java
├── resources/
└── webapp/
├── META-INF/
├── WEB-INF/
├── add.html
├── DeleteEmployee.html
├── DisplayEmployee.jsp
├── error.html
├── GetAll.jsp
├── GetEmployee.html
├── Home.html
├── Success.html
└── UpdateEmployee.html

## 🎨 User Interface

Here is a screenshot of the Employee Management Portal:

![Employee Management UI](images/ui-screenshot.png)
