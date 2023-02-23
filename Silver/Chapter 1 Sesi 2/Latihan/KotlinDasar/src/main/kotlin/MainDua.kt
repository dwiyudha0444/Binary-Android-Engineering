fun main(){
    val nama : String
    nama = "Yudha"
    println(nama)
    val namaDua : String = "Dwi"
    println(namaDua)
    var namaTiga : String = "Saputra"
    println(namaTiga)

    val a : Byte = 123
    val b : Short = 32767
    val c : Int = 12
    val d : Long = 62145164
    val e : Float = 3.14f
    val f : Double = 3.14
    val g : Char ='E'

    var firstName = "Dwi Yudha"
    var lastName : String = "Saputra"
    println("Nama Mahasiswa : " + firstName + lastName)
    println("Nama Mahasiswa : $firstName $lastName ")

    // ARRAY
    val namaStudent = Array(3){""}
    namaStudent[0] = "Dwi"
    namaStudent[1] = "Yudha"
    namaStudent[2] = "Saputra"
    println("Daftar Mahasiswa : " + namaStudent.contentToString())
    println("Nama Mahasiswa : ${namaStudent[1]}")

    val umurStudent = arrayOf(21,20,19)
    val statusStudent = booleanArrayOf(true, false, true,false,false)
    val umurStudent2 = intArrayOf(21,20,22)
    umurStudent2[1] = 19
    println(umurStudent2[1])
    val umurStudent3 = intArrayOf(12,12,34)

    //LIST
    val buah = mutableListOf("apel","jeruk","anggur","durian")
    buah.add("salak")
    buah.remove("apel")
    println(buah.sorted())
    val aa = buah.sortedDescending()
    println(aa)
    println(buah.size)
    println(buah)

    val letter = listOf('A','B','C','D')
}