package com.quiz.users.api

import com.quiz.users.model.User
import com.quiz.users.model.UserData
import retrofit2.http.*
import java.io.IOException

interface ApiInterface {

    @GET("users")
    @Throws(IOException::class)
    suspend fun getAllUsers(@Query("page") page: Int = 1): UserData

    @POST("users")
    @Throws(IOException::class)
    suspend fun createUser(@Body user: User)

    @DELETE("users/{userId}")
    @Throws(IOException::class)
    suspend fun deleteUser(@Path("userId") userID: Int)
}