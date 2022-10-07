package com.holpackartukii.holidayartukinemo.utils

import com.holpackartukii.holidayartukinemo.BuildConfig
import com.holpackartukii.holidayartukinemo.nevs.NewsAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NevsApiModule {

    /// it is faaaaake
    @Provides
    @Singleton
    fun providesNevsAPIService(): NewsAPIService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.API_KEY)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(NewsAPIService::class.java)
    }

    fun fakeFun(){
        providesNevsAPIService()
    }
}