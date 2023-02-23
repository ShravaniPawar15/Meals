package com.example.meals.screens

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.meals.ui.theme.MealsTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//
//@RunWith(AndroidJUnit4::class)
//class MealsCategoriesScreenKtTest{
//
//    @Mock
//    private lateinit var  apiInterface: MealService
//    @Mock
//    private lateinit var mealsDataBase: MealDatabase
//    @Mock
//    private lateinit var  applicationContext: Context
//    @Mock
//    private lateinit var viewModel: MyViewModel
//
//
//
//    @get:Rule
//    val composeTestRule= createComposeRule()
//
//    @Before
//    fun setUp(){
//        MockitoAnnotations.initMocks(this)
////        val repository= MealRepository(apiInterface,mealsDataBase,applicationContext)
////        val mainViewModel= MyViewModel(repository)
//
//        composeTestRule.setContent {
//
//            MealsCategoriesScreen(viewModel)
//        }
//    }
//
//    @Test
//    fun verifyUi(){
//        composeTestRule.onNodeWithText("Beef").assertExists()
//        composeTestRule.onNodeWithContentDescription("Expand row icon").performClick()
//    }
//}

@RunWith(AndroidJUnit4::class)
class CategoryScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp(){
        composeTestRule.setContent {
            MealsTheme {
                MealsCategoriesScreen()
            }
        }
    }
    @Test
    fun myTest(){
        composeTestRule.onNodeWithContentDescription("Expand row icon 21").performClick()
        composeTestRule.onNodeWithContentDescription("Expand row icon 22").performClick()
        composeTestRule.onNodeWithText("Beef").assertExists()
        composeTestRule.onNodeWithText("Chicken").assertIsDisplayed()
    }
}