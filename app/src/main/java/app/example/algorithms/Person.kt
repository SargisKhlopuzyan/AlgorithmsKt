package app.example.algorithms

/**
 * Created by Sargis Khlopuzyan, on 1/13/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */
class Person constructor(
    var name: String? = null,
    var surname: String? = null,
    var age: Int? = null
) {

    override fun equals(other: Any?): Boolean {

        if (this === other) {
            return true
        }

        if (javaClass != other?.javaClass) {
            return false
        }

        other as Person

        if (name != other.name || surname != other.surname || age != other.age) {
            return false
        }

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + age.hashCode()
        return result
    }
}