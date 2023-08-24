package com.javaibs.task11;

import java.util.Scanner;

public class DataWork1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string = console.nextLine();
        int number2 = console.nextInt();
        int number1 = Integer.parseInt(string);
        System.out.println(Math.max(number1, number2));
        double minNumber = (double)Math.min(number1, number2);
        System.out.println(minNumber);
    }
}
