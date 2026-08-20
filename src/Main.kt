fun main() {
    val texto: String = "Bom dia, pessoal"

    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("pessoal"))


    val bloqueado: Boolean = false

    println(bloqueado)


    val idade: Int = 20

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


    val nome: String = "Evie"

     val idade1 = 18

    println("Bom dia $nome! Logo logo voce fara ${idade1 + 1} anos!")


    val letra: Char = 'S'

    println(letra)

    val o: Int = 10
    val p: Double = 2.5
    val resultado = x * y

    val a = 10
    val b = 3

    println(a + b) //13
    println(a - b) //7
    // +/-/*//

    //Operador de atribuicao
    //Sao operadores para realizar atribuicao combinando operacoes aritmetica
    // += - valor atual mais novo valor
    // -= - valor atual menos novo valor
    // =  - valor atual multiplicado pelo valor
    // /= - valor atual divido pelo novo valor
    // %= - resto da divisao do valor atual pelo novo valor

    //Operadores Logicos
    // && - E


    // O if pode ser usado como expressao que retorna valor
    val nota = 7

    if(nota >=9) {
        println("Excelente")
    } else if (nota >= 6){
        println("Bom")
    } else {
        println("Reprovado")
    }

    val idade3 = 20

    val status = if(idade >= 18){
        "Maior de idade"
    }else {
        "Menor de idade"
    }
    println(status)

    val idade4 = 20

    println(if(idade4 >= 18) "Maior" else "Menor")

    //Estrutura de decisao - When
    val dia1 = 3

    when (dia1) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terca")
        else -> println("Dia inválido")
    }

    //When com multiplos valores
    val nota2 = 9

    when(nota) {
         9,10 -> println("Excelente")
         7,8 -> println("Bom")
         6 -> println("Regular")
        else -> println("Reprovado")
    }

    val dia = 3

    val nomeDia = when (dia){
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terca"
        else -> "Outro dia"
    }
    val nota3 = 4

    when{
        nota >= 9 -> println("Excelente")
        nota >= 6 -> println("Regular")
        else -> "Reprovado"
    }

    //Null safety

    //Em Java há um problema quando uma variável possui um valor nulo e tentamos utilizá-la, um erro
    // conhecido como NullPointerException

    //Por padrão, nenhuma variável pode ser nula, acontece um erro de copilacão

    var nome1: String? = "Evie"
    nome1 = null

    if(nome != null) {
        println(nome.length)
    }

    var nome2: String? = null

    println(nome?.length)

    //Colletions - Array
    var numeros1 = arrayOf(1,2,3)

    println(numeros1[0]) //1

    numeros1[1] = 50
    println(numeros1[1]) //50

    var numeros3 = arrayOf(1,2,3)

    numeros3[2] = 1
    println(numeros3[3])

    var frutas = listOf("Banana", "Macã", "Macã")

    println(frutas[0])
    frutas.add("Limão") // Não funciona
    frutas.remove(2) // Não funciona

    var frutas1 = listOf("Banana", "Macã","Macã")

    println(frutas1.size) //3
    println(frutas1.first())
    println(frutas1.last())
    println(frutas1.contains("Macã")) // true

    //Estruturas de decisao - else, if
    val idade2 = 18

    val status1 = if(idade >= 18){

        "Maior de idade"
        return
        println("teste2")
        "Teste"
        println("teste3")
    } else {
        println("Menor de idade")
    }

    println(status1)

    fun mandaSalve(nome: String = "mano") {
        println("Salve $nome!")
    }

    val result = soma(10, 3)

    println(result)

}

fun soma(a: Int, b: Int) : Int{
    return a + b
}


