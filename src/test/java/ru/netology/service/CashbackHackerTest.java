package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {

    @Test
    void shouldReturn100IfAmountIs900() {

        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;

        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {

        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;

        int actual = cashbackHacker.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn900IfAmountIs2100() {

        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 2100;

        int actual = cashbackHacker.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }
}