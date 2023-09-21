package com.example.tvproject.data.mapers

interface  DataToDomain<T,O> {
    fun delegate (input:T):O

}