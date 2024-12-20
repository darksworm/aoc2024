package ijb.adventofcode.day4

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.*

class TestPartOne {

    @Test
    fun `can count horizontal XMAS's`() {
        val input = "asdfXMASxxasdfa"
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `doesn't crash if xmas is at end`() {
        val input = "asdfXMAS"
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count reversed horizontal XMAS's`() {
        val input = "asdfSAMXxxasdfa"
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `doesnt crash if xmas is at beginning`() {
        val input = "SAMXxxasdfa"
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count vertical XMAS's`() {
        val input = """
            X
            M
            A
            S
        """.trimIndent()
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count reversed vertical XMAS's`() {
        val input = """
            S
            A
            M
            X
        """.trimIndent().reversed()
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count diagonal XMAS's LR TB`() {
        val input = """
            XPPP
            PMPP
            PPAP
            PPPS
        """.trimIndent()
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count diagonal XMAS's LR BT`() {
        val input = """
            SPPP
            PAPP
            PPMP
            PPPX
        """.trimIndent()
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count diagonal XMAS's RL TB`() {
        val input = """
            PPPX
            PPMP
            PAPP
            SPPP
        """.trimIndent()
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can count diagonal XMAS's RL BT`() {
        val input = """
            PPPS
            PPAP
            PMPP
            XPPP
        """.trimIndent()
        expectThat(partOne(input)).isEqualTo(1)
    }

    @Test
    fun `can share letters`() {
        expectThat(partOne("XMASAMX")).isEqualTo(2)
    }

    @Test
    fun `can count provided example`() {
        val input = """
            MMMSXXMASM
            MSAMXMSMSA
            AMXSXMAAMM
            MSAMASMSMX
            XMASAMXAMM
            XXAMMXXAMA
            SMSMSASXSS
            SAXAMASAAA
            MAMMMXMMMM
            MXMXAXMASX
        """.trimIndent()

        expectThat(partOne(input)).isEqualTo(18)
    }

    @Test
    fun `vertical stuffs can share letters`() {
        val input = """
            X
            M
            A
            S
            A
            M
            X
        """.trimIndent()
        expectThat(partOne(input)).isEqualTo(2)
    }
}
