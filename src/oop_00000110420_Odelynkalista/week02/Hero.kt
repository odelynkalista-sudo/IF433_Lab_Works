package oop_00000110420_Odelynkalista.week02
import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean = hp > 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val nameInput = scanner.nextLine()
    print("Masukkan Stat Damage: ")
    val damageInput = scanner.nextInt()

    val myHero = Hero(nameInput, damageInput)
    var enemyHp = 100
    val enemyName = "Wild Goblin"

    println("\nBattle Start! ${myHero.name} vs $enemyName")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- STATUS ---")
        println("${myHero.name} HP: ${myHero.hp} | $enemyName HP: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")

        when (scanner.nextInt()) {
            1 -> {
                myHero.attack(enemyName)
                enemyHp -= myHero.baseDamage
                println("$enemyName kehilangan ${myHero.baseDamage} HP!")

                if (enemyHp > 0) {
                    val randomDamage = (10..20).random()
                    println("$enemyName menyerang balik!")
                    myHero.takeDamage(randomDamage)
                    println("${myHero.name} menerima $randomDamage damage!")
                }
            }
            2 -> {
                println("${myHero.name} memilih untuk kabur! Pertarungan berakhir.")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    // 4. Pengumuman Pemenang
    println("\n=== HASIL AKHIR ===")
    if (enemyHp <= 0) {
        println("Kemenangan untuk ${myHero.name}! $enemyName telah dikalahkan.")
    } else if (!myHero.isAlive()) {
        println("${myHero.name} gugur di medan perang. GAME OVER.")
    } else {
        println("Pertarungan tidak diselesaikan.")
    }
}