package com.example.listviewnangcao

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class customAdapter(
    val activity: Activity,
    val list: List<outData>
):ArrayAdapter<outData>(activity,R.layout.list_item) {
    override fun getCount(): Int {
        return list.size //ve len tat ca ca dong o cac list ma ta tao ra
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context=activity.layoutInflater
        // layoutInflater la mot component giup chuyen doi layout xml thanh view sang android
        val rowView = context.inflate(R.layout.list_item,parent,false)
        val images=rowView.findViewById<ImageView>(R.id.images)
        val title=rowView.findViewById<TextView>(R.id.title)
        val textDescription=rowView.findViewById<TextView>(R.id.textDescription)

        title.text=list[position].title
        textDescription.text=list[position].description
        images.setImageResource(list[position].images)

        return rowView
    }
}