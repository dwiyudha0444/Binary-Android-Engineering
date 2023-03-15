package challegechaper1


open class PlusBintang() {
    open fun Plus() {
        val n = 8

        for (i in 1..n) {
            for (j in 1..n) {
                if (i == n/2 + 1 || j == n/2 + 1) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}

class Bentuk6 : PlusBintang() {
    override fun Plus() {
        super.Plus()
    }
}

fun main() {
    val tiga = Bentuk6()
    tiga.Plus()
}

