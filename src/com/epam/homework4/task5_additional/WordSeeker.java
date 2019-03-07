package com.epam.homework4.task5_additional;

import java.util.Scanner;

public class WordSeeker {
    public static void main(String[] args) {
        getWord();
    }

    private static void getWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the word number: ");
        int index = scanner.nextInt();
        System.out.println(getFirstLetter(text, index));
        scanner.close();
    }

    private static char getFirstLetter(String text, int index){
        char letter = '@';
        text = text.trim();
        if (index == 1){
            letter = text.charAt(0);
        } else {
            int counter = 1;
            while (counter < index) {
                int position = text.indexOf(' ');
                text = text.substring(position).trim();
                letter = text.charAt(0);
                counter++;
            }
        }
        return letter;
    }
}
