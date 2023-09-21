package com.example.tvproject.presentation.di

import android.app.Application
import com.example.tvproject.data.di.dataKoinModule

import com.example.tvproject.domain.di.domainKoinModule

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class MyApp():Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { androidContext(this@MyApp)
        modules (domainKoinModule,dataKoinModule, mainViewModelKoinModule)
        }
    }
}