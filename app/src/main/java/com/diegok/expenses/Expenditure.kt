package com.diegok.expenses

import android.graphics.Color
import java.util.*

data class Expenditure(val description: String, val cost: Int, val time: Date)

data class ExpenditureDescription(val description: String, val color: Int = Color.BLUE)

val expenditureDescriptions = listOf(
        ExpenditureDescription("Carrefour"),
        ExpenditureDescription("Carniceria", Color.DKGRAY),
        ExpenditureDescription("Verduleria", Color.GREEN),
        ExpenditureDescription("Chino", Color.LTGRAY)
)