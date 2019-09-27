package com.example.movie2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movie2.R
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.adapter_movie.view.*


class MovieAdapter (private  val movies:ArrayList<String>): RecyclerView.Adapter<MovieAdapter.MyViewHolder>(){
    override fun onBindViewHolder(myViewHolder: MyViewHolder, position: Int) {
        myViewHolder.buildView(movies.get(position))
    }

    override fun getItemCount(): Int {
        return movies.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }


    class MyViewHolder(parent:ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_movie,parent,false)){

        fun buildView(movie:String) =with(itemView){
            movieTV.text=movie
        }
    }
}

