package br.com.alura.bytebank.template.paradigmafuncional.typefunction

//Como fazer um lambda com multiplos retornos
///Um lambda sempre retorna a última instrução
fun lambdaWithMultiplesReturns() { //it.: fica disponível em tipos de função que tem apenas um parâmetro

    //label → É um tipo de retorno que possibilita fazer
// uma identificação para uma função, expressão lambda e etc
    //E indicar que o retorno vai ser a partir dessa label
    //Declarando um return a partir de labels (exemplo):

    val calculaBonificacao: (salary: Double) -> Double = lambda@{
        if (it > 1000.00) {
            return@lambda it + 50.00
        }
        return@lambda it + 100.00
        // it + 100.00 // Forma implícita de se fazer
    }
    println(calculaBonificacao(1100.00))


    //Outra forma de instância (Colocando apelido no it.):
    val calculaBonificacao2: (salary: Double) -> Double = lambda@{ salary ->
        if (salary > 1000.00) {
            return@lambda salary + 50.00
        }
        return@lambda salary + 100.00
    }
    println(calculaBonificacao2(10000.00))

    val calculaBonificacaoAnonima: (salary: Double) -> Double = fun (salary) : Double {
        if (salary > 1000.00){
            return salary + 50.00
        }
        return salary + 100.00
    }
    println(calculaBonificacaoAnonima(1005.00))

}