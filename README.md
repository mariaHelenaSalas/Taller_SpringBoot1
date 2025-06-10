# 🛠️ Taller Spring Boot 1 

Este repositorio contiene un **CRUD desarrollado con Spring Boot** para la gestión de usuarios. El proyecto permite realizar operaciones básicas como crear, leer, actualizar y eliminar usuarios en una base de datos MySQL utilizando Spring Data JPA.

---

## 🚀 Funcionalidades principales

- 📥 Crear usuario (`POST`)
- 📋 Listar todos los usuarios (`GET`)
- 🔍 Buscar usuario por ID (`GET`)
- ✏️ Actualizar usuario (`PUT`)
- 🗑️ Eliminar usuario (`DELETE`)

---

## 🧰 Tecnologías utilizadas

- ⚙️ Spring Boot
- 🧬 Spring Data JPA
- ☕ Java 17
- 🐬 MySQL
- 🔧 Maven
- 🌐 Spring Web
- 🧪 Postman (para pruebas)

---

## 📁 Estructura del proyecto

```plaintext
└── src
    └── main
        └── java
            └── com.maria.taller_springboot1
                ├── controller     # Controladores REST (UsuarioController)
                ├── model          # Clase Usuario
                ├── repository     # Interface JPA
                └── service        # Servicio con lógica de negocio
