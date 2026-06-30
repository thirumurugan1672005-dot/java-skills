# Java Fundamentals - Day 1

## Table of Contents
1. [Introduction](#introduction)
2. [JVM, JDK, and JRE](#jvm-jdk-and-jre)
---
## Introduction

**Java is a Programming Language Designed for: "Write Once, Run Everywhere"**

Java is a powerful, object-oriented programming language created to be platform-independent. This means that code written in Java can run on any machine that has the Java Virtual Machine (JVM) installed, regardless of the operating system or hardware.

### Key Features:
- Everything in Java is written inside a file (typically `.txt` or `.java`)
- Each file has a different file format
- Java Virtual Machine executes the compiled Java byte code
- Platform-independent execution across Windows, Linux, macOS, etc.

---

## JVM, JDK, and JRE

Understanding the difference between these three components is crucial for Java development.

### JVM (Java Virtual Machine)
- **Purpose**: Executes compiled Java code (byte code)
- **Functionality**: Acts as an abstract computing machine that enables a computer to run Java programs and programs written in other languages that are compiled to Java bytecode
- **Key Point**: JVM is what makes Java platform-independent

### JRE (Java Runtime Environment)
- **Purpose**: Provides the environment needed to run Java applications
- **Contains**: 
  - JVM (Java Virtual Machine)
  - Java libraries (standard library)
  - Other components necessary for running Java programs
- **Use Case**: For end users who want to run Java applications (not development)

### JDK (Java Development Kit)
- **Purpose**: Complete development environment for Java developers
- **Contains**: 
  - JRE (Java Runtime Environment)
  - JVM (Java Virtual Machine)
  - Compiler (javac) - converts `.java` to `.class`
  - Development tools and libraries
  - Documentation
- **Use Case**: For developers who need to write, compile, and test Java code

### The Relationship:
```
JDK = JRE + Development Tools (compiler, debugger, etc.)
JRE = JVM + Libraries
```

---
