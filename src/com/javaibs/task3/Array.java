package com.javaibs.task3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int temp;
        int sum;
        int[] array = {1, 2, 3, 4, 5};
        temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        sum = array[0] + array[(array.length - 1) / 2];
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}
