package com.javaibs.task5;

import java.util.Scanner;

public class Operators2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double first_number = console.nextInt();
        double second_number = console.nextInt();
        char operation = console.next().charAt(0);
        if (operation == '+'){
            System.out.println(first_number + second_number);
        }
        else if (operation == '-'){
            System.out.println(first_number - second_number);
        }
        else if (operation == '*'){
            System.out.println(first_number * second_number);
        }
        else if (operation == '/'){
            System.out.println(first_number / second_number);
        }
    }
}
