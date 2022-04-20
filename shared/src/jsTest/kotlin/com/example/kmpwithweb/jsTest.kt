package com.example.kmpwithweb

import kotlin.test.Test
import kotlin.test.assertTrue

class JsGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("js"), "Check js is mentioned")
    }
}