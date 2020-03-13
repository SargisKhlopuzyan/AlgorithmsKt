package app.example.algorithms.training1.sort

/**
 * Created by Sargis Khlopuzyan, on 3/13/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(0, 1, 45, 4, 8, 1, 9, 20, 100, 2, 123, 200, 41, 145)

    bubbleSort(list, 0, list.size - 1)

    println("list: ${list.toList()}")
}

fun bubbleSort(array: IntArray, startIndex: Int, endIndex: Int) {

    for (i in endIndex downTo startIndex) {
        var isSorted = true
        for (j in startIndex until i) {
            if (array[j] > array[j + 1]) {
                swap(array, j, j + 1)
                isSorted = false
            }
        }

        if (isSorted) {
            return
        }
    }
}

fun swap(array: IntArray, position1: Int, position2: Int) {
    val temp = array[position1]
    array[position1] = array[position2]
    array[position2] = temp
}