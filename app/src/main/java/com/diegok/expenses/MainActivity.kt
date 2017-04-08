package com.diegok.expenses

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import android.widget.EditText
import org.jetbrains.anko.*
import pub.devrel.easypermissions.EasyPermissions


class MainActivity : AppCompatActivity(), EasyPermissions.PermissionCallbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(30)
            var expense: EditText? = null
            listOf(
                    textView {
                        text = "Carrefour"
                        backgroundColor = Color.BLUE
                        onClick {
                            expense?.setText(text)
                            toast("clicked")
                        }
                    }.lparams(width = wrapContent),
                    textView {
                        text = "Carniceria"
                        backgroundColor = Color.RED
                        onClick {
                            expense?.setText(text)
                            toast("clicked")
                        }
                    }.lparams(width = wrapContent)
            )
            expense = editText {
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
                onClick {
                    toast("hi")
                }
            }
        }
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>?) {
        // Do nothing.
    }

    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>?) {
        TODO("not implemented")
    }
}
