package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
//	val search = Search()
//	println(search.binarySearch( listOf(1,2,3,4,5).toIntArray(), 5))
	//sort
//	val sort = Sort()
//	val array = listOf(10,2,5,4,1).toIntArray()
//	sort.bubbleSort(array)
//	array.forEach { println("$it") }

	//queue
//	val queue = Queue<Int>()
//	queue.enqueue(100)
//	queue.enqueue(50)
//	println(queue.peek())
//	println(queue.length)
//	queue.dequeue()
//	println(queue.peek())
//	queue.dequeue()
//	println(queue.length)



//	println(binarySearch(5, listOf(1,2,3,4,5).toIntArray(), 0, 4))
//	runApplication<DemoApplication>(*args)
//	val out = plusOne(intArrayOf(9,9))
//	out.iterator().forEach { println(it) }
}

fun binarySearch(search: Int, sortedArray: IntArray, start: Int, end: Int): Int {

	val size = sortedArray.size
	val midIndex = (start+end)/2
	val midpoint = sortedArray[midIndex]

	if( search == midpoint) return midIndex
	else if (search < midpoint) return binarySearch(search, sortedArray, 0, midpoint)
	else return binarySearch(search, sortedArray, midpoint, end)
}



fun plusOne(digits: IntArray): IntArray {
//check for 99

	val size = digits.size
	return lastDigit(digits, size-1)


}

private fun lastDigit(digits: IntArray, index: Int): IntArray {
	if (index == 0 && digits[0] == 9 && digits.size > 1) {
		return intArrayOf(1)+ intArrayOf(0) + digits.copyOfRange(1, digits.size-1)
	} else if (index == 0 && digits[0] == 9 && digits.size == 1) {
		return intArrayOf(1, 0)
	}
	if (digits[index] != 9) {
		digits[index] = digits[index] + 1
		return digits
	}
	else {
		return lastDigit(digits, index-1)
	}
}


