package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/BonusData.csv", numLinesToSkip = 1)
    void shouldCalculateAmountForBonus(int amount, int expected, String message) {

        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual, message);
    }

    @Test
    void NothingBought() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            service.remain(amount);
        });
    }
}