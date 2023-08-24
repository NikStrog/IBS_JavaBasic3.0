package com.javaibs.task8;

import java.util.Scanner;

public class Cycles2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int counter = 0;
        if (number % 2 == 0){
            for (int i = 1; i < number; i++) {
                if (!(i % 2 == 0)){
                    counter += i;
                }
            }
        }
        else {
            for (int i = 1; i <= number; i++) {
                if (!(i % 2 == 0)){
                    counter += i;
                }
            }
        }
        System.out.println(counter);
    }
}
