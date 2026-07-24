# 🚦 Traffic Radar System

A Java Object-Oriented Programming (OOP) project that simulates a traffic radar system. The application detects traffic violations based on predefined rules, generates detailed traffic fines, and is designed to be easily extended by adding new rules without modifying the radar logic.

## Features
- Detects traffic violations
- Checks seatbelt compliance
- Validates speed limits based on vehicle type
- Generates detailed traffic fine reports
- Calculates the total fine automatically
- Extensible rule-based architecture using interfaces

## Technologies
- Java
- Object-Oriented Programming (OOP)
- Java Collections (List, ArrayList)
- LocalDate API

## OOP Concepts Used
- Encapsulation
- Abstraction
- Interfaces
- Polymorphism
- Composition
- Single Responsibility Principle (SRP)

## Project Structure
```
src/
├── Car.java
├── CarType.java
├── Rule.java
├── SeatbeltRule.java
├── TruckSpeedRule.java
├── PrivateSpeedRule.java
├── Violation.java
├── Fine.java
├── Radar.java
└── Main.java
```

## Sample Output

```
Traffic Fine for Car: ABC123

Total Fine: 400 EGP

Violations:
- Seatbelt not fastened: 100 EGP
- Speed exceeded maximum allowed (80 km/h): 300 EGP

```

## Design
The project follows a rule-based design where each traffic rule is implemented independently through the `Rule` interface. This makes the system easy to maintain and extend by simply adding new rule classes without changing the `Radar` class.
