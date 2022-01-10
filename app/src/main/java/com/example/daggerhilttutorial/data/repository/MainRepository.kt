package com.example.daggerhilttutorial.data.repository

import com.example.daggerhilttutorial.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}