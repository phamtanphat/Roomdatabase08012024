package com.example.roomdatabase08012024.data.respository

import android.content.Context
import com.example.roomdatabase08012024.data.db.FoodDatabase
import com.example.roomdatabase08012024.data.db.entity.FoodEntity

class FoodRepository(var context: Context) {
    private var foodDao = FoodDatabase.getDb(context)?.foodDao()

    fun getListFoods(): List<FoodEntity> {
        return foodDao?.queryFoods() ?: emptyList()
    }
}