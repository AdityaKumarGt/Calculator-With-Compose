package com.example.calculatorwithcompose

sealed class CalculatorActions{
    data class Number(val number:Int):CalculatorActions()
    object Clear:CalculatorActions()
    object Delete:CalculatorActions()
    object Calculate:CalculatorActions()
    object Decimal:CalculatorActions()
    data class Operation(val operation:CalculatorOperations):CalculatorActions()

}
