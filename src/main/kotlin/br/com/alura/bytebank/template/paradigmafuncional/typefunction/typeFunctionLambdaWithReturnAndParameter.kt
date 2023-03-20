package br.com.alura.bytebank.template.paradigmafuncional.typefunction

fun typeFunctionLambdaWithReturnAndParameter() {
    //Forma de fazer type function com lambda
    //Não é reutilizável por conta do vínculo a variável


    //Underline → Em uma expressão lambda o _ , significa que parâmetro não está sendo usado
    val myFunctionLambda: (Int, Int, Int) -> Int = { a, b, _ ->
       a + b
    }
    println("Resultado lambda: ${myFunctionLambda(16,9, 0)}")


    //outra forma de implementação:
    //A diferença é que agora, é obrigatório informar o tipo do parâmetro
    val myFunctionLambda2 = { a: Int, b: Int ->
        a + b
    }
    println("Resultado lambda: ${myFunctionLambda2(16,9)}")
}