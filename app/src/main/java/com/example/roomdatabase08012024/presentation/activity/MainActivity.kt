package com.example.roomdatabase08012024.presentation.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.roomdatabase08012024.R
import com.example.roomdatabase08012024.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.getListFoods().observe(this) {
            Log.d("pphat", it.toString())
            Log.d("pphat", Thread.currentThread().name)
        }

        mainViewModel.queryListFoods(this)
    }
}