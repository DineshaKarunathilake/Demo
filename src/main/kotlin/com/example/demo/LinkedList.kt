package com.example.demo

class LinkedList<T> {

    public var length: Int = 0
    private var head: LinkedListNode<T>? = null

    fun prepend(item: T) {

        val node = LinkedListNode(item)
        if (head != null) {
            node.next = head
            head?.prev = node
            head = node
            length += 1
        } else {
            head = node
            length += 1
        }
    }

    fun insertAt(item: T, index: Int) {
        val nodeToAdd = LinkedListNode(item)

        var prevNode: LinkedListNode<T>? = head
        for (i in 1..<index) {
            prevNode = prevNode?.next
        }

        val nextNode = prevNode?.next

        prevNode?.next = nodeToAdd

        nodeToAdd.next = nextNode
        nodeToAdd.prev = prevNode

        nextNode?.prev = nodeToAdd

        length += 1

    }

    fun append(item: T) {

        if (length == 0) {
            head = LinkedListNode(item)
            length = 1
            return
        }

        var lastNode: LinkedListNode<T>? = head
        for (i in 1..<length) {
            lastNode = lastNode?.next
        }

        lastNode?.next = LinkedListNode(item, null, lastNode)
         length += 1

    }

    fun remove(item: T) {

    }

    fun removeAt(item: T, index: Int) {

        var prevNode: LinkedListNode<T>? = head
        for (i in 1..<index) {
            prevNode = prevNode?.next
        }

        val nodeToRemove = prevNode?.next
        val nextNode = nodeToRemove?.next

        prevNode?.next = nextNode
        nextNode?.prev = prevNode

        length -= 1

    }

    fun get(index: Int): T? {

        if (head == null) return null
        if (length < index+1) return null


        var node = head
        for (i in 1..index ) {
            node = node?.next
        }

        return node?.value

    }
}

data class LinkedListNode<T> (
        val value: T,
        var next: LinkedListNode<T>? = null,
        var prev: LinkedListNode<T>? = null
)