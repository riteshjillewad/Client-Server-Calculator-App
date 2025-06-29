# 🧮 Client Server Calculator App

This project implements a **menu-driven calculator** using **Client-Server architecture** with **Java Sockets**. It allows two-way communication between a client and a server, where the client sends arithmetic operation requests, and the server processes them and returns the result.

---

## 📌 Features

- Performs basic arithmetic operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division (integer)
- Menu-driven user interface
- Socket communication using `DataInputStream` and `DataOutputStream`
- Error-handling for invalid choices and division by zero
- Server remains active until client exits

---

## 🧠 Concepts Used

### 1. Java Sockets
- `Socket`: Used by the client to initiate a connection to the server.
- `ServerSocket`: Used by the server to listen for incoming connections on a specific port.

### 2. Data Streams
- `DataInputStream` / `DataOutputStream`: Allow sending and receiving of primitive data types like `int` between client and server.

### 3. Client-Server Communication
- The client connects to the server via a socket and sends operation code and numbers.
- The server processes the request based on the operation and returns the result.
- Both programs continue running until an exit command is issued.

### 4. Scanner
- Used to take input from the user on the client side.

---

## 📂 File Structure
```
├── CalculatorClient.java # Contains client-side logic and UI
├── CalculatorServer.java # Contains server-side arithmetic logic
└── README.md # Project documentation
```

---

## 🔧 How to Compile and Run

### 🖥️ 1. Open two terminal windows:
One for the server, and one for the client.

### 📥 2. Compile the files:
```bash
javac CalculatorServer.java
javac CalculatorClient.java
```

### 🚀 3. Run the server first:
```bash
java CalculatorServer
```

### 💻 4. Then run the client in the other terminal:
```bash
java CalculatorClient
```

---

## 👨‍💻 Author
Name: Ritesh Jillewad <br>
Date: 29-06-2025
