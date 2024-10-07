package com.example.roomdatabase08012024.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food")
data class FoodEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val price: String,
    val description: String,
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    val image: ByteArray,
)