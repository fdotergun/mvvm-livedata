package com.ferhatergun.myapplication.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ferhatergun.myapplication.model.base.AlertDialogModel

open class BaseViewModel : ViewModel() {

    private val _showError = MutableLiveData<UIEvent<AlertDialogModel>>()

    val showError: LiveData<UIEvent<AlertDialogModel>>
        get() = _showError

    fun showErrorMessage() {
        _showError.value = UIEvent(
            AlertDialogModel(
                "Some Important Warning",
                "Some long important warning content you all should aware!"
            )
        )
    }
}