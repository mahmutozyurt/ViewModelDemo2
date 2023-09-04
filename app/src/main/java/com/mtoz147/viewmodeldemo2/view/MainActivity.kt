package com.mtoz147.viewmodeldemo2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mtoz147.viewmodeldemo2.R
import com.mtoz147.viewmodeldemo2.databinding.ActivityMainBinding
import com.mtoz147.viewmodeldemo2.viewmodel.ViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(ViewModel::class.java)
        binding.textResult.text=viewModel.getTotal().toString()

        binding.addBtn.setOnClickListener {
            viewModel.setTotal(binding.inputTxt.text.toString().toInt())
            binding.textResult.text=viewModel.getTotal().toString()
        }

    }
}