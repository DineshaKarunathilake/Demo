package com.example.demo

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MinHeapTest {

    @Test
    fun `test insert`() {
        val minHeap = MinHeap()

        minHeap.insert(50)
        Assertions.assertThat(minHeap.length).isEqualTo(1)
        Assertions.assertThat(minHeap.heap[0]).isEqualTo(50)

        minHeap.insert(71)
        Assertions.assertThat(minHeap.length).isEqualTo(2)
        Assertions.assertThat(minHeap.heap[0]).isEqualTo(50)
        Assertions.assertThat(minHeap.heap[1]).isEqualTo(71)



        minHeap.insert(100)
        minHeap.insert(101)
        minHeap.insert(80)
        minHeap.insert(200)
        minHeap.insert(105)

        Assertions.assertThat(minHeap.length).isEqualTo(7)
        Assertions.assertThat(minHeap.heap[0]).isEqualTo(50)
        Assertions.assertThat(minHeap.heap[1]).isEqualTo(71)
        Assertions.assertThat(minHeap.heap[6]).isEqualTo(105)

        minHeap.insert(3)

        Assertions.assertThat(minHeap.length).isEqualTo(8)
        Assertions.assertThat(minHeap.heap[0]).isEqualTo(3)
        Assertions.assertThat(minHeap.heap[1]).isEqualTo(50)
        Assertions.assertThat(minHeap.heap[7]).isEqualTo(101)

        minHeap.delete()
        Assertions.assertThat(minHeap.length).isEqualTo(7)
        Assertions.assertThat(minHeap.heap[0]).isEqualTo(50)
        Assertions.assertThat(minHeap.heap[1]).isEqualTo(71)
        Assertions.assertThat(minHeap.heap[6]).isEqualTo(105)

    }

}