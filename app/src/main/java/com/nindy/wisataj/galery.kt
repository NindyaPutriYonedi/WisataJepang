package com.nindy.wisataj

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nindy.wisataj.adapter.GalleryAdapter


class galery : AppCompatActivity() {
    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.sensoji,
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_beranda)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailPage::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}
