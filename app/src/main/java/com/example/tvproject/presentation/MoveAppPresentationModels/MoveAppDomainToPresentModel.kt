package com.example.tvproject.presentation.MoveAppPresentationModels

import com.example.tvproject.data.mapers.DataToDomain
import com.example.tvproject.domain.models.MoveAppDomainModel

class MoveAppDomainToPresentModel : DataToDomain<MoveAppDomainModel, MoveAppPresentationModel> {
    override fun delegate(input: MoveAppDomainModel): MoveAppPresentationModel =
        MoveAppPresentationModel(
            id = input.id,
            name = input.name,
            url = input.url,
            medium = input.medium,
            original = input.original
        )

}