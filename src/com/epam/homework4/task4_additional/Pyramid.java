package com.epam.homework4.task4_additional;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        drawPyramid();
    }

    private static void drawPyramid(){
        System.out.print("Enter height of the pyramid (from 1 to 9): ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        if (height < 1){
            System.out.println("It is not enough to build the pyramid");
        } else if (height > 9) {
            System.out.println("It is too much");
        }
        getPyramid(height);
        scanner.close();
    }

    private static void getPyramid(int height){
        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++)
                System.out.print(" ");

            for (int k = 1; k < i; k++)
                System.out.print(k);

            for (int k = i; k >=1; k--)
                System.out.print(k);
            System.out.println();
        }
    }
}
