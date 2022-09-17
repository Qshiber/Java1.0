package com.sda;

import java.util.Scanner;

/*
2. Wprowadź z poziomu konsoli dwie wartości, dodaj je do siebie i wypisz ich sumę.
 */
public class Excercise3 {
    public static void main(String[] args) {

        System.out.println("Insert first number:");
        int first = getNumberFromUserInput();
        System.out.println("Insert second number:");
        int second = getNumberFromUserInput();

        int result = first + second;
        System.out.printf("Sum: %d", result);


    }

    public static int getNumberFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
