package com.example.demo

class Search {

    fun binarySearch(haystack: IntArray, needle: Int): Int {

        var lo = 0
        var high = haystack.size

        do {
            val midPoint = lo + (high-lo)/2
            if (haystack[midPoint] == needle) return midPoint
            else if (needle < haystack[midPoint]) {
                high = midPoint
            } else {
                lo= midPoint+1
            }
        } while (lo < high)

        return -1
    }
}