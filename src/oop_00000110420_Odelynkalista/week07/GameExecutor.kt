package oop_00000110420_Odelynkalista.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Awas! Muncul monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            // Destructuring untuk mengambil properti dari GameItem
            val (itemName, itemDamage, itemRarity) = event.item
            println("Selamat! Kamu dapat loot: $itemName [Damage: $itemDamage, Rarity: $itemRarity]")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di area aman. Silakan beristirahat.")
        }
    }
}