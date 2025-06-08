package dev.suomarte.learn.Kotlin

import kotlin.test.Test

class PrintlnTest {

    /**
     * This is just a simple hello world, but implemented as test
     *
     * Noticeable for Java developers:
     * - methods in Java are functions fun in Kotlin
     * - a return void is not necessary
     * - semicolon at end of operation is optional
     */
    @Test
    fun helloWorld() {
        println("hello world")
    }

    /**
     * Shows the template function of println
     *
     * Noticeable for Java developers:
     * - In Kotlin, string templates are built directly into the println function.
     * - Inn Java, to use template-like functionality, you typically rely on utilities such as String.format.
     */
    @Test
    fun stringTemplate() {
        val name = "Michael"
        println("My name is $name") // Prints: My name is Michael
    }
}