package com.example.roomdatabase08012024.data.respository

import android.content.Context
import com.example.roomdatabase08012024.data.db.FoodDatabase
import com.example.roomdatabase08012024.data.db.entity.FoodEntity

object FoodRepository {
    fun getListFoods(context: Context): List<FoodEntity> {
        return FoodDatabase.getDb(context)
            ?.foodDao()
            ?.queryFoods() ?: emptyList()
    }
}