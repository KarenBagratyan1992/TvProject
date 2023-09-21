package com.example.tvproject.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import com.example.tvproject.R
import com.example.tvproject.databinding.FragmentMoveAppBinding
import com.example.tvproject.presentation.MoveAppPresentationModels.MoveAppDomainToPresentModel
import com.example.tvproject.presentation.ui.adapter.MyAdapter
import com.example.tvproject.presentation.ui.viewModel.MainViewModel

import org.koin.androidx.viewmodel.ext.android.viewModel

class MoveAppFragment : Fragment() {
   var binding:FragmentMoveAppBinding?=null
    var rv:MyAdapter?=null
    val viewModel:MainViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentMoveAppBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv= MyAdapter()
        binding?.rvMove?.adapter=rv
        viewModel.responseTvShow.observe(viewLifecycleOwner){
            rv?.submitList(it)
        }
    }



}