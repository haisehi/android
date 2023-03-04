package com.example.sqlite

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    private val context:Context,
    private val courseArrayList:ArrayList<course>
):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val tvCourseName:TextView?=view.findViewById(R.id.tvCourseName)
        val tvCourseDescription:TextView?=view.findViewById(R.id.tvCourseDescription)
        val tvCourseDuration:TextView?=view.findViewById(R.id.tvCourseDuration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.course_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val modal:course=courseArrayList.get(position)
        holder.tvCourseName!!.text=modal.getCourseName()
        holder.tvCourseDescription!!.text=modal.getDecription()
        holder.tvCourseDuration!!.text=modal.getCourseDuration()
        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount()=courseArrayList.size
}