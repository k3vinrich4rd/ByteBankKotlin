package br.com.alura.bytebank.template.paradigmafuncional.typefunction

fun typeFunctionAnonymous() {
    //Forma de fazer uma função anônima
    /* Diferença:
    *  *Declara como se tivesse uma função
     e declara seu tipo, exemplo:*/

//    Não é reutilizável por conta do vínculo a variável
//    tipo função
    val myFunctionAnonymous: () -> Unit = fun() {
        println("Executa como anônimo")
    }
    println(myFunctionAnonymous())
}