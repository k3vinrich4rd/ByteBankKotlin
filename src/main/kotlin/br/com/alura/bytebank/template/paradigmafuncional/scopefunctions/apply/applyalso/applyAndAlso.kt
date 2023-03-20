package br.com.alura.bytebank.template.paradigmafuncional.scopefunctions.apply.applyalso


fun main() {

    //Retorna o próprio objeto de contexto
    val numberList: MutableList<Double> = mutableListOf()
    numberList.also { println("Populating the lista") }
        .apply {
            add(2.27)
            add(3.14)
            add(1.9)
            println(numberList)
        }
        .also { println("Sorting the lista") }
        .sort()
    println(numberList)

}