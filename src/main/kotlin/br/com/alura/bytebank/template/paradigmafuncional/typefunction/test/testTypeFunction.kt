package br.com.alura.bytebank.template.paradigmafuncional.typefunction.test

import br.com.alura.bytebank.template.paradigmafuncional.typefunction.lambdaWithMultiplesReturns
import br.com.alura.bytebank.template.paradigmafuncional.typefunction.testOperatorOverloading
import br.com.alura.bytebank.template.paradigmafuncional.typefunction.testTypeClass
import br.com.alura.bytebank.template.paradigmafuncional.typefunction.testTypeReference

fun main() {
    /*Tipo função:
    Todo tipo função exige um retorno
    A flecha faz essa separação entre os parâmetro e o retorno
    Os parênteses simbolizam o parâmetro que é possível receber */

    /*Mais sobre tipos (função): São variáveis que recebem nas quais
    que recebem funções por referências(funções) ou objetos (classes)
    e serão avaliadas apenas quando forem executadas minhaFuncaoClasses()
     */

    //::test: Estamos mandando a referência e não a execução
    //No tipo função uma função fica dentro de uma variável
    testTypeReference()
    testTypeClass()

    //Outra forma de chamar
    testOperatorOverloading()

}