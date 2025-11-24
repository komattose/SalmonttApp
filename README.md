👨‍💻 Autor del proyecto

Nombre completo: Martín Belaunde
Carrera: Analista Programador Computacional
Sede: Duoc UC – Online

🧾 Descripción general del sistema (actualizada con resumen del funcionamiento)

Este proyecto implementa un sistema completo de gestión para la empresa salmonera Salmontt, permitiendo cargar, consultar, filtrar y administrar información de centros de cultivo utilizando conceptos avanzados de Programación Orientada a Objetos.

El sistema:

🟦 Carga automáticamente información desde un archivo .txt

Al iniciar, la aplicación lee un archivo extendido que incluye:

Nombre del centro

Ciudad

Producción

Calle

Región

Encargado

Cada línea del archivo se convierte en un objeto y se almacena dinámicamente.

🟩 Crea objetos usando composición

Cada centro incluye:

Un objeto Direccion

Un objeto Encargado

Esto aplica correctamente el principio de composición del POO.

🟨 Organiza los datos en una colección dinámica

Los centros se almacenan en un:

ArrayList<CentroCultivo>

Esto permite:

Recorrerlos

Filtrarlos

Ordenarlos

Buscarlos

Modificarlos

De forma eficiente y flexible.

🟫 Valida datos y evita errores

Incluye un módulo de validación que garantiza:

Números válidos

Datos completos

Manejo seguro del archivo

Prevención de entradas no válidas

🟪 Resumen Global del Funcionamiento

Al ejecutar el programa:

Se leen los datos desde el archivo centros.txt.

Se crean objetos con composición (Direccion y Encargado).

Se almacenan todos en un ArrayList.

Se despliega un menú completo que permite:

Administrar los centros

Buscar información

Aplicar filtros y ordenamientos

Ver estadísticas generales

El usuario puede navegar libremente hasta salir del sistema.

##🧩 Estructura general del proyecto
```
src/
├── model/
│   ├── Direccion.java
│   ├── Encargado.java
│   └── CentroCultivo.java
│
├── util/
│   ├── Validador.java
│   └── LectorArchivos.java
│
├── service/
│   └── CentroService.java
│
└── app/
    └── Main.java     # Menú principal con submenús 
    
resources/
└── centros.txt       # Archivo extendido con datos de los centros

```

⚙️ Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub:

git clone https://github.com/komattose/SalmonttApp.git


Luego:

Abre el proyecto en IntelliJ IDEA

Marca correctamente los directorios:

src/ → Sources Root

resources/ → Resources Root

Verifica que el archivo:

resources/centros.txt


exista y tenga el formato extendido.

Ejecuta el archivo:

app/Main.java


El programa cargará todos los datos de forma automática y mostrará el menú.

💻 Ejemplo de funcionamiento (resumen)

```
Al iniciar, se muestra el menú:

===== SISTEMA DE GESTIÓN SALMONTT =====
1. Gestión de Centros
2. Búsquedas
3. Filtros Avanzados
4. Información General
0. Salir


Ejemplo de salida al listar centros:

=== Centro de Cultivo ===
Nombre: Centro Norte
Ciudad: Puerto Montt
Producción: 1500
Dirección: Av. Los Lagos 123, Los Lagos
Encargado: Juan Pérez


Ejemplo de filtro:

--- FILTROS AVANZADOS ---
Producción mínima: 1500

✔ Centros encontrados:
- Centro Norte (1500)
- AquaFjord (2300)
- BlueSalmon (1800)
```
📦 Repositorio y entrega

Repositorio GitHub:
https://github.com/komattose/SalmonttApp

Fecha de entrega: 24/11/2025

📘 Duoc UC | Escuela de Informática y Telecomunicaciones
