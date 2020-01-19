package com.ferhatergun.myapplication.base

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer

abstract class BaseActivity<T : BaseViewModel, S : ViewDataBinding> : AppCompatActivity() {

    abstract val layoutId: Int
    abstract val viewModel: Lazy<T>
    lateinit var binding: S


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this

        viewModel.value.showError.observe(this, Observer {
            it.getContent()?.let {
                showError(it.title, it.message)
            }
        })
    }

    private fun showError(title: String, message: String) {
        val alertDialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Okay", null)
            .setNegativeButton("Don't Care", null)
            .create()
        alertDialog.show()
    }
}