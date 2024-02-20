package com.example.demo

class Stack<T> {
    public var length: Int = 0
    private var head: StackNode<T>? = null


    fun push(item: T) {
        if (length ==0) {
            head = StackNode(item, null)
            length = 1
        } else {
            val node = StackNode(item, null)
            node.prev = head
            head = node
            length += 1
        }

    }

    fun pop(): T? {
        if (length == 0) return null
        else {
            length -= 1
            val popValue =  head?.value
            head = head?.prev
            return popValue
        }
    }

    fun peek(): T? {
        return head?.value
    }
}

data class StackNode<T> (
        val value: T,
        var prev: StackNode<T>?
)