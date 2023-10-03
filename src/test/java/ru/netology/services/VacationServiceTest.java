package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")

    public void testHowMuchVacation(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();

        int actual = service.calcBonus(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }

}

