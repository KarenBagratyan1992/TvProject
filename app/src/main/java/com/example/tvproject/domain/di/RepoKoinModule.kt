package com.example.tvproject.domain.di

import com.example.tvproject.data.repositoryImple.MoveAppRepositoryImpl
import com.example.tvproject.domain.repo.MoveAppRepository
import org.koin.dsl.module

internal val repoKoinModule = module {
    single<MoveAppRepository>
    { MoveAppRepositoryImpl(moveDataSource = get(), mapper = get()) }
}