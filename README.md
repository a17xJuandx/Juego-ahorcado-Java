# Juego del Ahorcado en Java

Aplicación de consola desarrollada en Java enfocada en la implementación de lógica de programación y fundamentos de Programación Orientada a Objetos.

## Descripción

El programa simula el juego tradicional del ahorcado. El sistema selecciona de manera aleatoria una palabra a partir de un arreglo predefinido[cite: 2], y el usuario introduce intentos por letra. 
* El sistema contabiliza los errores hasta un límite máximo de 6 fallos[cite: 2].
* Incluye un ciclo para permitir múltiples partidas consecutivas según la elección del usuario[cite: 2].

## Estructura del Código

El proyecto se divide en dos clases principales:
* **`Ahorcado.java`**: Gestiona el flujo principal del juego, la lectura de entradas mediante la clase `Scanner` y el control de los ciclos de ejecución y repetición[cite: 1].
* **`Palabra.java`**: Contiene la lógica de selección aleatoria con `Random`, la inicialización de los arreglos para las palabras ocultas y la validación de los aciertos o errores del usuario[cite: 2].

## Tecnologías

* **Lenguaje:** Java
* **Conceptos aplicados:** 
    * Programación Orientada a Objetos (POO)
    * Estructuras de control (`do-while`, `while`, `for`)
    * Manejo de arreglos y cadenas de texto
    * Entrada y salida por consola

## Instrucciones de Ejecución

1. Asegurarse de contar con el kit de desarrollo de Java (JDK) instalado.
2. Compilar los archivos fuente respetando la estructura del paquete dentro del directorio de código fuente:
   ```bash
   javac con/mycompany/ahorcado/*.java
