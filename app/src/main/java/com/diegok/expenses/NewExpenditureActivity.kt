package com.diegok.expenses

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.view.View
import android.widget.EditText
import org.jetbrains.anko.*


class NewExpenditureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        NewExpenditureUI().setContentView(this)
    }
}


class NewExpenditureUI : AnkoComponent<NewExpenditureActivity> {
    override fun createView(ui: AnkoContext<NewExpenditureActivity>): View {
        return with(ui) {
            var expenseEditText: EditText? = null
            verticalLayout {
                padding = dip(30)
                linearLayout {
                    expenditureDescriptions.map {
                        textView {
                            text = it.description
                            textSize = 22f
                            backgroundColor = it.color
                            onClick { expenseEditText?.setText(text) }
                        }
                    }
                }.lparams(height = wrapContent)
                expenseEditText = editText {
                    hint = "Expense"
                    textSize = 24f
                }
                editText {
                    hint = "Cost"
                    inputType = InputType.TYPE_CLASS_NUMBER
                    textSize = 24f
                }
                button("Send") {
                    textSize = 26f
                    onClick { toast("hi") }
                }
            }
        }
    }
}