package com.example.roomdatabase08012024.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatabase08012024.data.db.entity.FoodEntity

@Database(entities = [FoodEntity::class], version = 1)
abstract class FoodDatabase : RoomDatabase() {
    abstract fun foodDao(): FoodDao

    companion object {
        private var instance: FoodDatabase? = null
        fun getDb(context: Context): FoodDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    FoodDatabase::class.java,
                    "food-database"
                ).build()
            }

            return instance
        }
    }
}