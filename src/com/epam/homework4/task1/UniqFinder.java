package com.epam.homework4.task1;

import java.util.Scanner;

public class UniqFinder {
    public static void main(String[] args) {
        getUniqChars();
    }

    private static void getUniqChars(){
        System.out.print("Enter the word or phrase: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        System.out.println(findUniqChars(line));
        scanner.close();
    }

    private static String findUniqChars(String line){
        if (line != null) {
            String result = "";
            int index = 0;
            while (index < line.length()) {
                char ch = line.charAt(index);
                if (!result.contains(String.valueOf(ch))) {
                    result += ch;
                }
                index++;
            }
            return result;
        } else {
            return null;
        }
    }
}
