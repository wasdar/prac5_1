package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/vacation_data.csv", numLinesToSkip = 1)
    void shouldCalculateVacationMonths(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}


