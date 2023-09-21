package com.example.tvproject.domain.di

import org.koin.dsl.module

internal val domainKoinModule = module { includes(repoKoinModule,UseCaseKoinModule) }