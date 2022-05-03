package com.example.kmpwithweb

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
var createViewModelScope: () -> CoroutineScope = {
    CoroutineScope(createUIDispatcher())
}

fun createUIDispatcher(): CoroutineDispatcher = Dispatchers.Main