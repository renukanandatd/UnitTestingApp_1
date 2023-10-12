package com.example.unittestingapp_1

class Tax {

    fun calculateTax(grossIncome : Double, taxRate : Double) : Double{
        return grossIncome*taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome - (grossIncome*taxRate)
    }
}