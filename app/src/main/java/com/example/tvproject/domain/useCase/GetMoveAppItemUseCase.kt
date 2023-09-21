package com.example.tvproject.domain.useCase


import com.example.tvproject.domain.repo.MoveAppRepository
import com.example.tvproject.presentation.MoveAppPresentationModels.MoveAppPresentationModel

class GetMoveAppItemUseCase(private val repo: MoveAppRepository) {
    suspend fun getaRepoItem():List<MoveAppPresentationModel> {
        return repo.getMoveApp().map {
            MoveAppPresentationModel(id=it.id,
            name = it.name, url = it.url, medium = it.medium, original = it.original)
        }
    }




}