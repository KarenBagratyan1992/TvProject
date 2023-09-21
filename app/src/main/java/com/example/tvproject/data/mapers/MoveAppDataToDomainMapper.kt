package com.example.tvproject.data.mapers


import com.example.tvproject.data.MoveAppDataModel.MoveAppDataModelsItem
import com.example.tvproject.domain.models.MoveAppDomainModel


class MoveAppDataToDomainMapper : DataToDomain<MoveAppDataModelsItem, MoveAppDomainModel> {
    override fun delegate(input: MoveAppDataModelsItem): MoveAppDomainModel =
        MoveAppDomainModel(
            id = input.id ?: 0,
            name = input.name.orEmpty(),
            url = input.url.orEmpty(),
            medium = input.imageInfo?.medium.orEmpty(),
            original = input.imageInfo?.original.orEmpty()
        )
}



