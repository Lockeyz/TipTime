package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 17.00
        val tipPercent = 20.00
        val expectedTip = "$3.40"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }
}