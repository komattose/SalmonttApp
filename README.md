# 🧠 Evaluación – Desarrollo Orientado a Objetos I
### Semana Actual – Polimorfismo y Colecciones en SalmonttApp

---

## 🎯 Objetivo de esta semana

El objetivo de esta semana es **incorporar colecciones y aplicar polimorfismo** dentro del proyecto **SalmonttApp**, reforzando los principios de **herencia**, **abstracción**, **reutilización de código** y **organización modular**.

Se busca que las clases trabajen de forma polimórfica dentro de una colección, permitiendo recorrer y desplegar distintos tipos de unidades operativas de manera dinámica, **sin usar condicionales ni comprobaciones de tipo (`instanceof`)**.

Para ello, se modelan las **unidades operativas de la empresa salmonera Salmontt**, manteniendo y extendiendo la jerarquía de clases:
- **UnidadOperativa** (superclase abstracta)
- **CentroCultivo** (subclase)
- **PlantaProceso** (subclase)

---

## 🧩 Clases creadas y organización del proyecto

```text
src/
├── model/
│   ├── UnidadOperativa.java     # Superclase abstracta: define método mostrarInformacion()
│   ├── CentroCultivo.java       # Subclase: sobrescribe mostrarInformacion()
│   └── PlantaProceso.java       # Subclase: sobrescribe mostrarInformacion()
│
├── data/
│   └── GestorUnidades.java      # Crea una colección List<UnidadOperativa> y la recorre con polimorfismo
│
└── ui/
    └── Main.java                # Clase principal que ejecuta el programa
```
🧠 Descripción de las clases
UnidadOperativa:
Superclase abstracta que representa una unidad general con los atributos nombre y comuna.
Define el método abstracto mostrarInformacion() para ser implementado por las subclases.

CentroCultivo:
Hereda de UnidadOperativa e implementa mostrarInformacion() mostrando el nombre, comuna y toneladas de producción.
Representa un centro de cultivo de salmón.

PlantaProceso:
Hereda de UnidadOperativa e implementa mostrarInformacion() mostrando el nombre, comuna y capacidad de procesamiento diario.
Representa una planta de procesamiento de producto.

GestorUnidades:
Utiliza una colección List<UnidadOperativa> que combina distintos tipos de unidades.
Crea instancias de prueba y las recorre de forma polimórfica llamando a mostrarInformacion() en cada objeto.

Main:
Ejecuta el programa, solicita la lista desde el gestor y muestra la información por consola.

⚙️ Instrucciones para ejecutar el programa
Clonar el repositorio desde GitHub:

bash
Copiar código
git clone https://github.com/komattose/SalmonttApp.git
Abrir el proyecto en IntelliJ IDEA (o cualquier otro IDE compatible con Java).

Verificar la estructura de paquetes:

model/ → contiene la jerarquía de clases.

data/ → contiene la clase GestorUnidades.

ui/ → contiene la clase Main.

Ejecutar el programa:

Abre la clase Main.java en el paquete ui.

Ejecuta con el botón ▶️ o desde la consola del IDE.

Observar la salida en consola:
El programa mostrará las unidades operativas creadas dentro de la colección, desplegando la información mediante el método mostrarInformacion() de forma polimórfica.

💻 Ejemplo de salida en consola
text
Copiar código
=== Unidades Operativas de Salmontt ===

[Centro de Cultivo] Centro Chinquihue - Puerto Montt  
Producción: 850.5 toneladas  

[Centro de Cultivo] Centro Quellón Norte - Quellón  
Producción: 920.7 toneladas  

[Planta de Proceso] Planta Sur - Puerto Varas  
Capacidad: 120 toneladas/día  

[Planta de Proceso] Planta Norte - Calbuco  
Capacidad: 150 toneladas/día  

[Planta de Proceso] Planta Industrial Patagonia - Puerto Montt  
Capacidad: 200 toneladas/día  

=== Fin de la demostración ===
📘 Duoc UC | Escuela de Informática y Telecomunicaciones

Semana: Polimorfismo y Colecciones

Autor: Martín Belaunde
