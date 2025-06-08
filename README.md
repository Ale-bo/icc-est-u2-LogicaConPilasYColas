# Práctica 1 - Estructura de Datos

## 📌 Información General

-**Título:** Ejercicios Logica con Pilas y Colas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Ivanna Nievecela
- **Fecha:** 07/06/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción 
### Ejercicio 01: Validación de signos
Este ejercicio esta ubucado en el paquete `Ejercicio_01_sign`.

- `isValid`El objetivo es crear un método que recibe un String y devuelve un booleano indicando si el String es válido o no.
-`Strack<Character>`: se usa para almacenar los signos de apertura mientras se recorre la cadena.
-`s.toCharArray()`: se convierte el String a un array de caracteres.
-`stack.push(c)`: se agrega el caracter al final de la pila.
-`stack.pop()`: se elimina el caracte   r del final de la pila.
-`stack.isEmpty()`: se verifica si la pila está vacía.

##🔄 Lógica:
1. Se recorre la cadena y se agregan los signos de apertura y cierre a la pila.
2. Se verifica que el tope de la pila sea igual al caracter que se está procesando.
3. Si el tope de la pila es diferente al caracter que se está procesando, se devuelve `false`.
4.Y si el tope de la pila es igual al caracter que se esta procesando, se devuelve `true`.

### Ejercicio 02: Ordenar un Stack
Este ejercicio esta ubucado en el paquete `Ejercicio_02_sorting`.

- `sortStack`El objetivo es crear un método que recibe un Stack de Integers y devuelve un Stack ordenado.
- `StackSorter`Se crea un nuevo objeto StackSorter.
- `sortStack(stack)`: se llama al método que ordena el Stack.
- `tempStack`Se crea un nuevo objeto Stack para almacenar los elementos que no pueden ser ordenados.
- `!stack.isEmpty()`: se verifica si el Stack no está vacío.
- `stack.pop()`: se elimina el elemento del Stack.
-`stack.push`: se agrega el elemento al Stack.

##🔄 Lógica:
1. Mientras el Stack no esté vacío, se toma el elemento más bajo del Stack y se lo agrega al Stack ordenado.
2.Una vez que la Stack original está vacía, se devuelve el Stack ordenado.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Salida
```plaintext
Ejercicio 01: Validación de signos
Input: ([]){} => Output: true
Input: ({)}=> Output: false

Ejercicio 02: Ordenar un Stack
Intput
[5, 1, 4, 2]
Output
[1, 2, 4, 5]

```	

---

## 📦 Versión 2.0.2 – Estructuras Lineales – Ejercicios

Esta versión contiene la solución a dos ejercicios prácticos sobre el uso de pilas (`Stack`) en Java:

- **Ejercicio 01 – Validación de signos:**  
  Se implementa una clase `SingValidator` que evalúa si una cadena de signos (`()`, `{}`, `[]`) está correctamente balanceada usando una pila.

- **Ejercicio 02 – Ordenamiento de un Stack:**  
  Se implementa la clase `StackSorter` que ordena una pila de enteros sin estructuras externas, solo utilizando otra pila auxiliar.

🔗 [Ir a la versión 2.0.2](http://github.com/Ale-bo/icc-est-u2-LogicaConPilasYColas/releases/tag/v2.0.2)

---