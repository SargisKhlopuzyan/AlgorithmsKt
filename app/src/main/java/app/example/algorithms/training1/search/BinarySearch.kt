package app.example.algorithms.training1.search

/**
 * Created by Sargis Khlopuzyan, on 3/10/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(1, 4, 8, 9, 20, 100, 123, 145)
    val index = binarySearch(
        array = list,
        value = 800
    )
    println("index: $index")
}

fun binarySearch(
    array: IntArray,
    startIndex: Int = 0,
    endIndex: Int = array.size - 1,
    value: Int
): Int {

    if (endIndex < startIndex) {
        return -1
    }

    val index = (endIndex + startIndex) / 2

    if (array[index] == value) {
        return index
    } else if (array[index] > value) {
        return binarySearch(
            array = array,
            startIndex = startIndex,
            endIndex = index - 1,
            value = value
        )
    } else {
        return binarySearch(
            array = array,
            startIndex = index + 1,
            endIndex = endIndex,
            value = value
        )
    }
}