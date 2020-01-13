package app.example.algorithms.search

/**
 * Created by Sargis Khlopuzyan, on 1/13/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(1, 4, 8, 9, 20, 100, 123, 145)
    interpolationSearch(list, 20)
}

/**
 * Runtime complexity of interpolation search algorithm is Ο(log (log n))
 * */
fun interpolationSearch(list: IntArray, value: Int): Int? {
    var index = findWithInterpolationSearch(list, value, 0, list.size - 1)
    println("index: $index")
    return index
}

fun findWithInterpolationSearch(
    list: IntArray,
    value: Int,
    lowerBound: Int,
    upperBound: Int
): Int? {

    if (upperBound < lowerBound) {
        return null
    }

    val midPoint =
        lowerBound + (upperBound - lowerBound) * (value - list[lowerBound]) / (list[upperBound] - list[lowerBound])

    println("value: $value, lowerBound: $lowerBound, upperBound: $upperBound, midPoint: $midPoint")

    if (midPoint < lowerBound || midPoint > upperBound) {
        return null
    }

    if (list[midPoint] < value) {
        return findWithInterpolationSearch(list, value, midPoint + 1, upperBound)
    }

    if (list[midPoint] > value) {
        return findWithInterpolationSearch(list, value, lowerBound, midPoint - 1)
    }

    if (list[midPoint] == value) {
        return midPoint
    }

    return null
}