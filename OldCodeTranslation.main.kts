#!/usr/bin/env kotlin
// This is a practice code I wrote for Exercism (a free website that helps you
// practice multiple languages). I don't have any code that I've actually written
// outside of that or SoftDes (and I don't have access to my SoftDes work) so I thought
// this could be the best way to complete this portion of the Assignment.

// This code demonstrates some math behind exchanging currency when traveling. I found the
// process of translating the code to Kotlin relatively simple (especially because it was just
// simple math). The more difficult part was rightfully categorizing each integer as the
// correct type. Kotlin had screamed at me multiple types for choosing float instead of Double,
// and also when I forgot to declare even one variable without the proper type. I'm not
// sure if we're supposed to have docstrings for Kotlin like we do for Python, so I
// simply described each function.

//Calculate and return the (estimated) value of the exchanged currency
fun exchangeMoney(budget: Double, exchangeRate: Double): Double {
    val exchangeMoney = budget / exchangeRate
    return exchangeMoney
}

// Calculate and return the amount of money left over from the budget after an exchange
fun getChange(budget: Double, exchangingValue: Double): Double {
    val getChange = budget - exchangingValue
    return getChange
}

// Calculate and return the number of bills that can be obtained from the given amount
//(no fractions)
fun getNumberOfBills(amount: Double, denomination: Int): Int {
    val getNumberOfBills = (amount / denomination).toInt()
    return getNumberOfBills
}

// Calculate and return the maximum value of the new currency after determining the
// exchange rate plus the spread
fun exchangeableValue(budget: Double, exchangeRate: Double, spread: Int, denomination: Int): Int {
    val newSpread = (spread.toDouble() / 100) * exchangeRate
    val newExchangeRate = exchangeRate + newSpread
    val bills = budget / newExchangeRate
    val newBills = (bills / denomination).toInt()
    val exchangeableValue = denomination * newBills
    return exchangeableValue
}

//