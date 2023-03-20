package br.com.alura.bytebank.template.paradigmafuncional.typefunction//Type function com retorno:
//KFunction0<Unit> É uma referência que (O valor significa que vai ter 2 parâmetros)
// representa uma função quando fazemos a introspecção
// Que é quando utilizamos uma técnica do reflexion


//Como instância um tipo função com parâmetros
//Quando utilizamos o tipo função, ele ter que ser igual
// à referência que estamos mandando e igual que vamos inicializar

fun testTypeFunReferenceWithReturn() {
    val myFunction: (Int, Int) -> Int = ::sum
    println("Result type reference function: ${myFunction(1, 2)}")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}


fun testTypeFunClassWithReturn() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Sum()
    println("Result type function class: ${minhaFuncaoClasse(1, 2)}")
}

//O invoke tem que sempre compatível com a assinatura
class Sum : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b


}