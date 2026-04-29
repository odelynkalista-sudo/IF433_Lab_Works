package oop_00000110420_Odelynkalista.week07

fun main() {
    println("=== TESTING SINGLETON ===")
    println("Statis: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS === ")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("\n=== TASK: TEST SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TASK: TEST FACTORY & ENUM ===")
    println("Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val myWeapon = Weapon.forgeStarterSword()
    println("Senjata Baru: ${myWeapon.item.name} | Damage: ${myWeapon.item.damage} | Durability: ${myWeapon.durability}")

    println("\n=== TASK: TEST COPY & EVENT DISPATCH ===")
    val upgradedItem = myWeapon.item.copy(damage = 25, name = "Pedang Kayu Legendaris")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}