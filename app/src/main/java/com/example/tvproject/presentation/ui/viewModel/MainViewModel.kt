package com.example.tvproject.presentation.ui.viewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewModelScope

import com.example.tvproject.domain.useCase.GetMoveAppItemUseCase
import com.example.tvproject.presentation.MoveAppPresentationModels.MoveAppPresentationModel

import kotlinx.coroutines.launch


class MainViewModel(private val getMoveAppItemUseCase: GetMoveAppItemUseCase) : ViewModel() {


    private val _response: MutableLiveData<List<MoveAppPresentationModel>> = MutableLiveData()
    val responseTvShow: LiveData<List<MoveAppPresentationModel>> = _response

    init {
        getDAlData()
    }

    fun getDAlData() = viewModelScope.launch {
        val result = getMoveAppItemUseCase.getaRepoItem()
        _response.postValue(result)


    }


}

