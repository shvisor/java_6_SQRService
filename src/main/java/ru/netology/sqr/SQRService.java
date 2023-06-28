package ru.netology.sqr;

public class SQRService {
    /**
     * Перебираем числа от 10 до 99 и возводим их в квадрат проверяя сколько результатов уместится в заданный диапазон
     * @param lowerLimit нижняя граница диапазона
     * @param upperLimit верхняя граница диапазона
     * @return количество чисел, которые при возведении в квадрат умещаются в заданный диапазон
     */
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
