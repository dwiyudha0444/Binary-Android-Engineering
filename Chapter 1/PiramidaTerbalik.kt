package challegechaper1

open class PiramidaTerbalik() {
    open fun Segitiga() {
        val rows = 8
        var k = 0
        for (i in rows downTo 1) {
            for (j in 1..k) {
                print(" ")
            }
            for (j in 1..i) {
                print("* ")
            }
            println()
            k++
        }
    }

}



class Bentuk3 : PiramidaTerbalik() {
    override fun Segitiga() {
        super.Segitiga()
    }
}

fun main() {
    val tiga = Bentuk3()
    tiga.Segitiga()
}

