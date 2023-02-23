import javax.swing.event.DocumentEvent

fun main(){

    //Nomer 1
    val nama : String
    nama = "John Doe"

    //Nomer 2
    val umur : Int
    umur = 25

    //Nomer 3
    val gaji : Double
    gaji = 5000.0

    //Nomer 4
    val status : Boolean
    status = true

    //nomer 5
    val nilai : Float
    nilai = 7.5f

    //nomer 6
    val angka1 : Long
    angka1 =123456789L

    //nomer 7
    val angka2 : Short
    angka2 = 100

    //nomer 8
    val huruf : Char
    huruf = 'A'

    //nomer 9
    val nilaiString : String
    nilaiString = "10"

    //nomer 10
    val angka3 : Byte
    angka3 = 25

    //nomer 11
    val angkaArray = intArrayOf(1,2,3,4,5)

    //nomer 12
    val hurufArray = charArrayOf('a','b','c','d','e')

    //nomer 13
    val nilaiArray  = doubleArrayOf(3.5,4.0,2.5,3.0)

    //nomer 14
    val namaArray = arrayOf("Jhon", "Doe", "Jane", "Doe")

    //nomer 15
    val bulanArray = Array(12){""}
    bulanArray[0]= "Januari"
    bulanArray[1]= "Februari"
    bulanArray[2]= "Maret"
    bulanArray[3]= "April"
    bulanArray[4]= "Mei"
    bulanArray[5]= "Juni"
    bulanArray[6]= "Juli"
    bulanArray[7]= "Agustus"
    bulanArray[8]= "September"
    bulanArray[9]= "Oktober"
    bulanArray[10]= "November"
    bulanArray[11]= "Desember"

    //nomer 16
    val nilaiFloatArray = floatArrayOf(2.5f,3.0f,2.0f)

    //nomer 17
    val angkaList = listOf<Int>(1,2,3,4,5)

    //nomer 18
    val hurufList = listOf<Char>('a','b','c','d','e')

    //nomer 19
    val nilaiList = listOf<Double>(3.5,4.0,2.5,3.0)

    //nomer 20
    val namaList = listOf<String>("Jhon","Doe","Jane","Doe")

    //nomer 21
    val bulanList = listOf<String>("Januari", "Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

    //nomer 22
    val floatList = listOf<Float>(2.5f, 3.0f, 2.0f)

    //nomer 23
    val angkaList2 = mutableListOf<Int>(1,2,3,4,5)
    angkaList2[4] = 10

    //nomer 24
    val hurufList2 = mutableListOf<Char>('a', 'b', 'c', 'd', 'e')
    hurufList2[0] = 'f'

    //nomer 25
    val nilaiList2 = mutableListOf<Double>(3.5, 4.0, 2.5, 3.0)
    nilaiList2.add(5.0)

    //nomer 26
    val namaList2 = mutableListOf<String>("John", "Doe", "Jane", "Doe")
    namaList2.remove("Jhon")

    //nomer 27
    val bulanList2 = mutableListOf<String>("Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
    val bulanBaruList = bulanList2.sorted()
    bulanBaruList.add("Januari")

}
