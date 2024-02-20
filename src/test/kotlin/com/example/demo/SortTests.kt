package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SortTests {


    @Test
    fun testQuickSort() {

        val sorter = Sort()

        val array = intArrayOf(6, 1,8,10, 4, 7)
        sorter.quickSort(array, 0, 5)

        assertThat(array[0]).isEqualTo(1)
        assertThat(array[1]).isEqualTo(4)
        assertThat(array[2]).isEqualTo(6)
        assertThat(array[3]).isEqualTo(7)
        assertThat(array[4]).isEqualTo(8)
        assertThat(array[5]).isEqualTo(10)
    }

}