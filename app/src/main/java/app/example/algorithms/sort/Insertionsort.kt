package app.example.algorithms.sort

/**
 * Created by Sargis Khlopuzyan, on 1/14/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val list = intArrayOf(0, 55, 1, 45, 4, 8, 1, 9, 20, 100, 2, 123, 200, 41, 145)

    insertionSort(list, 0, list.size - 1)

    println("list: ${list.toList()}")
}

fun insertionSort(list: IntArray, fromIndex: Int, toIndex: Int) {
    var selectedObject: Int

    for (i in (fromIndex + 1)..toIndex) {
//        println("i: $i")

        selectedObject = list[i]

        var j = i

        while (j > fromIndex && list[j - 1] > selectedObject) {
            list[j] = list[j - 1]
            j--
        }
        list[j] = selectedObject
    }

}