<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Java21 Spring boot N Encryption & Hashing</title>
  <style>
    body { font-family: Arial, sans-serif; background: #f4f4f4; text-align: center; }
    .banner { background: #2c3e50; color: #fff; padding: 20px; }
    .features { margin: 20px; }
    .features li { list-style: none; padding: 5px; }
  </style>
</head>
<body>
  <div class="banner">
    <h1>🔐 Java21 Encryption & Hashing</h1>
    <p>Secure User Registration Demo Project</p>
<div class="features">
    <h2>✨ Highlights</h2>
    <ul>
      <li>BCrypt Password Hashing</li>
      <li>AES Field Encryption</li>
      <li>Role-based Access Control</li>
      <li>Swagger API Docs</li>
    </ul>
  </div>
  </div>
  
</body>
</html>

---

## 🚀 Overview
<p style="color:#333333; font-weight:bold;">
A demo project built with <span style="color:#333333; font-weight:bold;">Java 21</span> and <span style="color:#333333; font-weight:bold;">Spring Boot</span> showcasing <span style="color:#333333; font-weight:bold;">Encryption, Decryption, Hashing, and Salting</span> for secure user registration.  
Sensitive fields like <span style="color:#333333; font-weight:bold;">passwords, phone numbers, and addresses</span> are protected using <span style="color:#333333; font-weight:bold;">BCrypt hashing</span> and <span style="color:#333333; font-weight:bold;">AES encryption</span>.
</p>

<p style="color:#333333; font-weight:bold;">
This project demonstrates <span style="color:#333333; font-weight:bold;">modern security practices</span> for backend systems and can serve as a <span style="color:#333333; font-weight:bold;">profile upgrade project</span> for interviews or GitLab portfolio.
</p>

---

## ✨ Features
<p style="color:#333333; font-weight:bold;">
🔑 <span style="color:#333333; font-weight:bold;">User Registration</span> with secure storage of sensitive fields
</p>
<p style="color:#333333; font-weight:bold;">
🔐 <span style="color:#333333; font-weight:bold;">BCrypt Hashing</span> for passwords
</p>
<p style="color:#333333; font-weight:bold;">
🧂 <span style="color:#333333; font-weight:bold;">Automatic Salting</span> to strengthen password security
</p>
<p style="color:#333333; font-weight:bold;">
🔒 <span style="color:#333333; font-weight:bold;">AES Encryption/Decryption</span> for phone numbers & addresses
</p>
<p style="color:#333333; font-weight:bold;">
🛡️ <span style="color:#333333; font-weight:bold;">Spring Security</span> with role-based access control
</p>
<p style="color:#333333; font-weight:bold;">
📄 <span style="color:#333333; font-weight:bold;">Swagger UI</span> for API documentation
</p>

---

## 🛠 Tech Stack
<p style="color:#333333; font-weight:bold;">
⚙️ <span style="color:#333333; font-weight:bold;">Java 21</span>
</p>
<p style="color:#333333; font-weight:bold;">
⚙️ <span style="color:#333333; font-weight:bold;">Spring Boot 3</span>
</p>
<p style="color:#333333; font-weight:bold;">
⚙️ <span style="color:#333333; font-weight:bold;">Spring Security</span>
</p>
<p style="color:#333333; font-weight:bold;">
⚙️ <span style="color:#333333; font-weight:bold;">Hibernate/JPA</span>
</p>
<p style="color:#333333; font-weight:bold;">
⚙️ <span style="color:#333333; font-weight:bold;">MongoDB</span>
</p>
<p style="color:#333333; font-weight:bold;">
⚙️ <span style="color:#333333; font-weight:bold;">Maven</span>
</p>

---

## 📡 API Endpoints
<div style="display: flex; justify-content: center; margin: 20px;">
  <table style="border-collapse: collapse; width: 70%; text-align: center; font-weight: bold; color: black; background-color: #f9f9f9;">
    <thead>
      <tr style="background-color: #2c3e50; color: white;">
        <th style="padding: 10px; border: 1px solid #ddd;">Endpoint</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Method</th>
        <th style="padding: 10px; border: 1px solid #ddd;">Description</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td style="padding: 10px; border: 1px solid #ddd;">/api/auth/register</td>
        <td style="padding: 10px; border: 1px solid #ddd;">POST</td>
        <td style="padding: 10px; border: 1px solid #ddd;">Register new user securely</td>
      </tr>
      <tr>
        <td style="padding: 10px; border: 1px solid #ddd;">/api/auth/getUser</td>
        <td style="padding: 10px; border: 1px solid #ddd;">POST</td>
        <td style="padding: 10px; border: 1px solid #ddd;">Fetch user details (decrypted)</td>
      </tr>
    </tbody>
  </table>
</div>

---

##  🔧 Postman Examples
<h4 style="color:#333333; font-weight:bold;">1️⃣ Register User</h4>
<pre style="color:#333333; font-weight:bold; background-color:#f4f4f4; padding:10px; border-radius:5px;">
POST 'localhost:8080/api/auth/register' \
  --header 'Content-Type: application/json' \
  --body '{
    "user_name": "kp",
    "email": "dummy@gmail.com",
    "password": "user@123",
    "phone": "9199887766",
    "address": "mini bajar"
}'
</pre>

<h4 style="color:#333333; font-weight:bold;">2️⃣ Get User</h4>
<pre style="color:#333333; font-weight:bold; background-color:#f4f4f4; padding:10px; border-radius:5px;">
POST 'localhost:8080/api/auth/getUser' \
  --header 'Content-Type: application/json' \
  --body '{
    "email": "dummy@gmail.com"
}'
</pre>

---

## ⚙️ Setup Instructions

<p style="color:#333333; font-weight:bold;">
1️⃣ <span style="color:#333333; font-weight:bold;">Clone the repository</span>
</p>
<pre style="color:#333333; font-weight:bold; background-color:#f4f4f4; padding:10px; border-radius:5px;">
git clone https://gitlab.com/your-username/java21EncryptionHashingNSalting.git
</pre>

<p style="color:#333333; font-weight:bold;">
2️⃣ <span style="color:#333333; font-weight:bold;">Navigate to the project folder and build with Maven</span>
</p>
<pre style="color:#333333; font-weight:bold; background-color:#f4f4f4; padding:10px; border-radius:5px;">
mvn clean install
</pre>

<p style="color:#333333; font-weight:bold;">
3️⃣ <span style="color:#333333; font-weight:bold;">Run the Spring Boot application</span>
</p>
<pre style="color:#333333; font-weight:bold; background-color:#f4f4f4; padding:10px; border-radius:5px;">
mvn spring-boot:run
</pre>

<p style="color:#333333; font-weight:bold;">
4️⃣ <span style="color:#333333; font-weight:bold;">Access Swagger UI</span> at  
http://localhost:8080/swagger-ui/index.html
</p>

---


---

<h2 style="color:#333333; font-weight:bold; text-align:center; text-decoration:underline;">🙏 Thank You</h2>

<p style="color:#333333; font-weight:bold; text-align:center;">
Thank you for exploring this project!  
Your feedback and contributions are always welcome.  
Keep building secure and modern applications with <span style="color:#000000; font-weight:bold;">Java 21</span> and <span style="color:#000000; font-weight:bold;">Spring Boot</span>.
</p>

