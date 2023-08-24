package com.javaibs.task7;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles1 {

    public static final int X = 10;
    public static final int Y = 20;
    public static final int Z = 30;
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == X || array[i] == Y || array[i] == Z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
