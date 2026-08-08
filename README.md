# 🏡 EstatePilotAI

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-red?style=for-the-badge">
  <img src="https://img.shields.io/badge/Spring%20Boot-4.x-success?style=for-the-badge">
  <img src="https://img.shields.io/badge/PostgreSQL-15-blue?style=for-the-badge">
  <img src="https://img.shields.io/badge/React-19-61DAFB?style=for-the-badge">
  <img src="https://img.shields.io/badge/TailwindCSS-4.x-38BDF8?style=for-the-badge">
  <img src="https://img.shields.io/badge/JWT-Authentication-orange?style=for-the-badge">
</p>

<p align="center">

### AI-Powered Modern Real Estate Platform

Search • Buy • Sell • Rent • Manage • Invest • Analyze

</p>

---

# 🌍 Overview

EstatePilotAI is a full-stack AI-powered real estate platform designed for modern buyers, sellers, real estate agents, and property investors.

The platform combines intelligent property discovery, secure authentication, advanced search, analytics, and AI recommendations into one seamless experience.

Unlike traditional listing websites, EstatePilotAI provides personalized recommendations, smart search capabilities, market insights, and interactive dashboards to help users make better property decisions.

---

# ✨ Features

## 🔐 Authentication

- JWT Authentication
- Secure Login
- User Registration
- BCrypt Password Encryption
- Role Based Authorization
- Protected APIs

---

## 🏠 Property Management

- Create Property
- Update Property
- Delete Property
- View Property
- Search Properties
- Property Categories
- Property Availability
- Property Gallery
- Featured Properties

---

## 🔍 Smart Search

- Search by City
- Search by State
- Search by Country
- Search by Price
- Search by Bedrooms
- Search by Bathrooms
- Search by Property Type
- Advanced Filters
- Sorting
- Pagination

---

## ❤️ User Features

- Favorites
- Saved Searches
- User Dashboard
- Profile Management
- Property History
- Recently Viewed

---

## 📊 Analytics Dashboard

- Total Listings
- Active Listings
- Sold Properties
- Monthly Statistics
- Price Trends
- Property Insights
- Admin Dashboard

---

## 🤖 AI Features

- AI Property Recommendation
- Natural Language Property Search
- AI Chat Assistant
- Smart Investment Suggestions
- Market Trend Analysis
- Personalized Property Feed

---

## 🔒 Security

- Spring Security
- JWT Authorization
- BCrypt Encryption
- Role Based Access Control
- Global Exception Handling
- Input Validation

---

## 📄 API Documentation

- Swagger UI
- OpenAPI 3
- Interactive API Testing

---

# 🛠 Technology Stack

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate ORM
- PostgreSQL
- Flyway
- JWT
- Maven
- Lombok

---

## Frontend

- React
- Vite
- Tailwind CSS
- Axios
- React Router
- Framer Motion

---

## AI

- OpenAI
- LangChain
- Vector Search
- Embedding Models
- Recommendation Engine

---

## DevOps

- Docker
- Docker Compose
- GitHub Actions
- Nginx
- AWS
- Vercel

---

# 📂 Project Structure

```
EstatePilotAI
│
├── backend
│   ├── auth
│   ├── property
│   ├── config
│   ├── exception
│   └── resources
│
├── frontend
│   ├── components
│   ├── pages
│   ├── hooks
│   ├── services
│   └── assets
│
├── docs
│
├── docker
│
└── architecture
```

---

# 🔐 Authentication Flow

```
User
   │
   ▼
Register
   │
   ▼
BCrypt Password Encryption
   │
   ▼
PostgreSQL
   │
   ▼
Login
   │
   ▼
JWT Generation
   │
   ▼
Bearer Token
   │
   ▼
Protected APIs
```

---

# 🏗 System Architecture

```
React Frontend
       │
       ▼
REST API
       │
       ▼
Spring Boot
       │
 ┌─────┴──────┐
 │            │
 ▼            ▼
 PostgreSQL   AI Services
 │            │
 ▼            ▼
 Flyway     Recommendation Engine
```

---

# 📡 REST APIs

## Authentication

```
POST   /api/auth/register
POST   /api/auth/login
```

---

## Properties

```
GET      /api/properties
GET      /api/properties/{id}
POST     /api/properties
PUT      /api/properties/{id}
DELETE   /api/properties/{id}
```

---

## Users

```
GET /api/users/profile
PUT /api/users/profile
```

---

## Favorites

```
POST /api/favorites
GET  /api/favorites
DELETE /api/favorites/{id}
```

---

## AI

```
POST /api/ai/search
POST /api/ai/recommend
POST /api/ai/chat
```

---

# 🚀 Installation

```bash
git clone https://github.com/avi9prasad/EstatePilotAI.git

cd EstatePilotAI
```

Backend

```bash
cd backend

./mvnw spring-boot:run
```

Frontend

```bash
cd frontend

npm install

npm run dev
```

---

# 🌐 Application

Frontend

```
http://localhost:5173
```

Backend

```
http://localhost:8080
```

Swagger

```
http://localhost:8080/swagger-ui.html
```

---

# 📈 Highlights

- Secure JWT Authentication
- Enterprise Spring Boot Architecture
- PostgreSQL Database
- AI Powered Recommendation Engine
- Interactive Dashboard
- Responsive UI
- RESTful APIs
- Clean Layered Architecture
- Production Ready

---

# 🤝 Contributing

Contributions are welcome.

Fork the repository, create a feature branch, commit your changes, and open a Pull Request.

---

# 📜 License

MIT License

---

# 👨‍💻 Author

## Abhinav Prasad

**GitHub**

https://github.com/avi9prasad

--

<p align="center">

### ⭐ Star this repository if you found it useful!

Built with ❤️ using Java, Spring Boot, React & AI

</p>
