package challegechaper1

open class Piramida() {
    open fun Segitiga() {
        val rows = 8
        var k = 0

        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("*")
                ++k
            }

            println()
            k = 0
        }
    }
}

class Bentuk : Piramida() {
    override fun Segitiga() {
        super.Segitiga()
    }
}

fun main() {
    val tiga = Bentuk()
    tiga.Segitiga()
}

