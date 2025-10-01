
# 🚀 AstronutTaskScheduler

## 📖 Introduction
The **AstronutTaskScheduler** is a console-based Java application designed to help astronauts manage their **daily schedules** efficiently.  

It allows users to:
- Add new tasks with **start time, end time, and priority**.  
- Remove tasks by description.  
- View all scheduled tasks sorted by time.  
- Detect and notify if any task **conflicts** (overlaps) with an existing task.  

This project demonstrates strong **object-oriented programming principles (OOP)**, **SOLID design principles**, and uses **design patterns** to make the system maintainable, extensible, and robust.

---

## 🛠️ Key Features
- **Add / Remove / View Tasks** (menu-driven interface).  
- **Validations**: Ensures no invalid times, empty descriptions, or invalid priorities.  
- **Conflict Detection**: Alerts if a new task overlaps with an existing task.  
- **Design Patterns Implemented**:
  - **Singleton** → `ScheduleManager` (only one schedule manager exists).
  - **Factory** → `TaskFactory` (creates validated `Task` objects).
  - **Observer** → `ConflictObserver` (notifies users of scheduling conflicts).
- **Logging**: Uses `java.util.logging` for structured logs.
- **Exception Handling**: Custom `TaskConflictException` ensures safe task creation.

---

## 📂 Project Structure
    AstronutTaskScheduler/
            ├── Main.java
            ├── config/
            │ └── Config.java
            ├── exceptions/
            │ └── TaskConflictException.java
            ├── manager/
            │ └── ScheduleManager.java
            ├── model/
            │ ├── Task.java
            │ └── TaskFactory.java
            ├── observer/
            │ ├── ConflictObserver.java
            │ └── ConsoleConflictObserver.java
            └── utils/
            └── LoggerFactory.java

---

## ▶️ How to Run
        1.Import into IntelliJ or preferred IDE.
        2.Build and run desired modules as described.
        3.Follow input formats exactly for interactive parts.
### 1. Compile
Navigate to the project root and compile all files:
```bash
javac AstronutTaskScheduler/**/*.java AstronutTaskScheduler/*.java
==== Astronaut Daily Schedule ====
1. Add Task
2. Remove Task
3. View Tasks
0. Exit
Choose option: 1

Enter description: Spacewalk Prep
Enter start time (HH:mm): 09:00
Enter end time (HH:mm): 10:00
Enter priority (Low/Medium/High): High
Task added successfully.

==== Astronaut Daily Schedule ====
1. Add Task
2. Remove Task
3. View Tasks
0. Exit
Choose option: 3

09:00 - 10:00: Spacewalk Prep [High]

