package com.example.tvproject.data.di

import com.example.tvproject.data.datasource.remotDatasource.MoveAppApiService
import com.example.tvproject.data.datasource.remotDatasource.MoveAppUrlObject
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

internal val retrofitKoinModule = module { single<MoveAppApiService> { retrofitInstace() } }


private fun retrofitInstace() = Retrofit.Builder()
        .baseUrl(MoveAppUrlObject.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(MoveAppApiService::class.java)