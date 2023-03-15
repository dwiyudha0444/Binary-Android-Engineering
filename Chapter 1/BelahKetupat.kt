package challegechaper1

open class BelahKetupat() {
    open fun Kotak() {

        val n = 5

        for (i in 1..n) {
            for (j in 1..n-i) {
                print(" ")
            }
            for (j in 1..2*i-1) {
                print("*")
            }
            println()
        }

        for (i in n-1 downTo 1) {
            for (j in 1..n-i) {
                print(" ")
            }
            for (j in 1..2*i-1) {
                print("*")
            }
            println()
        }
    }
}


class Bentuk4 : BelahKetupat() {
    override fun Kotak() {
        super.Kotak()
    }
}

fun main() {
    val tiga = Bentuk4()
    tiga.Kotak()
}
