package com.example.tvproject.data.datasource.remotDatasource


import com.example.tvproject.data.MoveAppDataModel.MoveAppDataModelsItem
import retrofit2.http.GET

interface MoveAppApiService {
    @GET(MoveAppUrlObject.END_POINT)
   suspend fun getDataFromMoveApiService():List<MoveAppDataModelsItem>
}