package com.example.roomdatabase08012024.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatabase08012024.data.db.entity.FoodEntity

@Database(entities = [FoodEntity::class], version = 1)
abstract class FoodDatabase : RoomDatabase() {
    private var instance: FoodDatabase? = null
    abstract fun foodDao()

    fun getDb(context: Context): FoodDatabase? {
        if (instance == null) {
            return Room.databaseBuilder(
                context,
                this::class.java,
                "food-database"
            )
                .build()
        }

        return instance
    }
}