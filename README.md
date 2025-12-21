🧠 Evaluación Final – Desarrollo Orientado a Objetos I

Proyecto: SalmonttApp
👨‍💻 Autor del Proyecto

Nombre completo: Martín Belaunde

Carrera: Analista Programador Computacional

Sede: Duoc UC – Online

🎯 Objetivo General

El objetivo de este proyecto es construir un prototipo de sistema orientado a objetos en Java para la empresa salmonera Salmontt, ubicada en Puerto Montt.
El sistema permite gestionar información de empleados, productos, clientes y proveedores, aplicando principios fundamentales de la Programación Orientada a Objetos (POO) y buenas prácticas de diseño modular.

El desarrollo busca digitalizar y estructurar la información interna de la empresa, reduciendo duplicación de datos y errores, mediante:

Jerarquías de clases reutilizables.

Encapsulamiento y visibilidad controlada.

Lectura de datos desde archivos externos.

Aplicación de polimorfismo e interfaces.

🧩 Estructura General del Proyecto
```
SalmonttApp/
├── src/
│   ├── app/
│   │   └── Main.java            # Clase principal con método main
│   │
│   ├── data/
│   │   └── GestorDatos.java     # Gestión de colecciones y carga desde archivos
│   │
│   ├── model/
│   │   ├── Persona.java         # Clase base: nombre, RUT y dirección
│   │   ├── Direccion.java       # Clase compuesta: calle, ciudad y región
│   │   ├── Rut.java             # Clase validadora de RUT chileno
│   │   ├── Tarjeta.java         # Clase asociada a clientes
│   │   ├── Empleado.java        # Subclase de Persona: cargo y salario
│   │   ├── Cliente.java         # Subclase de Persona: datos de cliente y tarjeta
│   │   ├── Proveedor.java       # Subclase de Persona: datos de empresa proveedora
│   │   ├── Producto.java        # Clase de dominio: nombre y precio
│   │   ├── OrdenDeCompra.java   # Estructura para futuras integraciones
│   │   └── Registrable.java     # Interfaz común para entidades gestionables
│   │
│   └── utils/
│       ├── LectorArchivos.java  # Utilidad para leer archivos .txt
│       └── ValidadorRut.java    # Utilidad para validar el formato del RUT
│
└── resources/
├── empleados.txt            # Datos de empleados de prueba
└── productos.txt            # Datos de productos de prueba
```

⚙️ Instrucciones para Ejecutar el Programa
1. Clonar el Repositorio
   git clone https://github.com/komattose/SalmonttApp.git

2. Abrir el Proyecto

Utiliza IntelliJ IDEA (recomendado) o cualquier IDE compatible con Java.

Verifica que la carpeta /resources esté marcada como Resources Root.

3. Ejecutar

Abre el archivo Main.java dentro del paquete app.

Presiona Run ▶️ o utiliza Shift + F10.

El sistema cargará los datos desde los archivos .txt y mostrará los registros en consola.

🧾 Ejemplo de Salida en Consola
```
=== Sistema SalmonttApp ===

[Empleado] Juan Pérez - Cargo: Supervisor - Salario: $1200000.0
→ Registro tipo Empleado

[Empleado] María González - Cargo: Jefa de Planta - Salario: $1450000.0
→ Registro tipo Empleado

[Producto] Salmón Premium - Precio: $8500.0
→ Registro tipo Producto

[Producto] Porciones Marinadas - Precio: $8900.0
→ Registro tipo Producto

[Cliente] Juan Pérez - Tarjeta: Visa (1234-5678-9101-1121)
→ Registro tipo Cliente

[Proveedor] Carlos Muñoz - Empresa: AquaFeed Ltda
→ Registro tipo Proveedor

=== Fin de la demostración ===
```

📂 Archivos de Recursos y Carga Automática

El sistema lee los archivos empleados.txt y productos.txt ubicados en la carpeta /resources/.
Durante la compilación, IntelliJ IDEA copia automáticamente estos archivos al classpath:
```
SalmonttApp/
├── resources/
│   ├── empleados.txt
│   └── productos.txt
└── out/production/SalmonttApp/
├── empleados.txt
└── productos.txt
```

Si los archivos no están presentes en el classpath, el sistema los buscará automáticamente dentro de la carpeta /resources, asegurando compatibilidad en distintos entornos de ejecución.

🧠 Conceptos Aplicados
Concepto POO	Aplicación en el Proyecto
Encapsulamiento	Atributos privados y métodos públicos getter/setter.
Composición	Clases anidadas como Direccion en Persona, y Tarjeta en Cliente.
Herencia	Empleado, Cliente y Proveedor heredan de Persona.
Polimorfismo	Método mostrarDatos() sobrescrito según el tipo de entidad.
Interfaces	Registrable define comportamiento común (mostrarDatos()).
Colecciones	Uso de ArrayList<Registrable> para gestionar entidades de forma genérica.
Archivos externos	Carga de datos desde .txt con LectorArchivos.
Validación	Comprobación de formato de RUT mediante ValidadorRut.
🧩 Requisitos de Entorno

JDK: 25.0.0 o superior

IDE recomendado: IntelliJ IDEA 2025+

Codificación: UTF-8

Sistema Operativo: Windows 10 o superior / Linux / macOS

📘 Créditos y Entrega

Repositorio GitHub: https://github.com/komattose/SalmonttApp

Fecha de entrega: 21/12/2025

Institución: Duoc UC – Escuela de Informática y Telecomunicaciones
Evaluación Final – Desarrollo Orientado a Objetos I