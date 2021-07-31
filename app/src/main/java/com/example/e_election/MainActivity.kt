package com.example.e_election

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.e_election.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var binder :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        val database = Firebase.database
        val myref = database.getReference("message")

        myref.setValue("Hello RDR!")

        myref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                Log.d(TAG,"Value is "+ value)
                binder.id.setText(value)
            }

            override fun onCancelled(error: DatabaseError) {
                Log.d(TAG,"Falied to read Value",error.toException())
            }

        })

    }
}