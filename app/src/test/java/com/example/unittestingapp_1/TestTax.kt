package com.example.unittestingapp_1

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax: Tax

    @Before
    fun setup(){
        tax=Tax()
    }

    @Test
    fun calculateTax(){

        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncome(){

        val netIncome = tax.calculateTax(100.0,0.1)
        assertThat(netIncome).isNonZero()

    }
}