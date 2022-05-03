package com.example.kmpwithweb

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

actual open class SharedViewModel actual constructor() {
    protected actual val viewModelScope: CoroutineScope = createViewModelScope()

    actual open fun onCleared() {
        viewModelScope.cancel()
    }
}