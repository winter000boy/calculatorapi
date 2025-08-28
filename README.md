# Calculator API

Welcome to the **Calculator API** repository! 🧮

This project is a simple yet robust RESTful API for performing basic calculator operations, built with Java and Spring Boot. It demonstrates how to create REST endpoints and handle backend logic for arithmetic computations in a scalable, maintainable way.

---

## 🚩 About This Project

- **Purpose:**  
  To provide a REST API for fundamental arithmetic (addition, subtraction, multiplication, division) using modern backend technologies.
- **Features:**  
  - RESTful endpoints for each calculator operation
  - Input validation and error handling
  - Easily extendable for new operations or features
  - Example usage for integration with front-end apps or testing tools

---

## 🛠️ Tech Stack

- **Spring Boot** – Rapid backend API development
- **Java** – Main application logic
- **REST API** – Stateless endpoints for client interaction
- **Apache Tomcat** – Embedded server for easy deployment

---

## 📂 Project Structure

- `src/main/java/` – Java source code (controllers, services, exception handlers)
- `src/main/resources/` – Configuration files
- `README.md` – Project documentation

---

## 🚀 Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/winter000boy/calculatorapi.git
   cd calculatorapi
   ```

2. **Build and Run the Application**
   ```bash
   ./mvnw spring-boot:run
   ```
   or, using Maven:
   ```bash
   mvn spring-boot:run
   ```

   The API will be available at `http://localhost:8080`.

3. **API Endpoints (Example)**
   - `GET /api/calc/add?num1=10&num2=5` → 15
   - `GET /api/calc/subtract?num1=10&num2=5` → 5
   - `GET /api/calc/multiply?num1=10&num2=5` → 50
   - `GET /api/calc/divide?num1=10&num2=5` → 2
   - (Endpoints may vary based on your implementation)

---

## 🧑‍💻 About the Author

I'm a backend developer passionate about building clean, scalable APIs with Java and Spring Boot. This calculator API is part of my journey to explore and master RESTful services.

---

## 🤝 Contributions

Suggestions and contributions are welcome! Fork, create issues, or submit pull requests.

---

## 📫 Contact

- GitHub: [winter000boy](https://github.com/winter000boy)
- email : sharmajidurgesh04@gmail.com
- LinkedIn : www.linkedin.com/sharmajidurgesh

---

## ⭐️ If you find this project helpful, please star the repository!

---

Happy coding! 🎉
