package com.example.tvproject.data.di

import org.koin.dsl.module

internal val dataKoinModule = module {includes(

    moveApiDataSource,
    retrofitKoinModule,
    mapperKonModule
) }