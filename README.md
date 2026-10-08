# Linker

Proyecto en desarrollo estructurado con **Angular** para el frontend, y **Node.js** (próximamente **Spring Boot**) para el backend.

## 🚀 Requisitos Previos

Asegúrate de tener instaladas las siguientes herramientas en tu máquina local antes de comenzar:
- [Node.js](https://nodejs.org/es/) (incluye el gestor de paquetes `npm`)
- [Angular CLI](https://v17.angular.io/cli) (Si no lo tienes, instálalo globalmente con `npm install -g @angular/cli`)
- *Próximamente:* Java Development Kit (JDK) y Maven/Gradle para la integración con Spring Boot.

## 🛠️ Instalación

1. **Clonar el repositorio**
   Abre tu terminal y descarga el proyecto en tu computadora:
   ```bash
   git clone <URL_DE_TU_REPOSITORIO>
   cd Linker
   ```

2. **Instalar dependencias del proyecto**
   ⚠️ *Nota importante:* La carpeta `node_modules` no se incluye en el repositorio por su tamaño. Para generar esta carpeta y descargar todas las librerías necesarias, asegúrate de estar en la raíz del proyecto (donde está el archivo `package.json`) y ejecuta:
   ```bash
   npm install
   ```

## 🏃‍♂️ Ejecución del Proyecto

### Iniciar la aplicación en Angular
Para levantar el servidor de desarrollo, ejecuta el siguiente comando en la raíz del proyecto:
```bash
ng serve
```
Una vez que la terminal indique que la compilación fue exitosa (*Application bundle generation complete*), abre tu navegador e ingresa a:
👉 **[http://localhost:4200](http://localhost:4200)**

*(El servidor se recargará automáticamente si realizas cambios en los archivos fuente).*

### Iniciar el Backend (Node.js / Spring Boot)
*(Las instrucciones de arranque para el backend se documentarán en esta sección una vez que la integración esté lista).*

## 💡 Notas para el equipo de desarrollo
- Nunca suban la carpeta `node_modules` ni archivos de compilación (`dist/`, `target/`) en sus *commits*. Estos directorios ya deben estar excluidos en el archivo `.gitignore`.
- Si alguien agrega una nueva librería al proyecto mediante `npm install <paquete>`, asegúrense de hacer commit del archivo `package.json` actualizado para que los demás puedan hacer `npm install` y sincronizarse.

---
*Documentación generada para el equipo de desarrollo de Linker.*
