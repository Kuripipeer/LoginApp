# 🔐 LoginApp

Aplicación desarrollada con **Kotlin** y **Jetpack Compose** que implementa un flujo de autenticación moderno, incluyendo pantallas de **Login** y **Sign Up**, navegación fluida con `NavController` y componentes reutilizables de UI.

---

## 📱 Características principales

- 🎨 Interfaz moderna con Jetpack Compose  
- 🧩 Componentes reutilizables (`TextField`, `Button`, `Form`, etc.)  
- 🔁 Navegación entre pantallas con `NavController`  
- 👁️‍🗨️ Campo de contraseña con alternancia de visibilidad  
- 🧭 Flecha personalizada para volver atrás  
- 🌙 Fondo visual con `Image` y `Box` superpuestos  
- 🧱 Arquitectura modular (pantallas separadas y componentes)

---

## 🧰 Tecnologías utilizadas

| Tecnología | Descripción |
|-------------|-------------|
| **Kotlin** | Lenguaje principal de desarrollo |
| **Jetpack Compose** | Framework declarativo para UI |
| **Material 3 (M3)** | Componentes visuales modernos |
| **Android Studio** | Entorno de desarrollo oficial |
| **NavController** | Manejo de navegación entre pantallas |

---

## 🧩 Estructura del proyecto

LoginApp/
│
├── app/
│ ├── src/main/java/com/example/loginapp/
│ │ ├── components/ → TextFields, Buttons, etc.
│ │ ├── screens/ → LoginScreen.kt, RegisterScreen.kt
│ │ └── navigation/ → NavGraph.kt (flujo entre pantallas)
│ │
│ └── res/
│ ├── drawable/ → Fondos e íconos personalizados
│ └── values/ → Colores, temas y estilos
│
└── build.gradle

---

## 🚀 Ejecución del proyecto

1. Clona este repositorio:

   ```bash
   git clone https://github.com/Kuripipeer/LoginApp.git
Ábrelo con Android Studio.

Sincroniza las dependencias de Gradle.

Ejecuta la app en un emulador o dispositivo físico.
