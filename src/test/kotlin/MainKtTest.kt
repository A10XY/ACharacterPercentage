import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_Return50point0_When_Ais1andBis1() {
        // Given
        val list = listOf('a', 'b')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(50.0, result)
    }

    @Test
    fun should_Return66point7_When_Ais2andBis1() {
        // Given
        val list = listOf('a', 'a', 'b')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(66.7, result)
    }

    @Test
    fun should_Return33point3_When_Ais1andBis2() {
        // Given
        val list = listOf('a', 'b', 'b')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(33.3, result)
    }

    @Test
    fun should_ReturnMinus1_When_AnotherCharInsteadofAorBisSupplied() {
        // Given
        val list = listOf('a', 'b', 'c')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_NoAisSuppliedButBisSupplied() {
        // Given
        val list = listOf('b', 'b', 'b')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_Return100_When_AisSuppliedButNoBisSupplied() {
        // Given
        val list = listOf('a', 'a')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(100.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_NoBandAareSupplied() {
        // Given
        val list = listOf('c', 'e')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_AisCapital() {
        // Given
        val list = listOf('A', 'b')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_BisCapital() {
        // Given
        val list = listOf('a', 'B')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_BandAareCapital() {
        // Given
        val list = listOf('A', 'B')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_NumberIsSupplied() {
        // Given
        val list = listOf('a', 'b', '1')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }

    @Test
    fun should_ReturnMinus1_When_SymbolIsSupplied() {
        // Given
        val list = listOf('a', 'b', '$')
        // When
        val result = aCharacterPercentage(list)
        // Return
        assertEquals(-1.0, result)
    }
}