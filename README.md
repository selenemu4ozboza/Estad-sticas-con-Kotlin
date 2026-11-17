# UD01 - Actividad 08: Estadísticas con Kotlin

## Descripción del proyecto

Esta actividad consiste en desarrollar una aplicación de consola utilizando el lenguaje de programación Kotlin.

El programa permite trabajar con una lista de 100 números enteros, que pueden generarse aleatoriamente o introducirse manualmente por el usuario.

A partir de estos números, la aplicación calcula diferentes medidas estadísticas básicas, como la media aritmética, la moda y la desviación típica.

## Funcionalidades

La aplicación dispone de un menú interactivo con las siguientes opciones:

1. **Generar 100 números aleatorios:** genera automáticamente 100 números entre 1 y 100.
2. **Introducir 100 números manualmente:** permite introducir los números mediante el teclado.
3. **Mostrar números:** muestra todos los números almacenados en la lista.
4. **Calcular media:** calcula el promedio de los números.
5. **Calcular moda:** identifica el número o los números que más se repiten.
6. **Calcular desviación típica:** calcula cuánto se dispersan los números respecto a la media.
7. **Calcular todas las estadísticas:** muestra todos los resultados estadísticos.
8. **Salir:** finaliza la ejecución del programa.

## Estructura del proyecto

El programa está organizado en dos archivos principales:

**Main.kt**

Contiene el menú principal y permite al usuario seleccionar las diferentes opciones. También comprueba que existan números antes de realizar los cálculos.

**Funciones.kt**

Contiene las funciones necesarias para introducir y mostrar números, calcular la media, identificar la moda y calcular la desviación típica.

Esta separación permite mantener el código más organizado y facilitar su comprensión.

## Tecnologías utilizadas

- **Lenguaje:** Kotlin.
- **Entorno de desarrollo:** IntelliJ IDEA.
- **JDK:** Java 21.
- **Tipo de aplicación:** Consola.

## Validaciones

El programa incorpora diferentes comprobaciones para evitar errores durante su ejecución:

- No permite calcular estadísticas cuando la lista está vacía.
- Comprueba que los números introducidos manualmente sean enteros válidos.
- Solicita exactamente 100 números.
- Controla las opciones incorrectas del menú.
- Permite volver al menú hasta seleccionar la opción de salir.

## Ejecución del programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Localizar el archivo `Main.kt`.
3. Ejecutar el programa mediante el botón **Run**.
4. Seleccionar una opción del menú.
5. Consultar los resultados que aparecen en la consola.

## Conceptos trabajados

Durante el desarrollo de esta actividad se han trabajado los siguientes conceptos de Kotlin:

- Listas mutables (`MutableList`).
- Funciones y parámetros.
- Bucles `do-while` y `while`.
- Estructuras condicionales `if` y `when`.
- Operaciones matemáticas.
- Validación de datos.
- Organización del código en diferentes archivos.

## Conclusión

Con esta actividad he puesto
