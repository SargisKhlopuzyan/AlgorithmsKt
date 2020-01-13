package app.example.algorithms.search

/**
 * Created by Sargis Khlopuzyan, on 1/13/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(1, 4, 8, 9, 20, 100, 123, 145)
    binarySearch(list, 8)
}
/**
 * Runtime complexity of binary search algorithm is Ο(log n)
 * */
fun binarySearch(list: IntArray, value: Int): Int? {
    var index = findBinarySearch(list, value, 0, list.size - 1)
    println("index: $index")
    return index
}

fun findBinarySearch(
    list: IntArray,
    value: Int,
    lowerBound: Int,
    upperBound: Int
): Int? {

    if (upperBound < lowerBound) {
        return null
    }

    val midPoint = lowerBound + (upperBound - lowerBound) / 2

    if (list[midPoint] < value) {
        return findBinarySearch(list, value, midPoint + 1, upperBound)
    }

    if (list[midPoint] > value) {
        return findBinarySearch(list, value, lowerBound, midPoint - 1)
    }

    if (list[midPoint] == value) {
        return midPoint
    }

    return null
}