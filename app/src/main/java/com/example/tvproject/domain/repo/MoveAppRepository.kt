package com.example.tvproject.domain.repo

import com.example.tvproject.domain.models.MoveAppDomainModel
import com.example.tvproject.presentation.MoveAppPresentationModels.MoveAppPresentationModel

interface MoveAppRepository {
    suspend fun getMoveApp():List<MoveAppDomainModel>
}