package com.example.tvproject.data.datasource.remotDatasource

import com.example.tvproject.data.MoveAppDataModel.MoveAppDataModelsItem


class MoveApiDataSourceImpl(private val moveApiService: MoveAppApiService) : MoveApiDataSource {

    override suspend fun getMoveApiDataSource(): List<MoveAppDataModelsItem> = try {
        moveApiService.getDataFromMoveApiService()
    } catch (e: Exception) {
        emptyList()
    }
}
