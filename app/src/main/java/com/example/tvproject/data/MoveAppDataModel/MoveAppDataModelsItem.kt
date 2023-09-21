package com.example.tvproject.data.MoveAppDataModel

import com.google.gson.annotations.SerializedName

data class MoveAppDataModelsItem(
   @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
   @SerializedName("url")
    val url: String?,
   @SerializedName("image")
   val imageInfo:Image?
)