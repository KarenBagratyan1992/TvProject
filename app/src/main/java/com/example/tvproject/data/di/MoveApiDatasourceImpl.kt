package com.example.tvproject.data.di

import com.example.tvproject.data.datasource.remotDatasource.MoveApiDataSource
import com.example.tvproject.data.datasource.remotDatasource.MoveApiDataSourceImpl
import com.example.tvproject.data.datasource.remotDatasource.MoveAppApiService
import org.koin.core.module.dsl.bind
import com.example.tvproject.databinding.ActivityMainBinding.bind
import org.koin.core.module.dsl.singleOf

import org.koin.dsl.module

internal val moveApiDataSource = module {
    singleOf(
        ::MoveApiDataSourceImpl
    ) { bind<MoveApiDataSource>() }
}