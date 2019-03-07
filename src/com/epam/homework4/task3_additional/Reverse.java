package com.epam.homework4.task3_additional;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        getReversed(2);
    }

    private static void getReversed(int countOfReversedDigits){
        System.out.print("Enter integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String reversed = "";
        while (countOfReversedDigits > 0){
            reversed = reversed + (number % 10);
            number /= 10;
            countOfReversedDigits--;
        }
        System.out.println(reversed);
        scanner.close();
    }
}
