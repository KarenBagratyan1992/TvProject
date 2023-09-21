package com.example.tvproject.presentation.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.tvproject.presentation.MoveAppPresentationModels.MoveAppPresentationModel

class DiffCallBack:DiffUtil.ItemCallback<MoveAppPresentationModel>() {
    override fun areItemsTheSame(
        oldItem: MoveAppPresentationModel,
        newItem: MoveAppPresentationModel
    ): Boolean =
      oldItem.id == newItem.id


    override fun areContentsTheSame(
        oldItem: MoveAppPresentationModel,
        newItem: MoveAppPresentationModel
    ): Boolean = oldItem == newItem
}