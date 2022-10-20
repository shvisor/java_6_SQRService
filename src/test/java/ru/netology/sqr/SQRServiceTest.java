package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/squarerange.csv")
    void numberOfSquaresInTheRange() {
        SQRService service = new SQRService();

        int lowerNumber = 10;
        int upperNumber = 99;
        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

        int actual = service.squareRange(lowerNumber, upperNumber, lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}
