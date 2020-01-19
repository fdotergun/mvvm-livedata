package com.ferhatergun.myapplication.ui.landing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ferhatergun.myapplication.base.BaseViewModel

class LandingPageViewModel : BaseViewModel() {

    val text = MutableLiveData<String>("Deneme")
    var counter = 0
    fun onTextClicked() {
        counter += 1
        text.value = (counter).toString()
    }
}