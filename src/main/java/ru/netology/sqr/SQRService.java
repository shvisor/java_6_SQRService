package ru.netology.sqr;

public class SQRService {
    public int squareRange(int lowerLimit, int upperLimit) {
        int iteration = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    iteration++;
                }
            }
        }
        return iteration;
    }
}
