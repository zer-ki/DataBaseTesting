package com.example.databasetesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.databasetesting.adapter.ErrorAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ErrorAdapter
    private lateinit var db: ErrorDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.errorRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ErrorAdapter(emptyList())
        recyclerView.adapter = adapter

        db = Room.databaseBuilder(applicationContext, ErrorDatabase::class.java, "error_database.db")
            .createFromAsset("databases/testDatabase6.db")
            .build()



    }
    override fun onResume() {
        super.onResume()
        loadDataFromDatabase()
    }
    private fun loadDataFromDatabase() {
        GlobalScope.launch(Dispatchers.Main) {
            val dataList = withContext(Dispatchers.IO){ db.dao().getAllData()}
            Log.d("MainActivity", "DataList size: ${dataList.size}")
            if(dataList != null) {
                Log.d("MainActivity", "DataList:  $dataList")
                adapter = ErrorAdapter(dataList)
                recyclerView.adapter = adapter
            }
            else Log.d("MainActivity", "DataList is null")
        }
    }
}