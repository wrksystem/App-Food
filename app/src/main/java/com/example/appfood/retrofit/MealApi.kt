package com.example.appfood.retrofit

import com.example.appfood.pojo.MealList
import retrofit2.http.GET

interface MealApi {
    @GET("random.php")
    fun getRandomMeal():retrofit2.Call<MealList>
}