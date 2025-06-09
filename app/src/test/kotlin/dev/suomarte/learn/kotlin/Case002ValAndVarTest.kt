package dev.suomarte.learn.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

class Case002ValAndVarTest {

    /**
     * Shows that a variable declared with val is immutable
     *
     * Noticeable for Java developers:
     * - In Kotlin, val is equivalent to using the final modifier in Java.
     * - With val, you don't need to explicitly specify the type. The compiler can infer it.
     */
    @Test
    fun valIsImmutable() {
        val immutable = 1
        // immutable = 2; Commenting out this line produces a compile error
    }

    /**
     * Shows that a variable declared with var is mutable
     *
     * Noticeable for Java developers:
     * - In Kotlin, using var is equivalent to declaring a variable in Java without the final modifier.
     * - With var, you don't need to explicitly specify the type. The compiler can infer it.
     */
    @Test
    fun varIsMutable() {
        var mutable = 1
        mutable = 2
        assertEquals(2, mutable)
    }
}