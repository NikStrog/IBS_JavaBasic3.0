package com.javaibs.task12;

public class DataWork2 {
    public static void main(String[] args) {
        String string = "I like Java!!!";
        if (string.contains("Java") && string.startsWith("I like") && string.endsWith("!!!")){
            System.out.println(string.toUpperCase());
            String newString = string.substring(7, 11);
            System.out.println(newString.replaceAll("a", "o"));
        }
    }
}
