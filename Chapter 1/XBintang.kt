package challegechaper1

open class XBintang() {
    open fun x() {
            val n = 10

            for (i in 1..n) {
                for (j in 1..n) {
                    if (i == j || i + j == n + 1) {
                        print("*")
                    } else {
                        print(" ")
                    }
                }
                println()
            }
        }


    }


class Bentuk5 : XBintang() {
    override fun x() {
        super.x()
    }
}

fun main() {
    val xx = Bentuk5()
    xx.x()
}

