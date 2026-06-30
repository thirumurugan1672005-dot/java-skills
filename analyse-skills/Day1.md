# Java Programming Fundamentals - Complete Guide

## Table of Contents
1. [Introduction](#introduction)
2. [JVM, JDK, and JRE](#jvm-jdk-and-jre)
3. [Data Types](#data-types)
4. [Type Conversion](#type-conversion)
5. [Variables](#variables)
6. [Comments](#comments)
7. [Reserved Keywords](#reserved-keywords)
8. [Naming Rules for Variables](#naming-rules-for-variables)
9. [Classes and File Structure](#classes-and-file-structure)
10. [How Java Runs](#how-java-runs)

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

## Data Types

Java has **8 primitive data types** that store values directly in stack memory.

### Primitive Data Types

| Type | Size | Range | Example |
|------|------|-------|---------|
| **byte** | 8 bits | -128 to 127 | `byte b = 50;` |
| **short** | 16 bits | -32,768 to 32,767 | `short s = 1000;` |
| **int** | 32 bits | -2,147,483,648 to 2,147,483,647 | `int x = 100000;` |
| **long** | 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `long y = 1243L;` |
| **float** | 32 bits | Single-precision floating point | `float f = 3.14f;` |
| **double** | 64 bits | Double-precision floating point | `double d = 3.14159;` |
| **boolean** | 1 bit | true or false (NOT 0 or 1) | `boolean isValid = true;` |
| **char** | 16 bits | Unicode characters (0 to 65,535) | `char c = 'A';` |

### Key Points About Primitives:
- **Stored in Stack**: Primitives store their value directly in stack memory
- **Fixed Size**: Each primitive has a fixed size
- **Performance**: Faster than reference types because they are stored directly in memory
- **Memory Efficient**: Require less memory compared to objects

### Boolean Type:
- Only stores `true` or `false`
- Java does NOT allow implicit conversion from integer (0, 1) to boolean
- `(0,1)` is NOT boolean - it's an integer

### Character Type:
- `char` is 16-bit Unicode
- Can store any character from the Unicode character set
- Example: `char ch = 'A';` or `char ch = '\u0041';` (Unicode representation)

---
