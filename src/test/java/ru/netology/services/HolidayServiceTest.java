package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolidayServiceTest {
    @Test
    void calculate() {
        HolidayService service = new HolidayService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;
        assertEquals(expected, actual);
        actual = service.calculate(100_000, 60_000, 150_000);
        expected = 2;
        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {

    }
}