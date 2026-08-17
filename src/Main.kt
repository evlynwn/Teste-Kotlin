fun main() {
    val texto: String = "Bom dia, pessoal"

    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("pessoal"))

    val bloqueado: Boolean = false

    println(bloqueado)

    val idade: Int = 27

    println(idade)

    //E obrigatorio adicionar um "L" quando o valor ultrapassa o limite do Int
    val populacao: Long = 7_000_000_000_000_000_000L

    println(populacao)

    val peso: Float = 73.5F

    println(peso)

    val altura: Double = 1.73

    println(altura)

    val x: Int = 10
    val y: Double = x.toDouble()//ogrigatorio
    val z: Int = x // não funciona

}

