package dev.suomarte.learn.kotlin

import kotlin.test.Test

class Case001PrintlnTest {

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
        val number = 5
        println("$name has number $number") // Prints: Michael has number 5
    }

    /**
     * Shows that the template function of println is able to add numbers.
     */
    @Test
    fun stringTemplateAddNumbers() {
        val one = 1
        val two = 2
        println("One plus two is ${one + two}") // Prints: One plus two is 3
    }
}