package com.ferhatergun.myapplication.ui.landing

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.ferhatergun.myapplication.R
import com.ferhatergun.myapplication.base.BaseActivity
import com.ferhatergun.myapplication.databinding.ActivityMainBinding

class LandingPageActivity : BaseActivity<LandingPageViewModel, ActivityMainBinding>() {

    override val layoutId = R.layout.activity_main
    override val viewModel = lazy {
        ViewModelProviders.of(this).get(LandingPageViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel.value
    }

}