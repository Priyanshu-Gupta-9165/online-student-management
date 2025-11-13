<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:ff6a00,100:ff3c00&height=240&section=header&text=☕%20Java%20Student%20Management%20System&fontSize=38&fontColor=ffffff&animation=fadeIn" />
</p>



# 📘 Online Student Management System (Java + Hibernate + MySQL)

A complete **Java-based Student Management System** developed using:

- **Hibernate ORM**
- **MySQL Database**
- **Maven Build Tool**
- **IntelliJ IDEA**

This project allows you to **Add Students**, **View Students**, and store data in a fully managed MySQL database using Hibernate ORM.  
Even **non-coders** can set up and run this project using the guide below.

---

## 👤 Developed By
**Priyanshu Gupta**  
Assisted by **Jarvis (AI Assistant)** for coding & documentation.

---

## 📚 Table of Contents

- [Overview](#-online-student-management-system-java--hibernate--mysql)
- [Features](#-features)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites-install-before-running)
- [Database Setup](#️-mysql-database-setup)
- [How to Run](#️-how-to-run-the-project)
- [Sample Output](#️-sample-output)
- [Technologies Used](#-technologies-used)
- [Future Enhancements](#-future-enhancements)
- [Support](#-support)
- [Credits](#-credits)

---

## 🔰 Tech Stack & Tools

![Java](https://img.shields.io/badge/Java-17-orange?logo=oracle&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-red?logo=apachemaven)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ-IDE-purple?logo=intellijidea)
![XAMPP](https://img.shields.io/badge/XAMPP-Server-orange?logo=xampp)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?logo=github)



---

# 🚀 Features
- Add new students
- View all stored students
- Automatic table creation using Hibernate
- Clean console-based UI
- MySQL database integration
- Easy to run for beginners
- Maven-based project

---
## 📦 Technologies Used

- Java 17
- Hibernate ORM
- MySQL
- JDBC
- Maven
- IntelliJ IDEA

---

## 📝 Future Enhancements

- Update student details
- Delete student
- Course management
- Fee management with transactions
- Spring Boot version
- Web UI using JSP / HTML / React


---

# 🏗️ Project Structure

```
src/
└── main/
├── java/
│ └── org/example/
│ ├── Main.java
│ ├── Student.java
│ ├── StudentDAO.java
│ └── HibernateUtil.java
└── resources/
└── hibernate.cfg.xml
pom.xml
README.md
```

---

# 🧰 Prerequisites (Install Before Running)

### ✔ 1. Java JDK 17 or above
Download → https://adoptium.net  
Verify: `java -version`

### ✔ 2. Maven
Download → https://maven.apache.org/download.cgi  
Verify: `mvn -version`

### ✔ 3. MySQL (via XAMPP recommended)
Download XAMPP → https://www.apachefriends.org/  
Start in XAMPP:
- MySQL ✔
- Apache (optional)

Open phpMyAdmin: 
http://localhost/phpmyadmin/

### ✔ 4. IntelliJ IDEA
Download → https://www.jetbrains.com/idea/download/

---

# 🛢️ MySQL Database Setup

1. Open phpMyAdmin
2. Click **New**
3. Create a database: `studentdb`

⚠️ **Note:**  
You do *not* need to create tables manually.  
Hibernate will create them automatically.

---

# ⚙️ Hibernate Configuration (Already Done)

File: `src/main/resources/hibernate.cfg.xml`

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/studentdb</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password"></property>
<property name="hibernate.hbm2ddl.auto">update</property>
```
👉 Change username/password only if required.

---

# ▶️ How to Run the Project

Follow these steps to run the Java + Hibernate + MySQL Student Management System:



## Step 1 — Open the Project in IntelliJ IDEA
1. Open IntelliJ
2. Click:
   File → Open
3. Select the project folder: `OnlineStudentManagement/`



## Step 2 — Wait for Maven Dependencies
IntelliJ will automatically download all required libraries.
(You will see “Maven Build Completed” at the bottom.)



## Step 3 — Start MySQL Server
1. Open XAMPP
2. Start "MySQL" service
3. Open phpMyAdmin:  http://localhost/phpmyadmin/


## Step 4 — Create Database
In phpMyAdmin create a database:`studentdb`.
⚠️ You do NOT need to create any tables. Hibernate will automatically generate tables when you run the project.


## Step 5 — Check Hibernate Configuration

Make sure your MySQL login details are correct in the file:`
src/main/resources/hibernate.cfg.xml`
Default configuration:
```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/studentdb</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password"></property>
<property name="hibernate.hbm2ddl.auto">update</property>
```
✔ If your MySQL has a password → add it.

✔ If not → leave empty

---

## Step 6 — Run the Main Class

Go to:`src/main/java/org/example/Main.java`

Click the green Run ▶ button in IntelliJ.

# 📟 Sample Output
```xml
===== Student Management =====
1. Add Student
2. View All Students
3. Exit 
Enter choice:
```
- Example 1: Add Student
```xml
Enter choice: 1
Enter Name: Priyanshu
Enter Course: Java
Enter Fees: 1000
Student Saved!
```
- Example 2: View All Students
```xml
Enter choice: 2
1 | Priyanshu | Java | 1000
```

---


## 📦 Technologies Used

- Java 17
- Hibernate ORM
- MySQL
- JDBC
- Maven
- IntelliJ IDEA

---

## 📝 Future Enhancements

- Update student details
- Delete student
- Course management
- Fee management with transactions
- Spring Boot version
- Web UI using JSP / HTML / React

---

## ⭐ Support
If this project helped you, **Star ⭐ the repository** on GitHub.

---

## © Credits
**Project By:** Priyanshu Gupta  





-------------------------------------
LICENSE (MIT)
-------------------------------------

MIT License

Copyright (c) 2025 Priyanshu Gupta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

-------------------------------------
ISSUE TEMPLATE — bug_report.md
-------------------------------------

name: Bug Report
description: File a bug report
title: "[BUG] - "
labels: bug
body:
  - type: textarea
    id: bug-desc
    attributes:
      label: Describe the bug
      placeholder: Explain the issue clearly.

-------------------------------------
PULL REQUEST TEMPLATE — pull_request.md
-------------------------------------

Pull Request

Description:
Explain what this PR does.

Type of Change:
- Bug fix
- New feature
- Documentation update

Checklist:
- Code compiles correctly
- Tests added (if applicable)
- Documentation updated
