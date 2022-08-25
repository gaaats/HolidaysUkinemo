package com.holidayscountrypackone.holidaysukraine

import com.holidayscountrypackone.holidaysukraine.entity.ListHolidays
import com.holidayscountrypackone.holidaysukraine.recycler.ExercicesListrRsponse
import okhttp3.Interceptor
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MuscleService {

    companion object {
        const val BASE_URL = "https://api.api-ninjas.com/v1/"
        const val API_KEY = BuildConfig.API_KEY
        const val COUNTRY = "Ukraine"
        const val YEAR = "2021"
    }


    @GET("exercises")
    suspend fun getExercises(
        @Query("muscle") muscle: String = COUNTRY,
    ): Response<ExercicesListrRsponse>

    @GET("holidays")
    suspend fun getHolidays(
        @Query("country") country : String = COUNTRY,
        @Query("year") year : String = YEAR,
    ): Response<ListHolidays>


}

class MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("X-Api-Key", MuscleService.API_KEY)
            .build()
        return chain.proceed(request)
    }
}