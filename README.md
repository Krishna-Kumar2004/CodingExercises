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
