package com.javaibs.task14;

import java.util.Arrays;
import java.util.Random;

public class DataWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(-20, 20);
        }
        System.out.println(Arrays.toString(array));
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        if (Math.abs(min) > Math.abs(max)){
            System.out.println(Math.abs(min));
        }
        else System.out.println(Math.abs(max));
    }
}
