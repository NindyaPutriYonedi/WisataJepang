package com.nindy.wisataj

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nindy.wisataj.adapter.GalleryAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var btnDetail : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnDetail = findViewById(R.id.btnDetail)

        btnDetail.setOnClickListener(){
            val intent = Intent(this, galery::class.java)
            startActivity(intent)
        }
    }
}


