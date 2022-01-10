package com.example.daggerhilttutorial.data.api

import com.example.daggerhilttutorial.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}