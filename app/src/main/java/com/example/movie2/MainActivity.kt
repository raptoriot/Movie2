package com.example.movie2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movie2.adapter.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var movies= arrayListOf("Parcela","foto1","foto2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moviesRV.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,true)
        moviesRV.adapter =MovieAdapter(movies)
    }
}
