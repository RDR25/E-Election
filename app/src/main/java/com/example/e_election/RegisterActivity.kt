package com.example.e_election

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.e_election.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binder:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binder.root)

        binder.register2.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })

        binder.loginBtn2.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })
    }
}