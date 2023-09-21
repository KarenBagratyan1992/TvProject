package com.example.tvproject.data.datasource.remotDatasource

import com.example.tvproject.data.MoveAppDataModel.MoveAppDataModelsItem

interface MoveApiDataSource {
    suspend fun getMoveApiDataSource():List<MoveAppDataModelsItem>
}