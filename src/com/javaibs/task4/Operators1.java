package com.javaibs.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double first_number = console.nextInt();
        double second_number = console.nextInt();
        double third_number = console.nextInt();
        double average = (first_number + second_number + third_number) / 3.0;
        System.out.println(average);
        double mean = Math.floor(average / 2);
        if (mean > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
