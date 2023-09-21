package com.example.tvproject.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.example.tvproject.R
import com.example.tvproject.databinding.TvShowLayoutAdapterBinding
import com.example.tvproject.presentation.MoveAppPresentationModels.MoveAppPresentationModel


class MyAdapter : ListAdapter<MoveAppPresentationModel, MyAdapter.MyViewHolder>(DiffCallBack()) {


    inner class MyViewHolder(binding: TvShowLayoutAdapterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val image = binding.imgImageView
        val id = binding.tvId
        val name = binding.tvName
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tv_show_layout_adapter, parent, false)
        return MyViewHolder(TvShowLayoutAdapterBinding.bind(view))

    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = getItem(position)
        holder.image.load(current.original)
        holder.id.text = current.id.toString()
        holder.name.text = current.name


    }

}
