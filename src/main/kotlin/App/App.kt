fun main() {
//  Inisialisasi pilihan
    val pilihan = arrayOf("gunting", "batu", "kertas")

//  Masukkan nama player
    println("Selamat datang!")
    println("Siapa nama kamu?")
    var playerName = readLine()
    println("Hai... $playerName")
    println(
        """
            ====================================
            MARI MAIN GAME SUIT TERMINAL VERSION
            ====================================
            """.trimIndent()
    )

//  Menangkap pilihan player1
    println("Pilihan (Gunting, Batu, Kertas)")
    print("1. Masukkan pemain 1: ")

    var player1 = readLine()

//  Membuat pilihan random untuk player2
    print("2. Masukkan pemain 2: ")
    var player2 = readLine()

    var status = false

//  Menentukan peraturan
    if (player2 != null) {
        if (player1!!.toLowerCase().equals(player2.toLowerCase())) {
            println("Hasil:")
            println("SERI $player2 dengan $player1")
        } else if (player1.toLowerCase().equals("batu")) {
            if (player2 != null) {
                if (player2.toLowerCase().equals("gunting")) {
                    status = true
                    hasil(status, player1, player2)
                } else {
                    status = false
                    hasil(status, player1, player2)
                }
            }
        } else if (player1.toLowerCase().equals("gunting")) {
            if (player2 != null) {
                if (player2.toLowerCase().equals("kertas")) {
                    status = true
                    hasil(status, player1, player2)
                } else {
                    status = false
                    hasil(status, player1, player2)
                }
            }
        } else if (player1.toLowerCase().equals("kertas")) {
            if (player2 != null) {
                if (player2.toLowerCase().equals("batu")) {
                    status = true
                    hasil(status, player1, player2)
                } else {
                    status = false
                    hasil(status, player1, player2)
                }
            }
        }
    }
}

fun hasil(status: Boolean, p1: String, p2: String?) {
    if (status) {
        println("Hasil:")
        println("Pemain 1 MENANG! $p1 mengalahkan $p2")
    } else {
        println("Hasil:")
        println("Pemain 2 KALAH! $p2 mengalahkan $p1")

    }
}