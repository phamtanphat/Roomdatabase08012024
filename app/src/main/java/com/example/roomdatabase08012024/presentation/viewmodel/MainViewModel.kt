package com.example.roomdatabase08012024.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdatabase08012024.data.db.entity.FoodEntity
import com.example.roomdatabase08012024.data.respository.FoodRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private var listFoodLiveData: MutableLiveData<List<FoodEntity>> = MutableLiveData()

    fun getListFoods(): LiveData<List<FoodEntity>> = listFoodLiveData

    fun queryListFoods(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            val listFood = FoodRepository.getListFoods(context)
//            listFoodLiveData.postValue(listFood)
        }
    }
}