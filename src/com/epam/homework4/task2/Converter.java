package com.epam.homework4.task2;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        convertNumber();
    }

    private static void convertNumber(){
        System.out.print("Enter integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(convertIntegerToBinary(number));
        scanner.close();
    }

    private static String convertIntegerToBinary(int number){
        String converted = "";
        while ((converted.length()-1) <= 32){
            if (number % 2 > 0){
                converted = 1 + converted;
            } else {
                converted = 0 + converted;
            }
        number /= 2;
        }
    return converted;
    }
}
