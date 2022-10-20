package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/squarerange.csv")
    public void numberOfSquaresInTheRange(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();

        int actual = service.squareRange(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}