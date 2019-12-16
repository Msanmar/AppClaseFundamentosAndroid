package io.keepcoding.eh_ho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instancia botón
       //val button: Button = findViewById<Button>(R.id.buttonLogin)
       /* val listener: ((View) -> Unit) = { view: View ->

            //Recuperar el username
            val username: String = findViewById<AppCompatEditText>(R.id.inputUser).text.toString()
            //Mostrar el mensaje
            Toast.makeText(this, "Wellcome to Eh-Ho ${username}", Toast.LENGTH_SHORT).show() //interpolación de cadenas
        }*/


      // button.setOnClickListener{login()}
    }

    fun login(view:View) {
       /* //Recuperar el username
        val username: String = findViewById<AppCompatEditText>(R.id.inputUser).text.toString()
        //Mostrar el mensaje
        Toast.makeText(this, "Wellcome to Eh-Ho ${username}", Toast.LENGTH_SHORT).show() //interpolación de cadenas
        */

        val intent: Intent = Intent(this, TopicsActivity::class.java)
        startActivity(intent)
    }

}
