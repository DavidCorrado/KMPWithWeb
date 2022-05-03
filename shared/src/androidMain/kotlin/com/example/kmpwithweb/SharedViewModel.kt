package com.example.kmpwithweb

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

actual open class SharedViewModel actual constructor() : ViewModel() {
    protected actual val viewModelScope: CoroutineScope = createViewModelScope()

    public actual override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}