package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {

    @Test
    void shouldReturn3ForExample1() {
        VacationService service = new VacationService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn2ForExample2() {
        VacationService service = new VacationService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        assertEquals(expected, actual);
    }
}

