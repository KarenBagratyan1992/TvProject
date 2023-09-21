package com.example.tvproject.domain.di

import com.example.tvproject.domain.useCase.GetMoveAppItemUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val UseCaseKoinModule = module { singleOf(::GetMoveAppItemUseCase)  }