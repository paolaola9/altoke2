package com.spacex.altoke

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.spacex.altoke.R.id.parent
import kotlinx.android.synthetic.main.item_lista_de_servicios.view.*

/**
 * Created by a23j901 on 19/04/2018.
 */
class ServiceItemAdapter (val items: ArrayList<ServiceItem>, val context: Context): RecyclerView.Adapter<ServiceItemAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textView2?.text=items.get(position).title
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_lista_de_servicios, parent,false))

    }



    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view : View) :RecyclerView.ViewHolder(view) {
        val textView2=view.textView2
    }
}