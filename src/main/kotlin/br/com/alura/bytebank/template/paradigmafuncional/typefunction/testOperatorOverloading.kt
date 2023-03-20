package br.com.alura.bytebank.template.paradigmafuncional.typefunction

fun testOperatorOverloading() {
    val test = Test()
    test(10)
}

//type function (classe - object)
fun testTypeClass() {
    val minhaFuncaoClasse: () -> Unit = Test()
    println(minhaFuncaoClasse())
}

//type function (reference - variable)
fun testTypeReference() {
    val myFunction: () -> Unit = ::test
    println(myFunction())
}
//lazy evaluation (Avaliação preguiçosa)→ que só executa exatamente quando
// chamarmos não só quando indicamos o seu retorno

fun test() {
    println("Execute test")
}

class Test : () -> Unit {

    /*Para inicializar uma variável do tipo função com um objeto,
    implementamos uma função na classe. Ao implementar a função,
    sobrescrevemos o método invoke() e, como foi mencionado,
    ele é um "operador especial". Esse operador é conhecido
    como sobrecarga de operador ou operator overloading.

    Isso significa que não precisamos implementar um tipo função para obter um invoke()
    em uma classe, podemos também adicionar como um overloading operator */

    operator fun invoke(value: Int) {
        println(value)
    }

    //invoke → Operador especial que torna uma implementação de classe invocável
    //Quando temos uma classe com a implementação logo abaixo, indiretamente ela tem esse tipo função
    override fun invoke() {
        println("Execute invoke test")
    }
}