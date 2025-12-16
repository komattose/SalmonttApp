# 🧠 Evaluación – Desarrollo Orientado a Objetos I
### Semana Actual – Interfaces, Polimorfismo y GUI en SalmonttApp

---

## 🎯 Objetivo de esta semana

El objetivo de esta semana es **ampliar el sistema SalmonttApp** incorporando nuevas entidades del dominio y una interfaz gráfica básica, reforzando los conceptos de **interfaces, herencia, polimorfismo y colecciones genéricas**.

Esta etapa busca que distintas entidades (como unidades operativas, proveedores o empleados) compartan un comportamiento común, puedan ser gestionadas desde una misma colección y se visualicen mediante una interfaz gráfica sencilla.

Las metas principales son:
- Definir una **interfaz de comportamiento común** (`Registrable`).
- Aplicar **herencia y polimorfismo** entre las clases que representan entidades del sistema.
- Utilizar **colecciones genéricas (`ArrayList<Registrable>`)** para almacenar y recorrer los objetos.
- Implementar una **interfaz gráfica básica (JOptionPane)** para ingresar y mostrar registros.

---

## 🧩 Clases creadas y organización del proyecto

```text
src/
├── model/
│   ├── Registrable.java         # Interfaz común con el método mostrarResumen()
│   ├── UnidadOperativa.java     # Clase abstracta base (nombre, comuna)
│   ├── CentroCultivo.java       # Subclase de UnidadOperativa
│   ├── PlantaProceso.java       # Subclase de UnidadOperativa
│   ├── Proveedor.java           # Nueva clase que implementa Registrable
│   └── Empleado.java            # Nueva clase que implementa Registrable
│
├── data/
│   └── GestorEntidades.java     # Gestiona colección ArrayList<Registrable> y aplica instanceof
│
└── ui/
    └── Main.java                # Clase principal con interfaz gráfica JOptionPane
```
🧠 Descripción de las clases

Registrable (interfaz):
Define el método mostrarResumen() que actúa como contrato común para todas las entidades gestionables.

UnidadOperativa (abstracta):
Clase base para las unidades operativas, con atributos nombre y comuna.

CentroCultivo / PlantaProceso:
Subclases de UnidadOperativa que implementan mostrarResumen() mostrando datos específicos (producción o capacidad de proceso).

Proveedor:
Clase independiente que implementa Registrable y representa proveedores externos.
Muestra su información mediante mostrarResumen().

Empleado:
Clase independiente que implementa Registrable y representa colaboradores internos.
Muestra su cargo e identificación mediante mostrarResumen().

GestorEntidades:
Crea una colección ArrayList<Registrable> donde se almacenan distintos tipos de objetos (centros, plantas, proveedores y empleados).
Utiliza instanceof para aplicar lógica específica según el tipo de entidad.
Incluye métodos para mostrar, agregar y recorrer registros.

Main (GUI):
Implementa una interfaz básica mediante JOptionPane.
Permite:

    Mostrar entidades registradas.

    Agregar nuevos proveedores o empleados.

    Cerrar la aplicación desde un menú simple.

⚙️ Instrucciones para ejecutar el programa

    Clonar el repositorio desde GitHub:

    git clone https://github.com/komattose/SalmonttApp.git

    Abrir el proyecto en IntelliJ IDEA (o cualquier otro IDE compatible con Java).

    Verificar la estructura de paquetes:

        model/ → contiene las clases del dominio y la interfaz Registrable.

        data/ → contiene la clase GestorEntidades.

        ui/ → contiene la clase Main con la interfaz gráfica.

    Ejecutar el programa:

        Abre la clase Main.java en el paquete ui.

        Ejecuta con el botón ▶️ o desde la consola del IDE.

    Interacción esperada:

        Al iniciar, se muestra un menú con opciones para visualizar entidades, agregar proveedores o empleados, y salir del sistema.

        Los datos se muestran en consola o mediante cuadros de diálogo (JOptionPane).

💻 Ejemplo de salida en consola

=== ENTIDADES REGISTRADAS ===

[Centro de Cultivo] Centro Chinquihue - Puerto Montt
Producción: 850.5 toneladas

[Planta de Proceso] Planta Sur - Puerto Varas
Capacidad: 120 toneladas/día

[Proveedor] AquaFeed Ltda - Insumo: Alimentos Balanceados
→ Este registro corresponde a un proveedor externo.

[Empleado] María González - Cargo: Supervisora de Planta
→ Este registro corresponde a un colaborador interno.

[Empleado] Carlos Muñoz - Cargo: Gerente de Producción
→ Este registro corresponde a un colaborador interno.

=== Fin de la demostración ===

📘 Duoc UC | Escuela de Informática y Telecomunicaciones

    Semana: Interfaces, Polimorfismo y GUI

    Autor: Martín Belaunde