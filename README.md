# 🐞 Simple Bug Tracker (Java + PostgreSQL)

**Description:**  
This is a lightweight Java console-based bug tracking system using JDBC to connect to a PostgreSQL database. It allows you to insert and retrieve bug records with fields like `title`, `description`, and `status`. It serves as a foundational CRUD (Create, Read, Update, Delete) backend for any issue tracking or task management application.

---

**Components:**  
- **`dbUtil.java`**:  
  Handles the database connection logic using JDBC. Configured to connect to a local PostgreSQL instance.  

- **`bug.java`**:  
  A simple Java class that models a bug entity with `id`, `title`, `description`, and `status`.  

- **`bugdao.java`**:  
  Data Access Object (DAO) class that encapsulates all database operations like inserting bugs and retrieving all bug entries.  

- **`Main.java`**:  
  The main class for testing the bug tracker. It inserts a few sample bugs and prints them to the console.

---

**Design Highlights:**  
- 🔌 **Modular structure** with clear separation of concerns (Model, DAO, Utility, Main).  
- 🛡️ Uses **PreparedStatements** to prevent SQL injection.  
- 🧱 Follows the **DAO pattern**, making it easy to scale or replace the database layer.  
- 🪶 Lightweight — no frameworks, easy to integrate or use as boilerplate code.  
- 🐘 Connects to **PostgreSQL** via standard JDBC with customizable credentials.  
- ✅ Easily extensible for full CRUD functionality or integration with a GUI/web frontend.

---

**Purpose:**  
Designed as a learning or starter project to understand Java database connectivity, clean coding structure, and how to build a simple but meaningful backend module for tracking issues. Can be expanded into a full-stack bug tracking system.

---

**Author:**  
**Lokeshwaran M**  
📧 lokeshwaran.m@epssw.com
