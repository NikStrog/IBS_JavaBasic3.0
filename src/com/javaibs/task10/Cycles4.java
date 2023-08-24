package com.javaibs.task10;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int row = console.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int column = console.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Заполните массив: ");
        int a = 1;
        for (int i = 0; i < row; i++) {
            System.out.println("Заполните " + a + " строку:");
            a++;
            for (int j = 0; j < column; j++) {
                array[i][j] = console.nextInt();
            }
        }
        for (int j = 0; j < column; j++) {
            array[0][j] *= 3;
        }
        for (int j = 0; j < column; j++) {
            System.out.print(array[0][j] + " ");
        }
    }
}
