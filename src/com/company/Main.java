package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.3, 5.5, -9.5, 8.6, 5.5, 6.8};
        boolean firstNegetivNumber = false;
        double sum = 0;
        double count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) { firstNegetivNumber = true;
            }
            if (firstNegetivNumber && (numbers[i] > 0)) {
                count++;
                sum = sum + numbers[i];
            }
        } System.out.println( sum / count);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));



    }

}











