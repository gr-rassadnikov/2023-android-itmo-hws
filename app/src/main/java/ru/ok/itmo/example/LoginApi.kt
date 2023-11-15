package ru.ok.itmo.example

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.POST
import retrofit2.http.Body


interface LoginApi {
    @POST("login")
    suspend fun login(@Body userRequest: UserAuthorization): Response<String>

    @POST("logout")
    suspend fun logout(): Response<String>

    companion object {
        fun provideLoginApi(retrofit: Retrofit): LoginApi {
            return retrofit.create(LoginApi::class.java)
        }
    }
}