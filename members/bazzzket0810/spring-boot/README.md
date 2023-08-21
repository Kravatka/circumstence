# Overview

This repository contains a Spring Boot application that showcases a simple
success pie chart. The application utilizes Spring Data JPA for data access and
Spring MVC for handling HTTP requests. It demonstrates the integration of
backend logic with frontend visualization using Thymeleaf templates.

---

## Table of Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Running the Application](#running-the-application)
- [Usage](#usage)

---

## <a id="description">Description</a>
The SuccessPie application provides a pie chart representation of success
percentages for a given user. It uses Spring Data JPA to interact with a
database to retrieve user-specific success percentages. The frontend is
developed using Thymeleaf templates to visualize the success percentages in the
form of a pie chart.

The application consists of the following components:

- **PieEntity**: This class defines the data structure for storing user-specific
  success percentages. It is annotated with JPA annotations for entity mapping.

- **PieRepository**: This interface extends the Spring Data JPA `JpaRepository`
  and defines custom query methods to retrieve success percentage values from
  the database.

- **PieController**: This controller class handles HTTP requests and interacts
  with the `PieRepository` to fetch success percentages. It then populates the
  model with the data and renders the Thymeleaf template for displaying the pie
  chart.

- **ShowPieMainClass**: This class contains the main method to launch the Spring
  Boot application. It is annotated with `@SpringBootApplication` to enable
  Spring Boot auto-configuration.

---

## <a id="prerequisites">Prerequisites</a>

Before running the application, make sure you have the following prerequisites:

- Java Development Kit (JDK) 17 or later
- Maven

---

## <a id="running-the-application">Running the Application</a>
To run the SuccessPie application, follow these steps:

1. Clone this repository to your local machine:

```
git clone <repository-url>
```

2. Open the application directory:

3. Build the application using Maven:

```
mvn clean install
```

4. Run the application:

```
mvn spring-boot:run
```

The application will start, and you can access it by opening a web browser and
navigating to `http://localhost:8080/pie`.

---

## <a id="usage">Usage</a>
Once the application is running, you can access the success pie chart by
visiting `http://localhost:8080/pie` in your web browser. The pie chart will
display the user-specific success percentages, showcasing both the user's
success percentage and the remaining percentage.

