# Proyecto ColasQueues

Este proyecto implementa una **estructura de datos Cola (Queue)** en Java utilizando nodos enlazados.  
La cola sigue el principio **FIFO (First In, First Out)**: el primer elemento en entrar es el primero en salir.

---

## 📂 Estructura del proyecto
ColasQueues/
├── src/
│   ├── Metodologia1/
│   │   ├── Cola.java
│   │   └── Nodo.java
│   ├── Metodologia2/
│   │   ├── ColaCircular.java
│   │   ├── Main.java
│   │   └── Nodo.java
├── README.md
├── .gitignore
└── LICENSE

Código

---

## 📌 Clases principales

### 1. Clase `Nodo`
Representa cada elemento de la cola.  
- **Atributos:**  
  - `int valor`: almacena el dato.  
  - `Nodo sig`: referencia al siguiente nodo.  

---

### 2. Clase `Cola`
Implementa la lógica de la cola dinámica.  
- **Métodos principales:**  
  - `esVacia()` → retorna `true` si la cola está vacía.  
  - `encolar(int valor)` → inserta un nuevo nodo al final (Enqueue).  
  - `desencolar()` → elimina y retorna el nodo del frente (Dequeue).  
  - `mostrarCola()` → recorre e imprime los elementos.  
  - `buscar(int valor)` → retorna `true` si el valor existe en la cola.  
  - `eliminar()` → vacía completamente la cola.  

---

### 3. Clase `Main`
Clase de prueba para demostrar el funcionamiento de la cola.  
- **Acciones realizadas:**  
  - Encola los valores: `10, 20, 30, 40`.  
  - Desencola dos elementos y los muestra en consola.  
- **Ejemplo de salida esperada:**  
