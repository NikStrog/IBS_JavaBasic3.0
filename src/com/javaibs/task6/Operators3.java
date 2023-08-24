package com.javaibs.task6;

import java.util.Scanner;

public class Operators3 {
    public static void main(String[] args) {
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние, 3 - скорость");
        Scanner console = new Scanner(System.in);
        int value = console.nextInt();
        int temp;
        switch (value){
            case 1: temp = 1;
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - тонна");
                int measure1 = console.nextInt();
                System.out.println("Введите число");
                double number1 = console.nextDouble();
                if (measure1 == 1){
                    System.out.println("Результат: \n Граммы: " + number1 + "\n Килограммы: " + number1 * 0.001 + "\n Тонны: " + number1 * 0.000001);
                }
                else if (measure1 == 2){
                    System.out.println("Результат: \n Граммы: " + number1 * 1000 + "\n Килограммы: " + number1 + "\n Тонны: " + number1 * 0.001);
                }
                else if (measure1 == 3){
                    System.out.println("Результат: \n Граммы: " + number1 * Math.pow(10, 6) + "\n Килограммы: " + number1 * Math.pow(10, 3) + "\n Тонны: " + number1);
                }
                break;
            case 2: temp = 2;
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - километр, 3 - миля");
                int measure2 = console.nextInt();
                System.out.println("Введите число");
                double number2 = console.nextDouble();
                if (measure2 == 1){
                    System.out.println("Результат: \n Метры: " + number2 + "\n Километры: " + number2 * 0.001 + "\n Мили: " + number2 * 0.0006214);
                }
                else if (measure2 == 2){
                    System.out.println("Результат: \n Метры: " + number2 * 1000 + "\n Километры: " + number2 + "\n Мили: " + number2 * 1.6093);
                }
                else if (measure2 == 3){
                    System.out.println("Результат: \n Метры: " + number2 * 1609 + "\n Километры: " + number2 * 1.61 + "\n Мили: " + number2);
                }
                break;
            case 3: temp = 3;
                System.out.println("Выберите единицу измерения: 1 - метр/секунда, 2 - километр/час, 3 - узел");
                int measure3 = console.nextInt();
                System.out.println("Введите число");
                double number3 = console.nextDouble();
                if (measure3 == 1){
                    System.out.println("Результат: \n Метр/секунда: " + number3 + "\n Километр/час: " + number3 * 3.6 + "\n Узлы: " + number3 * 1.94);
                }
                else if (measure3 == 2){
                    System.out.println("Результат: \n Метр/секунда: " + number3 * 0.28 + "\n Километр/час: " + number3 + "\n Узлы: " + number3 * 0.54);
                }
                else if (measure3 == 3){
                    System.out.println("Результат: \n Метр/секунда: " + number3 * 0.51 + "\n Километр/час: " + number3 * 1.85 + "\n Узлы: " + number3);
                }
                break;
        }
    }
}
