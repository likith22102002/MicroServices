# 🌐 Microservices Project using Spring Boot

A sample microservices architecture project demonstrating how small, independent services communicate using REST APIs. This project includes:

- 📈 **Currency Exchange Service**
- 🔄 **Currency Conversion Service**
- 🧭 Service Discovery with Eureka (can be added)
- 📊 API Gateway (optional extension)
- 🧪 Load balancing (can be extended using Ribbon or Spring Cloud LoadBalancer)

---

## 🧰 Tech Stack

- **Language:** Java 17+
- **Frameworks:** Spring Boot, Spring Web, Spring Cloud
- **Dependencies:** Spring Boot DevTools, Spring Data JPA, RestTemplate
- **Database:** MySQL (for Currency Exchange)
- **Tools:** Maven, IntelliJ / Eclipse, Postman, MySQL Workbench
- **Microservice Pattern:** REST-based communication

---

## 🧱 Microservices Included

### 1. 💱 Currency Exchange Service

- Exposes exchange rates for currency pairs.
- Connected to MySQL database for dynamic data.
- Sample Endpoint:
  Directory Structure

MicroServices/
├── currency-exchange-service/
│ ├── src/
│ └── application.properties
│ └── pom.xml
├── currency-conversion-service/
│ ├── src/
│ └── application.properties
│ └── pom.xml
└── README.md

[User] ---> [Currency Conversion Service] ---> [Currency Exchange Service] ---> [MySQL Database]

- Currency Conversion calls Currency Exchange via REST to fetch the exchange rate.
- Exchange Service fetches the rates from the MySQL database.
- Conversion Service calculates and returns the converted amount.

---

## ⚙️ Setup Instructions

### 1. Clone the Repository
CREATE DATABASE currency_exchange;
USE currency_exchange;

CREATE TABLE exchange_value (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  currency_from VARCHAR(10),
  currency_to VARCHAR(10),
  conversion_multiple DECIMAL(19,2)
);

INSERT INTO exchange_value (currency_from, currency_to, conversion_multiple) VALUES
('USD', 'INR', 82.50),
('EUR', 'INR', 90.00),
('USD', 'EUR', 0.92);

application.properties
server.port=8000
spring.datasource.url=jdbc:mysql://localhost:3306/currency_exchange
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

GET http://localhost:8000/currency-exchange/from/USD/to/INR
Response:

json
Copy code
{
  "id": 10001,
  "currencyFrom": "USD",
  "currencyTo": "INR",
  "conversionMultiple": 82.50,
  "environment": "8000"
}
GET http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/100
Response:

json
Copy code
{
  "id": 10001,
  "currencyFrom": "USD",
  "currencyTo": "INR",
  "conversionMultiple": 82.50,
  "quantity": 100,
  "totalCalculatedAmount": 8250,
  "environment": "8100"
}
Likith L
📧 Email: likithlakshminnaryan@gmail.com
🔗 GitHub: @likith22102002
