package com.example.demo

import java.util.LinkedList
import java.util.Stack

class Tree {

    fun traverse(head: BinaryNode<Int>): Stack<Int> {
        return walk(head, path = Stack())
    }
    private fun walk(current: BinaryNode<Int>?, path: Stack<Int>):Stack<Int> {

        if(current == null) return path

        walk(current.left, path)
        path.push(current.value)
        walk(current.right, path)

        return path
    }

    fun bfs(head: BinaryNode<Int>, needle: Int): Boolean {

        val queue = LinkedList<BinaryNode<Int>>()
        queue.addFirst(head)


        while (queue.size != null) {
            if (queue.isEmpty()) return false
            val current = queue.removeFirst()

            if (current.value == needle) return true

            if (current.left != null) {
                queue.addLast(current.left)
            }
            if (current.right != null) {
                queue.addLast(current.right)
            }
        }
        return false
    }

    fun compare( node: BinaryNode<Int>?, otherNode: BinaryNode<Int>?): Boolean {

        if(node ==null && otherNode == null) return true
        if(node == null || otherNode == null ) return false

        if (node.value != otherNode.value) return false

        return compare(node.left, otherNode.left) && compare(node.right, otherNode.right)
    }


    fun bstDfsFind(node: BinaryNode<Int>?, value: Int): Boolean {

        if (node == null) return false
        if (node.value == value) return true

        if (node.value < value) return bstDfsFind(node.right, value)
        else return bstDfsFind(node.left, value)
    }

    fun btInsert(node: BinaryNode<Int>?, value: Int) {

        if (node == null) return
        if (node.value < value)  {
            if (node.right == null) {
                node.right = BinaryNode(value)
            } else {
                btInsert(node.right, value)
            }
        }
        else {
            if (node.left == null) {
                node.left = BinaryNode(value)
            } else {
                btInsert(node.left, value)
            }
        }

    }

}

data class BinaryNode<T> (
        val value: T,
        var left: BinaryNode<T>? = null,
        var right: BinaryNode<T>? = null
)