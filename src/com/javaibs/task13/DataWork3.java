package com.javaibs.task13;

import java.util.Scanner;

public class DataWork3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string = console.nextLine();
        String[] words = string.split(" ");
        int numberOfWords = words.length;
        int amount = 0;
        for (int i = 0; i < words.length; i++){
            char[] elementsOfWord = words[i].toCharArray();
            int count = 0;
            for (int j = 0; j < elementsOfWord.length; j++){
                if (elementsOfWord[j] >= 'a' && elementsOfWord[j] <= 'z'){
                    count++;
                }
            }
            if (count == words[i].length()){
                amount++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Количество слов на латанице: " + amount);
    }
}
