package app.example.algorithms.training1.search

/**
 * Created by Sargis Khlopuzyan, on 3/12/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(1, 4, 8, 9, 20, 100, 123, 145)
    val index = interpolationSearch(
        array = list,
        value = 1450
    )
    println("index: $index")
}

fun interpolationSearch(
    array: IntArray,
    startIndex: Int = 0,
    endIndex: Int = array.size - 1,
    value: Int
): Int {

    if (endIndex < startIndex) {
        return -1
    }

    val midPoint =
        startIndex + (endIndex - startIndex) * (value - array[startIndex]) / (array[endIndex] - array[startIndex])

    if (midPoint < startIndex || midPoint > endIndex) {
        return -1
    }

    if (array[midPoint] == value) {
        return midPoint
    } else if (array[midPoint] > value) {
        return binarySearch(
            array = array,
            startIndex = startIndex,
            endIndex = midPoint - 1,
            value = value
        )
    } else {
        return binarySearch(
            array = array,
            startIndex = midPoint + 1,
            endIndex = endIndex,
            value = value
        )
    }
}