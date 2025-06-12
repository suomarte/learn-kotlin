package dev.suomarte.learn.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse

class Case005SetTest {

    /**
     * Shows how to define a mutable Set and proves its mutability through modification.
     *
     * Note for Java developers:
     * - In Java this is like `Set<String> mutableSet = new HashSet();`
     */
    @Test
    fun allowsModificationWhenModifyingMutableList() {
        val mutableList = mutableSetOf("one", "two")
        mutableList.add("three")
        assertEquals(setOf("one", "two", "three"), mutableList)
    }

    /**
     * Shows that elements in a set are unique by adding an already existing element.
     *
     * Note for Java developers:
     * - In Java the behavior is the same.
     */
    @Test
    fun setIsNotModifiedWhenElementIsAddedTwice() {
        val mutableSet = mutableSetOf("one", "two")
        mutableSet.add("two")
        assertEquals(setOf("one", "two"), mutableSet)
        assertEquals(2, mutableSet.size)
    }

    /**
     * Shows how to check if an element is contained by the list
     *
     * Note for Java developers:
     * - In Java you can do this by `Set.contains()`
     */
    @Test
    fun returnsTrueWhenCertainElementIsPresent() {
        val set = setOf("one", "two")
        val present = "one" in set
        assertEquals(true, present)
    }

    /**
     * Shows that an element is appended when `add` is called
     */
    @Test
    fun elementIsAddedWhenCallingAdd() {
        val set = mutableSetOf("one", "two")
        set.add("three")
        assertEquals(setOf("one", "two", "three"), set)
    }

    /**
     * Shows that an element is removed `remove` is called
     */
    @Test
    fun elementIsRemovedWhenCallingRemove() {
        val set = mutableSetOf("one", "two", "three")
        set.remove("two")
        assertEquals(setOf("one", "three"), set)
    }
}