package com.example.databasetesting.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.databasetesting.ErrorMessage
import com.example.databasetesting.R
import net.sqlcipher.database.SQLiteDatabase

class ErrorAdapter(private val dataList: List<ErrorMessage>) : RecyclerView.Adapter<ErrorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entity = dataList[position]
        holder.bind(entity)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.error_title)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.error_description)

        fun bind(entity: ErrorMessage) {
            titleTextView.text = entity.errorTitle
            descriptionTextView.text = entity.errorDescription
        }
    }
}