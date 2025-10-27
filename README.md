# S3.01-Patterns

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises focused on **Design Patterns**.

---

## 🧩 Level 1 – Singleton

### 🧠 Exercise Goal
Create a class that replicates the behavior of the `Undo` command.  
The class must:
- Store the latest user commands.
- Allow adding, deleting, and listing past commands.
- Be implemented using the **Singleton Pattern** to ensure a single instance.

### 🏗️ Implementation Overview
- **Class `Undo`**:  
  Implements a `List<String>` to store commands and provides methods to add, remove, and view them.  
  Uses a private constructor and a static `getInstance()` method to ensure only one instance exists.
- **Class `UndoController`**:  
  Acts as a mediator between `Main` and the `Undo` instance.
- **Class `UndoMenu`**:  
  Handles the command input and output logic.
- **Class `Main`**:  
  Demonstrates the use of the Singleton pattern by interacting with the single `Undo` instance.

### 🧠 Key Concept
> The Singleton pattern ensures that only one instance of a class exists across the entire program.

---

## 🧩 Level 2 – Abstract Factory

### 🧠 Exercise Goal
Create an address and phone number manager for international contacts using the **Abstract Factory Pattern**.

### 🏗️ Implementation Overview
- **Factories**
    - `SpainFactory`
    - `USAFactory`

  Each factory creates objects that match the format of its respective country.

- **Products**
    - `Address` and `PhoneNumber` (interfaces)
    - `SpainAddress`, `USAAddress`
    - `SpainPhone`, `USAPhone`

- **Client Classes**
    - `Contact`: represents a single contact (name, address, and phone).
    - `AddressBook`: stores and lists multiple contacts.
    - `Main`: creates and displays international contacts using different factories.

### 🌍 Country-Specific Formats
- **Spain**
    - Phone format: `+34 600123456`
    - Address format: `Calle Mayor 15, Madrid, España`
- **USA**
    - Phone format: `+1 (202) 555-0100`
    - Address format: `742 Evergreen Terrace, Springfield, NY, USA`

### 🧠 Key Concept
> The Abstract Factory pattern provides an interface to create families of related objects (addresses and phones) without specifying their concrete classes.

---

## 🧩 Level 3 – Command

### 🧠 Exercise Goal
Design a parking system with four vehicles: **Car**, **Bike**, **Airplane**, and **Boat**.  
Demonstrate the **Command Pattern** by implementing `start`, `accelerate`, and `brake` actions for each type.

### 🏗️ Implementation Overview
- **Commands**
    - `StartVehicleCommand`
    - `AccelerateVehicleCommand`
    - `BrakeVehicleCommand`
    - All implement a shared `Command` interface.

- **Receiver**
    - `Vehicle` interface implemented by:
        - `Car`
        - `Bike`
        - `Airplane`
        - `Boat`
    - Each provides its own behavior for `start()`, `accelerate()`, and `brake()`.

- **Invoker**
    - `VehicleInvoker`: executes any `Command` via the `execute(Command)` method.

- **Client**
    - `Main`: creates the vehicles and their corresponding commands, then executes them through the invoker.

### 🧠 Key Concept
> The Command pattern encapsulates a request as an object, allowing you to parameterize and execute actions without knowing their exact implementation.

---

## 💻 Technologies Used
- Java 17
- IntelliJ IDEA
- Git & GitHub

---

## 📋 Requirements
- JDK 17 or higher
- IntelliJ IDEA (or any Java-compatible IDE)
- Git

---

## 🛠️ Installation
Clone the repository and open it in IntelliJ IDEA:

```sh
git clone https://github.com/leilaweicman/S3.Patterns.git
cd S3.01-patterns
```

---

## ▶️ Execution

### Level 1 – Singleton

Run:
```sh
java nivel1.Main
```

Expected output (example):
```yaml
Command added: list files
Command added: open document
Command removed: list files
History: open document
```

--- 

### Level 2 – Abstract Factory

Run:
```sh
java nivel2.Main
```

Expected output (example):
```yaml
Address Book:

Name: Carlos García
Address: Calle Mayor 15, Madrid, España
Phone: +34 600123456

Name: John Smith
Address: 742 Evergreen Terrace, Springfield, NY, USA
Phone: +1 (202) 555-0100
```

--- 

### Level 3 – Command

Run:
```sh
java nivel3.Main
```

Expected output (example):
```yaml
Car actions:
The car engine starts.
The car accelerates on the road.
The car slows down and stops.

Airplane actions:
The airplane engines start.
The airplane accelerates down the runway.
The airplane slows down after landing.
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
