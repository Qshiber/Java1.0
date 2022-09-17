package com.sda;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        displayUserInputWords();
    }

    //3. Wewnątrz pętli while (np. 5 razy) pobierz dowolna liczbe. Zwróć sumę wartości liczb parzystych oraz liczb nieparzystych
    public static void positiveNegativeSum() {

        Scanner scanner = new Scanner(System.in);
        int sumPositive = 0;
        int sumNegative = 0;
        int i = 0;
        int number;
        while (i < 5) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                sumPositive += number;
            } else {
                sumNegative += number;
            }
            i++;
        }
        System.out.printf("Positive sum: %d \nNegative sum: %d", sumPositive, sumNegative);
    }

    //4. Pobieraj i wyświetlaj dowolny ciąg znaków od użytkownika tak długo, aż nie napisze „exit” uzyj petli do while.

    public static void displayUserInputWords() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Insert Word:\n");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(word);
        }

    }
}
