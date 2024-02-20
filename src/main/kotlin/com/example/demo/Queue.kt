package com.example.demo

class Queue<T> {
    public var length: Int = 0
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun enqueue(item: T) {
        if (length ==0) {
            head = Node(item, null)
            length = 1
        } else if (length == 1) {
            tail = Node(item, null)
            head?.next = tail
            length += 1
        } else {
            val node = Node(item, null)
            tail?.next = node
            length += 1
        }

    }

    fun dequeue(): T? {
        if (length == 0) return null
        else {
            length -= 1
            head = head?.next
            return head?.value
        }
    }

    fun peek(): T? {
        return head?.value
    }
}

data class Node<T> (
        val value: T,
        var next: Node<T>?
)