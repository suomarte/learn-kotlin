package dev.suomarte.learn.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Case004ListTest {

    /**
     * Shows that the standard way to create a list in Kotlin by using `listOf()` returns an immutable `List`.
     *
     * Note for Java developers:
     * - Since Java 9, the same can be achieved using `List.of()`.
     * - Before Java 9, this can be achieved using `Collections.unmodifiableList(mutableList)`.
     */
    @Test
    fun throwsExceptionWhenModifyingImmutableList() {
        val immutableList = listOf("one", "two")
        assertFailsWith<UnsupportedOperationException> {
            (immutableList as MutableList).add("three")
        }
        assertEquals(listOf("one", "two"), immutableList)
    }

    /**
     * Shows how to define a mutable List and proves its mutability through modification.
     *
     * Note for Java developers:
     * - In Java this is like `List<String> mutableList = new LinkedList();`
     */
    @Test
    fun allowsModificationWhenModifyingMutableList() {
        val mutableList = mutableListOf("one", "two")
        mutableList.add("three")
        assertEquals(listOf("one", "two", "three"), mutableList)
    }

    /**
     * Shows how to get a certain element at a certain position in the list
     */
    @Test
    fun returnsElementWhenUsingIndexAccessOperator() {
        val list = listOf("one", "two")
        val element = list[1]
        assertEquals("two", element)
    }

    /**
     * Shows how to get the first element of a list
     */
    @Test
    fun returnsFirstElementWhenCallingFirst() {
        val list = listOf("one", "two")
        val element = list.first()
        assertEquals("one", element)
    }

    /**
     * Shows how to get the last element of a list
     */
    @Test
    fun returnsLastElementWhenCallingLast() {
        val list = listOf("one", "two")
        val element = list.first()
        assertEquals("one", element)
    }

    /**
     * Shows how to get the amount of elements for a list
     */
    @Test
    fun returnsAmountOfElementsWhenCallingCount() {
        val list = listOf("one", "two")
        val amount = list.count()
        assertEquals(2, amount)
    }

    /**
     * Shows how to check if an element is contained by the list
     *
     * Note for Java developers:
     * - In Java you can do this by `List.contains()`
     */
    @Test
    fun returnsTrueWhenCertainElementIsPresent() {
        val list = listOf("one", "two")
        val present = "one" in list
        assertEquals(true, present)
    }

    /**
     * Shows that an element is appended when `add` is called
     */
    @Test
    fun elementIsAppendedWhenCallingAdd() {
        val list = mutableListOf("one", "two")
        list.add("three")
        assertEquals(listOf("one", "two", "three"), list)
    }

    /**
     * Shows that an element is removed `remove` is called
     */
    @Test
    fun elementIsRemovedWhenCallingRemove() {
        val list = mutableListOf("one", "two", "three")
        list.remove("two")
        assertEquals(listOf("one", "three"), list)
    }
}