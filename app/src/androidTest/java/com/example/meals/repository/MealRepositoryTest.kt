package com.example.meals.repository

import android.content.Context
import com.example.meals.api.MealService
import com.example.meals.db.MealDatabase
import com.example.meals.models.MealResponse
import com.example.meals.models.MealsCategoryResponse
import com.example.meals.screens.MealCategory
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response
import org.junit.Assert.*


internal class MealRepositoryTest{


    lateinit var mainRepository: MealRepository

    @Mock
    private lateinit var  apiInterface: MealService
    @Mock
    private lateinit var mealsDataBase: MealDatabase
    @Mock
    private lateinit var  applicationContext: Context


    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
        mainRepository= MealRepository(apiInterface,mealsDataBase,applicationContext)

    }

    @Test
    fun get_meals_test(){
        runBlocking {

            Mockito.`when`(apiInterface.getMeals()).thenReturn(MealsCategoryResponse(listOf<MealResponse>()))
            var response= MealsCategoryResponse(listOf<MealResponse>())
            assertEquals(MealsCategoryResponse(listOf<MealResponse>()),response)

        }
    }
}