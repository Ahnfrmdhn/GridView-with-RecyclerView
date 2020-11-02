package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_view.view.*

class RecyclerViewAdapter (private val context: MainActivity, private val aplList: ArrayList<AplModel>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return aplList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(aplList[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val aplLogo = view.imgAplLogo
        val aplName = view.txtAplName

        fun bindItems(data : AplModel){
            aplLogo?.setImageBitmap(data.logo)
            aplName?.text = data.nama

            itemView.setOnClickListener {
                val text = data.nama
                Toast.makeText(itemView.context, text, Toast.LENGTH_LONG).show()
            }
        }
    }

}