fun main(){
hitungScore()
}

fun hitungScore() {
    println("Hitung Nilai Score Mahasiswa")
    println("Masukan Score : ")
    val inputScore: Int = readLine()!!.toInt()

    if (inputScore > 50 && inputScore < 100) {
        println("Lulus")
    } else if (inputScore <= 50 && inputScore > 0) {
        println("Tidak Lulus")
    } else {
        (inputScore < 100 && inputScore > 0)
        println("Nilai Tidak Valid")
    }


//nested if
    val nilai1 = 23
    val nilai2: Int = 45
    val nilai3: Int = 67

    if (nilai1 > nilai2) {
        val maxN = if (nilai1 > nilai3){
            nilai1
        }
    }

}