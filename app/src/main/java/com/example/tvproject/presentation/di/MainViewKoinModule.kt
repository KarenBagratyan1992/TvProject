package com.example.tvproject.presentation.di

import com.example.tvproject.presentation.ui.viewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

internal val mainViewModelKoinModule = module { viewModelOf(::MainViewModel) }