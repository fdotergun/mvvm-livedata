package com.ferhatergun.myapplication.base

open class UIEvent<out T>(private val content : T) {

    var hasBeenHandled = false
    private set

    fun getContent() : T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }
}