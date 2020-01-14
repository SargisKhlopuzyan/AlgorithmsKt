package app.example.algorithms.sort

/**
 * Created by Sargis Khlopuzyan, on 1/14/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(0, 1, 45, 4, 8, 1, 9, 20, 100, 2, 123, 200, 41, 145)

    bubbleSort(list, 0, list.size - 1)

    println("list: ${list.toList()}")
}

/**
 * Runtime complexity of bubble sort algorithm is Ο(n2)
 */
fun bubbleSort(list: IntArray, fromIndex: Int, toIndex: Int) {
    for (i in toIndex downTo fromIndex) {

        var isSorted = true

        for (j in fromIndex until i) {
            if (list[j] > list[j + 1]) {
                isSorted = false
                swap(list, j, j + 1)
            }
        }

        if (isSorted) {
            println("isSorted: $isSorted")
            break
        }
    }
}

fun swap(list: IntArray, fromIndex: Int, toIndex: Int) {
    val temp = list[fromIndex]
    list[fromIndex] = list[toIndex]
    list[toIndex] = temp
}