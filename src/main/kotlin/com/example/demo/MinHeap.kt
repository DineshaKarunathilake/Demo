package com.example.demo

class MinHeap {

    var length: Int = 0
    var heap = IntArray(1000)


    fun insert(value: Int) {
            heap[length] = value
        heapifyUp(length)
        length += 1
    }

    fun delete(): Int {

        if (length == 0) return -1

        val out = heap[0]
        if (length == 1) {
            heap = IntArray(1000)
            length = 0
            return out
        }

        length -= 1

        heap[0] = heap[length-1]
        heapifyDown(0)
        return out
    }

    private fun heapifyUp(index: Int) {

        if (index ==0 ) return

        val parentIndex = parent(index)
        val parentValue = heap[parentIndex]
        val currentValue = heap[index]
        if ( parentValue > currentValue ) {
            heap[index] = parentValue
            heap[parentIndex] = currentValue
            heapifyUp(parent(index))
        }
    }

    private fun heapifyDown(index: Int) {

        if (index >= length) return

        val currentValue = heap[index]

        val leftChildIndex = leftChild(index)
        val leftChildValue = heap[leftChildIndex]

        val rightChildIndex = rightChild(index)
        val rightChildValue = heap[rightChildIndex]

        if (leftChildIndex >= length) return

        val max = maxOf(leftChildValue, rightChildValue)

        if (rightChildValue> leftChildValue &&  currentValue > leftChildValue) {
            heap[leftChildIndex] = currentValue
            heap[index] = leftChildValue
            heapifyDown(leftChildIndex)
        }

        if (leftChildValue> rightChildValue &&  currentValue > rightChildValue) {
            heap[rightChildIndex] = currentValue
            heap[index] = rightChildValue
            heapifyDown(rightChildIndex)
        }
    }

    private fun parent(index: Int): Int {
//        if (index == 0) return null
        return (index - 1)/2
    }

    private fun leftChild(index: Int): Int {
        return 2*index + 1
    }

    private fun rightChild(index: Int): Int {
        return 2*index + 2
    }
}