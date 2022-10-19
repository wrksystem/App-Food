package com.example.appfood.retrofit

import com.example.appfood.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {
    @GET("random.php")
    fun getRandomMeal(): retrofit2.Call<MealList>

    @GET("lookup.php")
    fun getMealDetails(@Query("i") id: String): Call<MealList>



}