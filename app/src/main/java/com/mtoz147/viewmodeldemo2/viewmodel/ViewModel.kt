package com.mtoz147.viewmodeldemo2.viewmodel

import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    private var total=0
    fun getTotal():Int{
        return total
    }

    fun setTotal(input:Int){
        total+=input
    }
}