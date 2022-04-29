@file:JsExport

package com.example.kmpwithweb

import kotlin.js.JsExport


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}