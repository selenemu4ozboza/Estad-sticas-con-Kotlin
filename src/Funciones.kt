
import kotlin.math.sqrt

// Solicita 100 números por teclado
fun introducirNumeros(): MutableList<Int> {

    val numeros = mutableListOf<Int>()

    while (numeros.size < 100) {

        print("Introduce el número ${numeros.size + 1} de 100: ")

        val numero = readlnOrNull()?.toIntOrNull()

        if (numero != null) {
            numeros.add(numero)
        } else {
            println("Error: introduce un número entero válido.")
        }
    }

    return numeros
}

// Muestra todos los números de la lista
fun mostrarNumeros(numeros: List<Int>) {
    println("\nLista de números:")
    println(numeros.joinToString(", "))
}

// Calcula la media aritmética
fun calcularMedia(numeros: List<Int>): Double {

    val suma = numeros.sumOf { it.toDouble() }

    return suma / numeros.size
}

// Calcula la moda o las modas
fun calcularModa(numeros: List<Int>): List<Int> {

    // Contamos las veces que aparece cada número
    val frecuencias = numeros.groupingBy { it }.eachCount()

    // Buscamos la frecuencia más alta
    val frecuenciaMaxima = frecuencias.values.maxOrNull() ?: 0

    // Si todos aparecen una vez, no hay moda
    if (frecuenciaMaxima == 1) {
        return emptyList()
    }

    // Devolvemos los números más repetidos
    return frecuencias.filterValues {
        it == frecuenciaMaxima
    }.keys.sorted()
}

// Muestra el resultado de la moda
fun mostrarModa(numeros: List<Int>) {

    val modas = calcularModa(numeros)

    when {
        modas.isEmpty() -> {
            println("No hay moda: todos los números aparecen una sola vez.")
        }

        modas.size == 1 -> {
            println("La moda es: ${modas[0]}")
        }

        else -> {
            println("Las modas son: ${modas.joinToString(", ")}")
        }
    }
}

// Calcula la desviación típica poblacional
fun calcularDesviacionTipica(numeros: List<Int>): Double {

    // Calculamos la media
    val media = calcularMedia(numeros)

    // Sumamos las diferencias al cuadrado
    val sumaDiferencias = numeros.sumOf {
        val diferencia = it - media
        diferencia * diferencia
    }

    // Calculamos la varianza
    val varianza = sumaDiferencias / numeros.size

    // Devolvemos la raíz cuadrada
    return sqrt(varianza)
}
