package com.topJava.sort;

public class BubbleSorting {

    public int[] sort(int[] numbers) {

        if (numbers == null)
            return numbers;

        boolean numberSwitched;

        do {
            numberSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    int aux = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = aux;
                    numberSwitched = true;
                }
            }
        } while (numberSwitched);

        return numbers;
    }


}
