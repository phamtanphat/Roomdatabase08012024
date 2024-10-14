package com.example.roomdatabase08012024.data.db

import androidx.room.Dao
import androidx.room.Query
import com.example.roomdatabase08012024.data.db.entity.FoodEntity

@Dao
interface FoodDao {
    @Query("Select * from food")
    fun queryFoods(): List<FoodEntity>
}