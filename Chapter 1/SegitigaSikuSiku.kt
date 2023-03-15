package challegechaper1

open class SegitigaSikuSiku(private val bintang: Int =8) {
    open fun Segitiga() {
        for (i in 1..this.bintang) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}

class Bentuk2 : SegitigaSikuSiku() {
    override fun Segitiga() {
        super.Segitiga()
    }
}

fun main() {
    val tiga = Bentuk2()
    tiga.Segitiga()
}