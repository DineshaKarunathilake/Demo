package com.example.demo

class Sort {
    fun bubbleSort(array: IntArray) {
        val size = array.size
        for (i in 0..<size) {
            for (j in 0..< size-1-i) {
                if (array[j] > array[j+1]) {
                 val temp = array[j]
                 array[j] = array[j+1]
                 array[j+1] = temp
                }
            }
        }
    }

    fun quickSort(array: IntArray, lo: Int, hi: Int) {

        if (lo >= hi) {
            return
        }
        val pivotIdx = partition(array, lo, hi)
        partition(array, lo, pivotIdx-1 )
        partition(array, pivotIdx+1, hi )
    }

    private fun partition(array: IntArray, lo: Int, hi: Int): Int {
        val pivot = array[hi]

        var idx = lo-1

        for(i in lo..<hi) {
            if (array[i] <= pivot) {
                idx += 1
                val tmp = array[i]
                array[i] = array[idx];
                array[idx] = tmp
            }
        }
        idx += 1
        array[hi] = array[idx]
        array[idx] = pivot

        return idx
    }
}