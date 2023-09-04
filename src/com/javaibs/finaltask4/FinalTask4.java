package com.javaibs.finaltask4;


import java.util.Arrays;
import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int numOfStrings = console.nextInt();
        console.nextLine();
        String strings[] = new String[numOfStrings];
        for (int i = 0; i < numOfStrings; i++){
            strings[i] = console.nextLine();
        }
        long numberOfUniqueSymbols = 0;
        long temp = 0;
        String uniqueRow = null;
        for (int i = 0; i < numOfStrings; i++) {
            numberOfUniqueSymbols = strings[i].chars().distinct().count();
            if (numberOfUniqueSymbols > temp){
                uniqueRow = strings[i];
                temp = numberOfUniqueSymbols;
            }
        }
        System.out.println(uniqueRow);
    }
}
