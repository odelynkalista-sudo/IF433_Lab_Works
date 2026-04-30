package oop_00000110420_Odelynkalista.week08

import java.net.IDN

object DatabaseMock {
    fun findUser(idn: Int): UserProfile? {
        return if (idn == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTests() {
    println("\n=== RUNNING UNIT TESTS ===")
    val testUser = DatabaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "Test failed! Initial is wrong."}
    println("Test Passed: Initial is T")

}