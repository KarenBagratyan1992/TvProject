package com.example.tvproject.data.di

import com.example.tvproject.data.mapers.DataToDomain
import com.example.tvproject.data.mapers.MoveAppDataToDomainMapper
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val mapperKonModule = module { factoryOf(::MoveAppDataToDomainMapper) }