package com.javaibs.finaltask2;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String equation = console.nextLine();
        char a[] = equation.toCharArray();
        if (a[1] == '+'){
            if (a[4] == 'x'){
                int result = Character.getNumericValue(a[0]) + Character.getNumericValue(a[2]);
                System.out.println("Result: " + result);
            }
            else if (a[0] == 'x'){
                int result = Character.getNumericValue(a[4]) - Character.getNumericValue(a[2]);
                System.out.println("Result: " + result);
            }
            else if (a[2] == 'x'){
                int result = Character.getNumericValue(a[4]) - Character.getNumericValue(a[0]);
                System.out.println("Result: " + result);
            }
        } else if (a[1] == '-') {
            if (a[4] == 'x'){
                int result = Character.getNumericValue(a[0]) - Character.getNumericValue(a[2]);
                System.out.println("Result: " + result);
            }
            else if (a[0] == 'x'){
                int result = Character.getNumericValue(a[4]) + Character.getNumericValue(a[2]);
                System.out.println("Result: " + result);
            }
            else if (a[2] == 'x'){
                int result = Character.getNumericValue(a[0]) - Character.getNumericValue(a[4]);
                System.out.println("Result: " + result);
            }

        }
    }
}
