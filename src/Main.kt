
fun main() {

    // Lista donde se guardan los números
    var numeros = mutableListOf<Int>()
    var opcion: Int

    do {
        println("\n===== ESTADÍSTICAS CON KOTLIN =====")
        println("1. Generar 100 números aleatorios")
        println("2. Introducir 100 números manualmente")
        println("3. Mostrar números")
        println("4. Calcular media")
        println("5. Calcular moda")
        println("6. Calcular desviación típica")
        println("7. Calcular todas las estadísticas")
        println("8. Salir")
        print("Seleccione una opción: ")

        opcion = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcion) {

            1 -> {
                numeros = MutableList(100) { (1..100).random() }
                println("\nNúmeros generados correctamente.")
                mostrarNumeros(numeros)
            }

            2 -> {
                numeros = introducirNumeros()
                println("\nNúmeros introducidos correctamente.")
                mostrarNumeros(numeros)
            }

            3 -> {
                if (numeros.isEmpty()) {
                    println("Primero debes generar o introducir números.")
                } else {
                    mostrarNumeros(numeros)
                }
            }

            4 -> {
                if (numeros.isEmpty()) {
                    println("No hay números para calcular la media.")
                } else {
                    println("La media es: %.2f".format(calcularMedia(numeros)))
                }
            }

            5 -> {
                if (numeros.isEmpty()) {
                    println("No hay números para calcular la moda.")
                } else {
                    mostrarModa(numeros)
                }
            }

            6 -> {
                if (numeros.isEmpty()) {
                    println("No hay números para calcular la desviación típica.")
                } else {
                    println(
                        "La desviación típica es: %.2f".format(
                            calcularDesviacionTipica(numeros)
                        )
                    )
                }
            }

            7 -> {
                if (numeros.isEmpty()) {
                    println("Primero debes generar o introducir números.")
                } else {
                    println("\n===== RESULTADOS =====")
                    println("Cantidad de números: ${numeros.size}")
                    println("Media: %.2f".format(calcularMedia(numeros)))
                    mostrarModa(numeros)
                    println(
                        "Desviación típica: %.2f".format(
                            calcularDesviacionTipica(numeros)
                        )
                    )
                }
            }

            8 -> println("Saliendo del programa...")

            else -> println("Opción inválida. Introduce un número del 1 al 8.")
        }

    } while (opcion != 8)
}
