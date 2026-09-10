#!/usr/bin/env kotlin
@file:Import("OldCodeTranslation.main.kts") //import funcs from other file

// Test exchangeMoney
check(exchangeMoney(127.5, 1.2) == 106.25)

// Test getChange
check(getChange(127.5, 120.0) == 7.5)
check(getChange(300.75, 150.25) == 150.5)

// Test getNumberOfBills
check(getNumberOfBills(127.5, 5) == 25)
check(getNumberOfBills(35.16, 10) == 3)

// Test exchangeableValue
check(exchangeableValue(127.25, 1.20, 10, 20) == 80)
check(exchangeableValue(127.25, 1.20, 10, 5) == 95)

println("All tests passed")
