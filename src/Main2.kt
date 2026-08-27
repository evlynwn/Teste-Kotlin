fun main () {

    val numeros = (1..10).toList()

    val pares = numeros.filter { numero ->
        numero % 2 == 0
    }
    println(pares)

//Resumido

//val numeros = (1 .. 10).toList()
//
//val pares = numeros.filter { it % 2 == 0 }
//
//val numeros = (1 .. 10).toList()
//
//val dobro = numero.map{ numero ->
//    numero * 2
//}
//println(dobro)

    val numero = (1..5).toList()

    val soma = numeros.reduce { acumulador, numero -> acumulador + numero }

    println(soma)

    val numeros = (1 .. 5).toList()

    val result = numeros
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .reduce { acc, n -> acc + n }

    println(result)

}



