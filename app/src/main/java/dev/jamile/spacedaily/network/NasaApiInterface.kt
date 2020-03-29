package dev.jamile.spacedaily.network

import retrofit2.http.GET

const val API_KEY = "Fhx05VKf5NE3FVIoOGT6cmfdKFGnJ2lII1SWV7T5"

interface NasaApiInterface {
    @GET("apod?api_key=$API_KEY")
    suspend fun getDailyPhoto(): PhotoResponse
}