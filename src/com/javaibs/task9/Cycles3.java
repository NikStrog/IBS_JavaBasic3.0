package com.javaibs.task9;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        double[] array = new double[size];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        double value = sum / (double)size;
        for (int i = 0; i < size; i++) {
            array[i] *= value;
        }
        System.out.println(Arrays.toString(array));
    }
}
