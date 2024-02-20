package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.`in`
import org.junit.jupiter.api.Test

class Tests {


    @Test
    fun testStack() {
        val stack = Stack<Int>()
        stack.push(5)
        assertThat(stack.peek()).isEqualTo(5)
        assertThat(stack.length).isEqualTo(1)
        stack.push(9)
        assertThat(stack.peek()).isEqualTo(9)
        assertThat(stack.length).isEqualTo(2)
        stack.pop()
        assertThat(stack.length).isEqualTo(1)
        assertThat(stack.peek()).isEqualTo(5)
    }


    @Test
    fun testDoublyLinkedList() {
        val linkedList = LinkedList<Int>()

        linkedList.append(10)
        linkedList.append(2)
        linkedList.append(5)
        linkedList.prepend(1)

        assertThat(linkedList.length).isEqualTo(4)

        assertThat(linkedList.get(0)).isEqualTo(1)
        assertThat(linkedList.get(1)).isEqualTo(10)
        assertThat(linkedList.get(2)).isEqualTo(2)
        assertThat(linkedList.get(3)).isEqualTo(5)
        linkedList.insertAt(100, 3)
        assertThat(linkedList.length).isEqualTo(5)
        assertThat(linkedList.get(3)).isEqualTo(100)
        assertThat(linkedList.get(4)).isEqualTo(5)
        linkedList.removeAt(100, 3)
        assertThat(linkedList.get(3)).isEqualTo(5)

    }

}