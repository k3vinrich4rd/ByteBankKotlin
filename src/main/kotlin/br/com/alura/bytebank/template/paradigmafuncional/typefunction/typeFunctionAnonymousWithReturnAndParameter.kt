package br.com.alura.bytebank.template.paradigmafuncional.typefunction
fun typeFunctionAnonymousWithReturnAndParameter() {
    //Forma de fazer uma função anônima
    /* Diferença:
    *  *Declara como se tivesse uma função
     e declara seu tipo, exemplo:*/

    //Não é reutilizável por conta do vínculo a variável
    //tipo função
    val myFunctionAnonymous: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println("Resultado da função anônima: ${myFunctionAnonymous(5, 7)}")


    //Outra forma de se fazer:
    //Usada em situações que nós queremos deixar bem nítido o que queremos colocar
    //Como parâmetro, retorno e também definir o escopo de execução do código
    //A função anônima é uma maneira mais explicita de implementar uma (função) lambda

    val myFunctionAnonymous2 = fun(a: Int, b: Int): Int {
        return a + b
    }
    println("Resultado da função anônima2: ${myFunctionAnonymous2(1, 7)}")


    //outra forma de fazer:
    val myFunctionAnonymous3 = fun(a: Int, b: Int): Int = a + b
    println("Resultado da função anônima3: ${myFunctionAnonymous3(1,15)}")

}