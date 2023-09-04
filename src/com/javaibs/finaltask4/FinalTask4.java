package com.javaibs.finaltask4;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = "Заархивированный вирус";
        Scanner console = new Scanner(System.in);
        String attempt;
        String advice = "Он очень опасен";
        int count = 0;

        while (count < 3){
            attempt = console.nextLine();
            if (attempt.equalsIgnoreCase(answer)){
                System.out.println("Правильно!");
                break;
            }
            else if (attempt.equalsIgnoreCase("Подсказка") && count > 0 && count <= 2){
                System.out.println("Подсказка уже недоступна");
            }
            else if (attempt.equalsIgnoreCase("Подсказка")){
                System.out.println(advice);
                count = 2;
            }
            else if (count < 2){
                System.out.println("Подумай еще");
                count++;
            }
            else {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
