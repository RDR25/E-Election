package com.example.e_election

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.e_election.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binder: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binder.root)

        binder.loginBtn1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })

        binder.register1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}