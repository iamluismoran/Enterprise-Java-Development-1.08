# Proyecto: Enterprise Java Development (Interfaces and Abstract Classes)

Este proyecto contiene ejercicios prácticos de Programación Orientada a Objetos en Java. Se trabajan conceptos como operaciones con BigDecimal, gestión de inventario de autos, servicio de streaming de videos e implementación de listas personalizadas mediante una interfaz.

---

## Tecnologías Utilizadas

- IntelliJ IDEA
- Git & GitHub

## Secciones del Proyecto

### 1. BigDecimal Operations

Se realizaron operaciones como redondeo (`setScale`) y diferentes modos de redondeo como:

- `RoundingMode.HALF_UP`

---

### 2. Car Inventory System

Sistema con jerarquía de clases:

- Clase abstracta `Car` con atributos comunes.
- Clases derivadas:
    - `Sedan`
    - `Truck`
    - `UtilityVehicle` (con tracción 4x4)

Cada clase sobrescribe el método `getInfo()` para mostrar información personalizada del vehículo.

---

### 3. Video Streaming Service

Jerarquía de clases:

- Clase abstracta `Video` con atributos `title`, `duration` y `rating`.
- Subclases:
    - `Movie`
    - `TvSeries`

Cada subclase implementa su propia versión del método `getInfo()`.

---

### 4. IntList Interface

Se creó una interfaz `IntList` con dos métodos:

```java
void add(int number);
int get(int index);
```

## ¿Cuándo usar IntArrayList y cuándo usar IntVector?

Ambas clases implementan la interfaz `IntList`, pero tienen diferentes estrategias de expansión y están diseñadas para distintos contextos de uso:


### IntArrayList
- Más eficiente cuando se espera un crecimiento pequeño o moderado.
- Ideal si el tamaño final de la lista es difícil de predecir, pero no será muy grande.

### IntVector
-  Más eficiente cuando se espera almacenar muchos elementos.
- Ideal si se prevén muchas inserciones, ya que reduce la cantidad de copias necesarias.


#### Ejemplo de IntArrayList:
```
java
IntList listaPequena = new IntArrayList();
for (int i = 0; i < 20; i++) {
    listaPequena.add(i);
}
System.out.println("Elemento en posición 5: " + listaPequena.get(5));
```

#### Ejemplo de IntVector:
```java
IntList listaGrande = new IntVector();
for (int i = 0; i < 1000; i++) {
    listaGrande.add(i);
}
System.out.println("Elemento en posición 500: " + listaGrande.get(500));
