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

# ▶️ How to Run the Project (Full Guide)

Follow these complete steps to configure and run the Java + Hibernate + MySQL project successfully:

### Step 1 — Start XAMPP (Apache & MySQL)
1. Open the **XAMPP Control Panel**.
2. Click **Start** next to **MySQL** (Default port is 3306).
3. Click **Start** next to **Apache** (Default port is 80 or 8080).
   *(Note: If Apache fails to start, check if port 80 is blocked by Skype or another server).*
4. Verify by opening [http://localhost/phpmyadmin/](http://localhost/phpmyadmin/) in your browser.

### Step 2 — Create the Database
1. Inside **phpMyAdmin**, click on **New** on the left sidebar.
2. Enter the database name: **`studentdb`**.
3. Click **Create**.
> ⚠️ **IMPORTANT:** You do NOT need to create any tables inside `studentdb`. Hibernate is configured (`hibernate.hbm2ddl.auto=update`) to automatically generate the `students` table for you when the program runs.

### Step 3 — Open the Project
1. Open **IntelliJ IDEA**.
2. Go to **File → Open** and select the `OnlineStudentManagement` folder.
3. Wait a few seconds for IntelliJ to download Maven dependencies automatically. *(Check the bottom-right corner for "Syncing" or "Resolving Dependencies" progress)*.

### Step 4 — Verify Hibernate Configuration
Open the config file: `src/main/resources/hibernate.cfg.xml`.
Ensure your MySQL connection properties match your local setup:
```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/studentdb</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password"></property> <!-- Leave empty for default XAMPP -->
```

### Step 5 — Run the Application
You can run the application in two ways:

**Option A: Using IntelliJ IDEA (Recommended)**
1. Open `src/main/java/org/example/Main.java`.
2. Click the **green Play ▶ button** next to `public class Main` or `public static void main`.

**Option B: Using Terminal / PowerShell**
If you prefer running via the terminal, navigate to the project root directory and execute:
```powershell
# 1. Compile the project securely
mvn compile -q

# 2. Get the Classpath and Run the Application
$cp = Get-Content "classpath.txt"; java -cp "target\classes;$cp" org.example.Main
```

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

## 🚨 Common Errors & Solutions (Troubleshooting)

If you face any issues while setting up, check the common errors below:

**1. "Apache shut down unexpectedly" in XAMPP**
* **Reason:** Port 80 is blocked by another application (like Skype or a background web server).
* **Fix:** Open XAMPP Control Panel → Click **Config** (next to Apache) → **httpd.conf**. Find `Listen 80` and change it to `Listen 8080`. Start Apache again and open `http://localhost:8080/phpmyadmin`.

**2. "Table 'studentdb.students' doesn't exist"**
* **Reason:** Hibernate couldn't create the table automatically.
* **Fix:** Make sure `<property name="hibernate.hbm2ddl.auto">update</property>` is present in your `hibernate.cfg.xml`. If the error persists, create the table manually in phpMyAdmin: `CREATE TABLE students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), course VARCHAR(255), fees INT);`

**3. "Communications link failure" or "Access denied for user 'root'"**
* **Reason:** MySQL is not running, or your MySQL has a password.
* **Fix:** Make sure **MySQL** is started in XAMPP. If your MySQL has a password, update `<property name="hibernate.connection.password">YOUR_PASSWORD</property>` in `hibernate.cfg.xml`.

**4. "exec:java / mvn command not found" or "LifecyclePhaseNotFoundException"**
* **Reason:** Maven isn't properly installed or the path isn't set, or `exec-maven-plugin` isn't in `pom.xml`.
* **Fix:** The easiest fix is to just run `Main.java` directly from inside **IntelliJ IDEA** (Option A in the Run Guide).

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




## 📄 License

MIT License © 2025 Priyanshu Gupta


