package dev.suomarte.learn.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

class Case003BasicTypesTest {

    /**
     * Shows arithmetic operations of basic type integer
     *
     * Noticeable for Java developers:
     * - Kotlin supports the same arithmetic operations for integers as Java developers would expect.
     * - With var, you don't need to explicitly specify the type. The compiler can infer it. In this case integer.
     */
    @Test
    fun shouldShowArithmeticExpressionsForIntegers() {
        var number = 10
        number = 8
        number = number + 3
        number += 7
        number -= 3
        number *= 2
        number /= 3
        assertEquals(10, number)
    }


    /**
     * Shows Kotlin's nullability feature for a basic tpye.
     * - `byteNull` is a nullable Byte and can be assigned `null`.
     * - Attempting to assign `null` to a non-nullable Byte (`byteNotNull`) would result in a compilation error.
     *
     * Noticeable for Java developers:
     * - Unlike Java, Kotlin does not have primitive types; all types are represented as classes.
     * - A Byte cannot be null by default. To allow nullability, use Byte?.
     */
    @Test
    fun shouldShowNullability() {
        val byteNull: Byte? = null
        // val byteNotNull: Byte = null // does not compile
        assertEquals(null, byteNull)
    }

    /**
     * Shows the initialization of the basic type Byte, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * As in Java, the range of Byte in Kotlin is from -128 to 127.
     */
    @Test
    fun shouldShowByteRange() {
        val byteMinValue: Byte = -128
        val byteMaxValue: Byte = 127
        // val lessThenMinValue: Byte = -129 // does not compile
        // val lessThanMaxValue: Byte = 128  // does not compile
        assertEquals(Byte.MIN_VALUE, byteMinValue)
        assertEquals(Byte.MAX_VALUE, byteMaxValue)
        assertEquals(Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE)
        assertEquals(Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE)
    }

    /**
     * Shows the initialization of the basic type Short, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * As in Java, the range of Short in Kotlin is from -32768 to 32767.
     */
    @Test
    fun shouldShowShortRange() {
        val shortMinValue: Short = -32768
        val shortMaxValue: Short = 32767
        // val lessThenMinValue: Byte = -32769 // does not compile
        // val lessThanMaxValue: Byte = 32768  // does not compile
        assertEquals(Short.MIN_VALUE, shortMinValue)
        assertEquals(Short.MAX_VALUE, shortMaxValue)
        assertEquals(Short.MIN_VALUE, java.lang.Short.MIN_VALUE)
        assertEquals(Short.MAX_VALUE, java.lang.Short.MAX_VALUE)
    }

    /**
     * Shows the initialization of the basic type Int, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * As in Java, the range of Int in Kotlin is from -2147483648 to 2147483647.
     */
    @Test
    fun shouldShowIntRange() {
        val intMinValue: Int = -2147483648
        val intMaxValue: Int = 2147483647
        // val lessThenMinValue: Byte = -2147483649 // does not compile
        // val lessThanMaxValue: Byte = 2147483648  // does not compile
        assertEquals(Int.MIN_VALUE, intMinValue)
        assertEquals(Int.MAX_VALUE, intMaxValue)
        assertEquals(Int.MIN_VALUE, Integer.MIN_VALUE)
        assertEquals(Int.MAX_VALUE, Integer.MAX_VALUE)
    }

    /**
     * Shows the initialization of the basic type Long, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * As in Java, the range of Long in Kotlin is from -9223372036854775808 to 9223372036854775807.
     */
    @Test
    fun shouldShowLongRange() {
        val longMinValue: Long = -9223372036854775807L - 1L
        val longMaxValue: Long = 9223372036854775807L
        // val lessThenMinValue: Byte = -9223372036854775807L - 2L // does not compile
        // val lessThanMaxValue: Byte = 9223372036854775808L  // does not compile
        assertEquals(Long.MIN_VALUE, longMinValue)
        assertEquals(Long.MAX_VALUE, longMaxValue)
        assertEquals(Long.MIN_VALUE, java.lang.Long.MIN_VALUE)
        assertEquals(Long.MAX_VALUE, java.lang.Long.MAX_VALUE)
    }

    /**
     * Shows the initialization of the basic type unsigned Byte, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * - Java does not have true primitive unsigned types in the same way as Kotlin.
     * - Unlike in Java, literals for basic unsigned types must have the postfix u.
     */
    @Test
    fun shouldShowUnsignedByteRange() {
        val uByteMinValue: UByte = 0u
        val uByteMaxValue: UByte = 255u
        // val lessThenMinValue: Byte = -1u // does not compile
        // val lessThanMaxValue: Byte = 256u  // does not compile
        assertEquals(UByte.MIN_VALUE, uByteMinValue)
        assertEquals(UByte.MAX_VALUE, uByteMaxValue)
    }

    /**
     * Shows the initialization of the basic type unsigned Short, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * - Java does not have true primitive unsigned types in the same way as Kotlin.
     * - Unlike in Java, literals for basic unsigned types must have the postfix u.
     *
     */
    @Test
    fun shouldShowUnsignedShortRange() {
        val uShortMinValue: UShort = 0u
        val uShortMaxValue: UShort = 65535u
        // val lessThenMinValue: Byte = -1u // does not compile
        // val lessThanMaxValue: Byte = 65536u  // does not compile
        assertEquals(UShort.MIN_VALUE, uShortMinValue)
        assertEquals(UShort.MAX_VALUE, uShortMaxValue)
    }

    /**
     * Shows the initialization of the basic type unsigned Int, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * - Java does not have true primitive unsigned types in the same way as Kotlin.
     * - Unlike in Java, literals for basic unsigned types must have the postfix u.
     *
     */
    @Test
    fun shouldShowUnsignedIntRange() {
        val uIntMinValue: UInt = 0u
        val uIntMaxValue: UInt = 4294967295u
        // val lessThenMinValue: Byte = -1 // does not compile
        // val lessThanMaxValue: Byte = 4294967296u  // does not compile
        assertEquals(UInt.MIN_VALUE, uIntMinValue)
        assertEquals(UInt.MAX_VALUE, uIntMaxValue)
    }

    /**
     * Shows the initialization of the basic type unsigned Long, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * - Java does not have true primitive unsigned types in the same way as Kotlin.
     * - Unlike in Java, literals for the basic type ULong must have the postfix uL.
     */
    @Test
    fun shouldShowUnsignedLongRange() {
        val uLongMinValue: ULong = 0uL
        val uLongMaxValue: ULong = 18446744073709551615uL
        // val lessThenMinValue: Byte = -1uL // does not compile
        // val lessThanMaxValue: Byte = 18446744073709551616uL  // does not compile
        assertEquals(ULong.MIN_VALUE, uLongMinValue)
        assertEquals(ULong.MAX_VALUE, uLongMaxValue)
    }

    /**
     * Shows the initialization of the basic type Float, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * - Float in Java and Kotlin is based on the same JVM type and behaves nearly identically in usage.
     * - Just like in Java, Kotlin requires an f suffix to denote a Float literal instead of a Double.
     */
    @Test
    fun shouldShowFloatRange() {
        val floatMinValue: Float = 1.4E-45f
        val floatMaxValue: Float = 3.4028235E38f
        assertEquals(Float.MIN_VALUE, java.lang.Float.MIN_VALUE)
        assertEquals(Float.MAX_VALUE, java.lang.Float.MAX_VALUE)
    }

    /**
     * Shows the initialization of the basic type Double, including its minimum and maximum values.
     *
     * Noticeable for Java developers:
     * - Double in Java and Kotlin is based on the same JVM type and behaves nearly identically in usage.
     * - Just like in Java, Kotlin requires no suffix to denote a Double literal.
     */
    @Test
    fun shouldShowDoubleRange() {
        val doubleMinValue: Double = 1.4E-45
        val doubleMaxValue: Double = 1.7976931348623157E308
        assertEquals(Double.MIN_VALUE, java.lang.Double.MIN_VALUE)
        assertEquals(Double.MAX_VALUE, java.lang.Double.MAX_VALUE)
    }

    /**
     * Shows the string interpolation feature of kotlin
     *
     *  Noticeable for Java developers:
     *  - String interpolation is a very useful feature in Kotlin that is not available in Java.
     */
    @Test
    fun showStringInterpolationFeature() {
        val number = 5
        val kotlinString: String = "Text $number"
        val javaString: java.lang.String = java.lang.String("Text " + number);
        assertEquals(kotlinString, javaString.toString())
    }
}