package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelanceServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/FreelanceService.csv")
    public void shouldCalculateRest(int income, int expenses, int threshold) {
        FreelanceService service = new FreelanceService();

        System.out.println(service.calculate(income, expenses, threshold));
    }
}
