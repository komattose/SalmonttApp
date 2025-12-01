# 🧠 Evaluación – Desarrollo Orientado a Objetos I  
### Semana Actual – Jerarquía de Clases en SalmonttApp

---

## 🎯 Objetivo de esta semana

El objetivo de esta semana es **implementar una jerarquía de clases orientada a objetos** dentro del proyecto **SalmonttApp**, reforzando los principios de **herencia**, **reutilización de código** y **organización modular**.

Para ello, se modelan las **unidades operativas de la empresa salmonera Salmontt**, creando una estructura jerárquica que agrupa las características comunes y específicas de los distintos tipos de unidades:  
- **UnidadOperativa** (superclase)  
- **CentroCultivo** (subclase)  
- **PlantaProceso** (subclase)

---

## 🧩 Clases creadas y organización del proyecto

```text
src/
├── model/
│   ├── UnidadOperativa.java     # Superclase: atributos comunes (nombre, comuna)
│   ├── CentroCultivo.java       # Subclase: añade toneladasProduccion
│   └── PlantaProceso.java       # Subclase: añade capacidadProceso
│
├── data/
│   └── GestorUnidades.java      # Clase que crea instancias de prueba
│
└── ui/
    └── Main.java                # Clase principal que ejecuta el programa
```

🧠 Descripción de las clases
UnidadOperativa:
Superclase que representa una unidad general con los atributos nombre y comuna.
Incluye constructor, métodos getters/setters y un toString() básico.

CentroCultivo:
Hereda de UnidadOperativa y agrega el atributo toneladasProduccion.
Sobrescribe toString() para mostrar toda su información.

PlantaProceso:
Hereda de UnidadOperativa y agrega el atributo capacidadProceso.
También sobrescribe toString() para mostrar su información específica.

GestorUnidades:
Crea instancias de prueba de ambas subclases y devuelve un arreglo con los objetos.

Main:
Llama al método del gestor para obtener las unidades y las muestra por consola.

⚙️ Instrucciones para ejecutar el programa
Clonar el repositorio desde GitHub:
Copiar código
git clone https://github.com/komattose/SalmonttApp.git
Abrir el proyecto en IntelliJ IDEA (o cualquier otro IDE compatible con Java).

Verificar la estructura de paquetes:

model/ → contiene las clases de la jerarquía.

data/ → contiene la clase GestorUnidades.

ui/ → contiene la clase Main.

Ejecutar el programa:

Abre la clase Main.java en el paquete ui.

Ejecuta con el botón ▶️ o desde la consola del IDE.

Observar la salida en consola:
El programa debe mostrar las unidades operativas creadas por el gestor, similar a lo siguiente:

text
Copiar código
=== Unidades Operativas de Salmontt ===

Centro de Cultivo {nombre='Centro Chinquihue', comuna='Puerto Montt', toneladasProduccion=850.5}
Centro de Cultivo {nombre='Centro Quellón Norte', comuna='Quellón', toneladasProduccion=920.7}
Planta de Proceso {nombre='Planta Sur', comuna='Puerto Varas', capacidadProceso=120 toneladas/día}
Planta de Proceso {nombre='Planta Norte', comuna='Calbuco', capacidadProceso=150 toneladas/día}

=== Fin de la demostración ===
📘 Duoc UC | Escuela de Informática y Telecomunicaciones
Semana: Jerarquía de Clases y Herencia
Autor: Martín Belaunde
