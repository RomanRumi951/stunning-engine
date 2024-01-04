package com.example.LoginApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.simpleloginapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            // Perform your login logic here

            // Show a confirmation dialog
            if(usernameEditText.text.toString() == "admin" && passwordEditText.text.toString() == "admin") {
                showConfirmationDialog()
            }
            else {
                showFailureConfirmationDialog()
            }
        }
    }

    private fun showConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Login Confirmation")
            .setMessage("You are logged in")
            .setPositiveButton("OK") { dialog, _ ->
                // You can perform additional actions here if needed
                dialog.dismiss()
            }

        val dialog = builder.create()
        dialog.show()
    }

    private fun showFailureConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Login Confirmation")
            .setMessage("Invalid Credentials!!")
            .setPositiveButton("OK") { dialog, _ ->
                // You can perform additional actions here if needed
                dialog.dismiss()
            }

        val dialog = builder.create()
        dialog.show()
    }
}