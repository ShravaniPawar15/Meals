package com.example.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.meals.screens.MealsCategoriesScreen
import com.example.meals.viewmodels.MainViewModelFactory
import com.example.meals.viewmodels.MyViewModel


class MainActivity : ComponentActivity() {

    lateinit var mainViewModel: MyViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository  = (application as MealApplication).mealRepository
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(repository)).get(MyViewModel::class.java)
        setContent {
                MealsCategoriesScreen()
            }
        }
    }



