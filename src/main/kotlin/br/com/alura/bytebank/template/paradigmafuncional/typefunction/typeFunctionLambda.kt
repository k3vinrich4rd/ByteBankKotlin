package br.com.alura.bytebank.template.paradigmafuncional.typefunction

//Forma de fazer type function com lambda
//Não é reutilizável por conta do vínculo a variável
fun typeFunctionLambda() {
    val myFunctionLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(myFunctionLambda())
}