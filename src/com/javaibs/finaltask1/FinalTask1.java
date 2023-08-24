package com.javaibs.finaltask1;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите текущий курс: ");
        double exchange = console.nextDouble();
        System.out.println("Количество рублей: ");
        double roubles = console.nextDouble();
        double dollars = Math.round(roubles / exchange * 100.0) / 100.0;
        System.out.println(dollars);
    }
}
