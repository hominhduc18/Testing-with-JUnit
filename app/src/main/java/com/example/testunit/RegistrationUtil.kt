package com.example.testunit

object RegistrationUtil {


    private val existingUsers = listOf("Perter", "carl")
    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken    ten da dc sd
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits   pass chua it hon 2 so
     */

    fun validateRegistationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean{
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(username in existingUsers) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}