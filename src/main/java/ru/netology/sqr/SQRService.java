package ru.netology.sqr;

public class SQRService {
    public int squareRange(int lowerNumber, int upperNumber, int lowerLimit, int upperLimit) {
        int iteration = 0;
        for (int i = lowerNumber; i <= upperNumber; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    iteration++;
                }
            }
        }
        return iteration;
    }
}
