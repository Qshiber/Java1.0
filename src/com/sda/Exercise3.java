package com.sda;

/*
1. Pobierz liczbe z konsoli - skorzystaj z metody Scannera „nextInt”.
Przetestuj liczbe dla każdego przypadku (liczba mniejsza, równa lub większa od 10).
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("Insert number");
        int number = getNumberFromUserInput();

        if (number > 10){
            System.out.println("Bigger than 10");
        } else if (number == 10) {
            System.out.println("Equal 10");
        } else {
            System.out.println("Lower than 10");
        }


    }


    public static int getNumberFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
