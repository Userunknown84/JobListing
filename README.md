# 🚀 Job Listing API (Spring Boot + MongoDB)

This is a simple Job Listing REST API built using **Spring Boot 3** and **MongoDB**.  
It allows users to create job posts and search jobs based on text.

---

## 📌 Features

- Add Job Post
- Get All Job Posts
- Search Jobs by text (profile/description)
- MongoDB integration
- Swagger API documentation

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3
- Spring Data MongoDB
- REST API
- Swagger UI

---

---

## 🚀 API Endpoints

### 1️⃣ Home Redirect (Swagger)

GET /

👉 Redirects to Swagger UI

---

### 2️⃣ Get All Posts

GET /posts

✔ Returns all job posts from database

---

### 3️⃣ Add New Post

POST /post

### Body Example:
```json
{
  "profile": "Backend Developer",
  "desc": "Spring Boot developer role",
  "exp": 2,
  "techs": ["Java", "Spring Boot", "MongoDB"]
}
```
Search Posts 

GET /posts/{text}

---



👨‍💻 Author

Aditya Sharma


