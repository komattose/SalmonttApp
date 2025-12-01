🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I
👨‍💻 Autor del proyecto

Nombre completo: Martín Belaunde
Carrera: Analista Programador Computacional
Sede: Duoc UC – Online

🧾 Descripción general del sistema

El objetivo es construir un sistema en Java capaz de:

Leer datos externos desde un archivo .txt

Crear objetos a partir de esos datos

Almacenarlos en una colección dinámica (ArrayList)

Recorrer e imprimir el contenido de dicha colección

Aplicar filtros sobre los datos cargados

Organizar el código en paquetes según su responsabilidad

El contexto de trabajo corresponde a la empresa salmonera “Salmontt”, donde se manejan distintos Centros de Cultivo.
El proyecto aplica principios fundamentales de POO, como encapsulamiento, modularidad y estructuración por paquetes, dando paso a un sistema ordenado, mantenible y escalable.

##🧩 Estructura general del proyecto
```
src/
├── model/
│   └── CentroCultivo.java       # Clase que modela un centro de cultivo
│
├── data/
│   └── GestorDatos.java         # Clase encargada de leer el archivo y generar la colección
│
└── ui/
    └── Main.java                # Clase principal: recorrido y filtrado de datos

resources/
└── centros.txt                  # Archivo con datos separados por punto y coma
```
⚙️ Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub:

git clone https://github.com/komattose/salmontt-colecciones.git


Luego:

Abre el proyecto en IntelliJ IDEA.

Verifica que las carpetas estén configuradas como:

src/ → Sources Root

resources/ → Resources Root

Comprueba que centros.txt esté dentro de la carpeta resources.

Ejecuta el archivo:

ui/Main.java


Observa la salida en la consola, donde se visualizarán:

Todos los centros de cultivo cargados

Los centros filtrados con producción mayor a 1000

💻 Ejemplo de salida en consola
```
=== LISTA COMPLETA DE CENTROS ===
CentroCultivo{nombre='Centro Norte', ubicacion='Puerto Montt', produccion=1500}
CentroCultivo{nombre='Centro Sur', ubicacion='Chiloé', produccion=900}
CentroCultivo{nombre='AquaFjord', ubicacion='Aysén', produccion=2300}
CentroCultivo{nombre='BlueSalmon', ubicacion='Punta Arenas', produccion=1800}
CentroCultivo{nombre='PacificFarm', ubicacion='Valdivia', produccion=700}

=== CENTROS CON PRODUCCIÓN > 1000 ===
CentroCultivo{nombre='Centro Norte', ubicacion='Puerto Montt', produccion=1500}
CentroCultivo{nombre='AquaFjord', ubicacion='Aysén', produccion=2300}
CentroCultivo{nombre='BlueSalmon', ubicacion='Punta Arenas', produccion=1800}
```
📦 Repositorio y entrega

Repositorio GitHub:
https://github.com/komattose/salmontt-colecciones

Fecha de entrega: 17/11/2025

📘 Duoc UC | Escuela de Informática y Telecomunicaciones
