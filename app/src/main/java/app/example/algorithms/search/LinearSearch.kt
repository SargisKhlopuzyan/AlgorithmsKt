package app.example.algorithms.search

import app.example.algorithms.Person

/**
 * Created by Sargis Khlopuzyan, on 1/13/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    val list = listOf(
        Person("John", "Smith", 30),
        Person("Michael", "Jackson", 70),
        Person("Annabelle", "Wallis", 35),
        Person("Tom", "Jones", 80),
        Person("Tom", "Hardy", 55),
        Person("Charlotte", "Riley", 48),
        Person("Tom", "Cruise", 60)
    )

    var index = linearSearch(list, Person("Charlotte", "Riley", 48))
    println("index: $index")
}

/**
 * Run-time complexity of Ο(n)
 * */
private fun linearSearch(list: List<Person>, value: Person): Int {
    for ((index, item) in list.withIndex()) {
        if (item == value) {
            return index
        }
    }
    return -1
}