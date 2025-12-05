# DevOps Java Project

A simple Java application demonstrating basic user management functionality.

## Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── devops/
                ├── Main.java
                ├── models/
                │   └── User.java
                ├── services/
                │   └── UserService.java
                └── utils/
                    └── Logger.java
```

## Features

- User model with basic properties (id, name, email)
- UserService for CRUD operations
- Simple logging utility
- Demo application showcasing user management

## How to Compile

```bash
javac -d bin src/main/java/com/devops/**/*.java
```

## How to Run

```bash
java -cp bin com.devops.Main
```
        
## Requirements

- Java 8 or higher

## Author

Created for DevOps demonstration purposes.
