# Spring Project — Client Eureka

Ce projet est un **microservice client Spring Boot** qui s’enregistre auprès d’un **Eureka Server** pour la **découverte de services** dans une architecture microservices.  
Il utilise **Spring Cloud Netflix Eureka Client** pour s’auto‑enregistrer et être découvert par d’autres services.

---

## 📌 Fonctionnalités

- Microservice Spring Boot prêt à s’enregistrer auprès d’un serveur Eureka  
- Configuration flexible pour pointer vers un serveur de découverte  
- Exemplaire d’un service REST exposant une API simple  
- Intégré avec les annotations Spring Cloud standards (`@EnableDiscoveryClient`, etc.)

---

## 🔧 Prérequis

Assure‑toi d’avoir :

- **Java JDK 17 ou supérieur**
- **Maven**
- Un **Eureka Server** déjà démarré (par ex. dans `Spring-Project-server-eureka`)  
  par défaut visible sur `http://localhost:8761/` 

---

## 🚀 Installation

1. Clone ce dépôt :

   ```bash
   git clone https://github.com/Mathys-d/Spring-Project-Client.git
