package com.example.kmpwithweb

import kotlinx.coroutines.CoroutineScope

expect open class SharedViewModel() {
    protected val viewModelScope: CoroutineScope

    open fun onCleared()
}