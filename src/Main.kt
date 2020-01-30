import java.util.*

fun main() {
    //init scanner
    val scanner = Scanner(System.`in`)

    val nama = "Obet"
    var kelas = "01"
    print("Nama Saya $nama \n")
    print("Saya kelas $kelas")
    println()
    for (i in 0 until (nama.length)) {
        print(nama[i])
    }

    var newNama = nama.replace("e", "o")
    print("\n Nama Baru $newNama")
    println()
    var removeNama = nama.removeRange(0,4)
    print(removeNama)

    //integer
    var angka1 = 200
    println()
    print("Masukan Angka 1 \t: ")
    angka1 = scanner.nextInt()
    println()
    print("Angka 1 adalah $angka1")

    println()
    println("hasil bagi ${10/5}")
    println("hasil kali 10*5")

    val bool = true
    val bool1 = false
    val newBool = 5 < 6
    println(bool && bool1)
    println(bool || bool1)
    if (bool)
        println("true")
    else if (bool1)
        println("false")

    //array
    var arrayNumber = arrayOf(1,2,3,4,5,6,7,8)
    arrayNumber.forEach {
    print(it)
    }
    println()
    for (i in arrayNumber.indices){
        print(arrayNumber[i])
    }
    println()
    for (i in 0 until arrayNumber.size){
        print(arrayNumber[i])
    }
    println()
    var arrayString = arrayOf("Obet","Cuy")
    arrayString.forEachIndexed { index, s->
        println("Index ke $index adalah $s")}

    var listNumber = listOf(1,2,3,4,5,6)
    listNumber.forEach {
        print(it)
    }
    println()
    for (i in 0 until listNumber.size){
        print(listNumber[i])
    }

    //Mutablelist
    var listName = mutableListOf<String>()
    listName.add("Obet")
    listName.add("Obet")
    listName.add("Obet")
    listName.add("Obet")
    listName.add("Obet")
    listName.add(2,"Obet")

    if(listName.isEmpty()) {
        println("Kosong")
    }else{
        listName.forEach {
            println(it)
        }

    }

}