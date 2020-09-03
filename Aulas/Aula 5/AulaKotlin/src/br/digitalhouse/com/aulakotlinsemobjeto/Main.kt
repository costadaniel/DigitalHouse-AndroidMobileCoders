package br.digitalhouse.com.aulakotlinsemobjeto

fun main() {
    firstOneHundred();
}

fun meuNome( nome: String, sobrenome: String) : String {
    return nome+" "+sobrenome
}

// Questão 1
fun maiorDeTres(number1: Int, number2: Int, number3: Int) : Int {
    var maior = number1

    if (maior <= number2) {
        maior = number2
    }
    if ( maior <= number3) {
        maior = number3
    }

    return maior
}

// Questão 2
fun differentStrings(str1: String, str2: String): Boolean {
    return (str1 != str2)
}

// Questão 3
fun isEven(number: Int): Boolean {
    return (number%2 == 0)
}

// Questão 4
fun printOdds(limit: Int) {
    var step = 0
    var number = 1

    while (step < limit) {
        if(!isEven(number)){
            println(number)
            step++
        }
        number++
    }
}

// Questão 5
fun fourNumberAnalysis(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD)))
}

// Questão 6
fun firstOneHundred() {
    for (number in 1..100) println(number)
}