### 3-Tier Architecture Overview

This project follows a **3-tier architecture**, which separates the application into three distinct layers to improve maintainability, scalability, and testability. These layers are:

1. **Model Layer (Domain Layer)**:
    - This layer represents the real-world entities of the application. Each class in the model layer corresponds to an entity in the database (e.g., `Member`, `Trainer`, `Admin`). The model contains the attributes of the entity, along with getter and setter methods to manipulate the data.
    - **Responsibilities**:
        - Encapsulates the data and properties of entities.
        - Provides the structure of data that is used throughout the application.

2. **DAO Layer (Data Access Object)**:
    - The DAO layer is responsible for all interactions with the database. It contains the logic to perform **CRUD (Create, Read, Update, Delete)** operations on the database. The DAO layer abstracts the database logic, ensuring that the rest of the application doesn't have to deal with SQL queries or connection management directly.
    - **Responsibilities**:
        - Interacts with the database to fetch and store data.
        - Executes SQL queries and handles database connections.
        - Each entity has its own DAO (e.g., `MemberDAO`, `TrainerDAO`), which is responsible for that entity's database operations.

3. **Service Layer**:
    - The Service layer acts as the intermediary between the DAO layer and the rest of the application. It contains the business logic of the application and orchestrates the interaction between the model and DAO layers. The Service layer ensures that business rules are applied before and after interacting with the database.
    - **Responsibilities**:
        - Contains the business logic of the application (e.g., validating inputs, processing data).
        - Calls methods from the DAO layer to perform database operations.
        - Coordinates complex workflows that involve multiple DAOs or entities.

### How It Works Together
- **Model Layer**: Represents the data structure (e.g., a `Member` with attributes like name, email, and join date).
- **DAO Layer**: Manages the database interaction (e.g., fetching all members from the database, adding a new member).
- **Service Layer**: Handles the business logic (e.g., registering a new member, fetching members with certain criteria) and uses the DAO layer to retrieve or store data.

By separating these concerns, the application is easier to maintain, test, and extend. Each layer has a single responsibility, allowing for better code organization and improved collaboration between developers working on different parts of the application.
