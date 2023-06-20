package com.example.recyclerviews

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast

fun clearErrorOnType(){
    binding.etUsername.addTextChangedListener ( object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.tilUsername.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    } )
    binding.etPhone.addTextChangedListener ( object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.tilPhone.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    } )
    binding.etEmail.addTextChangedListener ( object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.tilEmail.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    } )
}


fun validateRegisterContacts(){
    val username =binding.etUsername.text.toString()
    val phone = binding.etPhone.text.toString()
    val email =binding. etEmail.text.toString()
    val password =binding. etPassword.text.toString()


    var error = false
    if (username.isBlank()){
        binding. tilUsername.error = "name is required"
        error = true
    }

    if (phonehone.isBlank()){
        binding.tilPhone.error = "contacts is required"
        error = true
    }

    if (email.isBlank()){
        binding.tilEmail.error = "Email is required"
        error = true
    }
    if (password.isBlank()){
        binding.tilPassword.error = "Password is required"


        if (!error){
            Toast.makeText(this,"$username,$phone,$password, $email", Toast.LENGTH_LONG).show()
        }

    }
}

