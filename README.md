# java-se-training


## Best fit

```java
public class Demo{

    public void addTwoNumbers(int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String ...args){
        addTwoNumbers(5,10);
    }
}


```

## Functional Programming

```java

/*
? Represents a predicate (boolean-valued function) of one argument.
Predicate ->  boolean test(T t)

? Represents a predicate (boolean-valued function) of two arguments.
? This is the two-arity specialization of Predicate
BiPredicate ->  boolean test(T t, U u)

? Represents a function that accepts one argument and produces a result.
Function -> R apply(T t);

? Represents a function that accepts two arguments and produces a result.
? This is the two-arity specialization of Function.
BiFunction -> R apply(T t, U u);

? Represents an operation that accepts a single input argument and returns no result.
? Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
Consumer -> void accept(T t);

? Represents an operation that accepts two input arguments and returns no result.
? This is the two-arity specialization of Consumer.
? Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
BiConsumer -> void accept(T t, U u);

? Represents a supplier of results.
Supplier -> T get();

*/

```

---
marp: true
math: mathjax
paginate: true
size: 16:9
transition:  fade-out
description: Java Spring Boot 3 Microservices
author: John Oenga
url: https://oengajohn.github.io
transition: fade

---

# Java Spring Boot 3 Microservices

By: John Oenga

---

```mermaid
graph TD;
  subgraph Client
    A[Frontend Application] -->|HTTP Requests| B[API Gateway]
  end
  
  subgraph Microservices
    B -->|Routes| C[Product Service]
    B -->|Routes| D[Order Service]
    B -->|Routes| E[Authentication Service]
    B -->|Routes| F[Shopping Cart Service]
    B -->|Routes| G[Payment Service]
  end
  
  subgraph Data Stores
    C -->|CRUD Operations| H[Product Database]
    D -->|CRUD Operations| I[Order Database]
    E -->|User Authentication| J[User Database]
    F -->|CRUD Operations| K[Shopping Cart Database]
    G -->|Payment Processing| L[Payment Gateway]
  end
  
  subgraph Infrastructure
    M[Eureka Server] --> C
    M --> D
    M --> E
    M --> F
    M --> G
    B --> M
  end
  

```

---

```mermaid
graph TD;

  subgraph Client
    A[Frontend Application] -->|HTTP Requests| B[API Gateway]
  end

  subgraph Infrastructure
    style M fill:#9fc,stroke:#333,stroke-width:2px;
    style O fill:#9cf,stroke:#333,stroke-width:2px;
    style Z fill:#9ff,stroke:#333,stroke-width:2px;
    M["Eureka Service Registry"] --> C
    M --> D
    M --> E
    M --> F
    M --> G
    M --> O["Config Server (Git/MongoDB)"]
    M --> Z["Zipkin Distributed Tracing"]
  end
  
  subgraph Microservices
    style C fill:#f9f,stroke:#333,stroke-width:2px;
    style D fill:#f6f,stroke:#333,stroke-width:2px;
    style E fill:#ccf,stroke:#333,stroke-width:2px;
    style F fill:#ccf,stroke:#333,stroke-width:2px;
    style G fill:#9ff,stroke:#333,stroke-width:2px;
    style N fill:#ffc,stroke:#333,stroke-width:2px;
    B -->|Routes| C[Product Service]
    B -->|Routes| D[Order Service]
    B --> E[Authentication Service]
    B -->|Routes| F[Shopping Cart Service]
    B -->|Routes| G[Payment Service]
    D -->|Events| N[Notification Service]
    G -->|Events| N
  end
  
  subgraph Data Stores
    style H fill:#fcf,stroke:#333,stroke-width:2px;
    style I fill:#fcf,stroke:#333,stroke-width:2px;
    style J fill:#fcf,stroke:#333,stroke-width:2px;
    style L fill:#fcf,stroke:#333,stroke-width:2px;
    C -->|CRUD Operations| H["Product Database (MongoDB)"]
    D -->|CRUD Operations| I["Order Database (PostgreSQL)"]
    F -->|CRUD Operations| J["Shopping Cart Database (MySQL)"]
    G -->|Payment Processing| L["Payment Gateway (PostgreSQL)"]
  end
  
  subgraph Messaging
    style P fill:#ccf,stroke:#333,stroke-width:2px;
    P["RabbitMQ"] --> N
  end
  
  subgraph Monitoring
    style Q fill:#9f9,stroke:#333,stroke-width:2px;
    style R fill:#9f9,stroke:#333,stroke-width:2px;
    style S fill:#9f9,stroke:#333,stroke-width:2px;
    Q["Prometheus"] --> M
    R["Grafana"] --> M
    S["ELK Stack"] --> M
  end


```

---

```mermaid
sequenceDiagram
    participant Client
    participant APIGateway
    participant AuthService
    participant ProductService
    participant ShoppingCartService
    participant OrderService
    participant PaymentService
    participant NotificationService
    
    Client->>APIGateway: HTTP Request (Check Product)
    APIGateway->>AuthService: Authenticate Request
    AuthService->>APIGateway: Authentication Response
    APIGateway->>ProductService: Forward Request
    ProductService->>APIGateway: Product Details
    APIGateway->>Client: Product Details Response

    Client->>APIGateway: HTTP Request (Add Product to Cart)
    APIGateway->>AuthService: Authenticate Request
    AuthService->>APIGateway: Authentication Response
    APIGateway->>ShoppingCartService: Forward Request
    ShoppingCartService->>APIGateway: Cart Updated Response
    APIGateway->>Client: Cart Updated Response

    Client->>APIGateway: HTTP Request (Place Order)
    APIGateway->>AuthService: Authenticate Request
    AuthService->>APIGateway: Authentication Response
    APIGateway->>OrderService: Forward Request
    OrderService->>APIGateway: Order Confirmation
    APIGateway->>Client: Order Confirmation Response

    Client->>APIGateway: HTTP Request (Make Payment)
    APIGateway->>AuthService: Authenticate Request
    AuthService->>APIGateway: Authentication Response
    APIGateway->>PaymentService: Forward Request
    PaymentService->>APIGateway: Payment Status
    APIGateway->>Client: Payment Status Response

    Client->>APIGateway: HTTP Request (Send Notification)
    APIGateway->>AuthService: Authenticate Request
    AuthService->>APIGateway: Authentication Response
    APIGateway->>NotificationService: Forward Request
    NotificationService->>APIGateway: Notification Sent
    APIGateway->>Client: Notification Sent Response

    note right of Client: Request Processing Complete
```

---

## Architecture Diagram Overview

## Components

### **API Gateway**

- Acts as the entry point for all incoming requests.
- Routes requests to the appropriate microservices based on defined rules.
- Responsible for authentication and authorization.

---

### Microservices

1. Product Service (MongoDB)
   Manages product information and performs CRUD operations on products.

2. Order Service (PostgreSQL)
    Handles order processing including creation, modification, and retrieval of orders.

3. Shopping Cart Service (MySQL)
    Manages shopping cart functionalities such as adding, updating, and removing items from the cart.

4. Payment Service (PostgreSQL)
    Processes payments for orders using external payment gateways.

5. Authentication Service
    Handles user authentication and issues access tokens.

6. Notification Service
    Sends notifications to users regarding order status, promotions, etc.

---

### Data Stores

- **Product Database (MongoDB)**: Stores product information.
- **Order Database (PostgreSQL)**: Stores order details.
- **Shopping Cart Database (MySQL)**: Stores shopping cart data.
- **Payment Gateway (PostgreSQL)**: Stores payment-related information.

### Infrastructure

- **Eureka Service Registry**: Used for service discovery and registration.
- **Config Server (Git/MongoDB)**: Centralized configuration management.
- **Zipkin Distributed Tracing**: Provides distributed tracing capabilities.
- **Prometheus**: Used for monitoring and alerting.
- **Grafana**: Provides visualization and analytics for monitoring data.
- **ELK Stack (Elasticsearch, Logstash, Kibana)**: Used for log aggregation and analysis.

---

- The Online Shopping Application leverages microservices architecture to provide scalability, flexibility, and maintainability. With the use of an API Gateway, centralized authentication, and distributed tracing and monitoring, the application ensures efficient request handling, security, and visibility into system performance

---

