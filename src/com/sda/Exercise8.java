package com.sda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*
1. Wewnątrz pętli while (np. 5 razy) pobieraj produkt do kupienia i wprowadzaj go do utworzonej tablicy typu String.
Wyświetl wszystkie produkty z wykorzystaniem pętli for, for each, oraz while.

2. Utwórz tablicę przechowującą wartości typu int o rozmiarze zadanym z konsoli.
Wypełnij ją wartościami wewnątrz pętli for. Zwróć sumę tych wartości.

3. Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for-each polacz imiona zapisujac je w zmiennej typu String, oddzielając je przecinkami.
Wyświetl utworzony łańcuch znaków. Np. „Małgorzata, Jan, Jakub”.

4. Jak wyżej, ale dopisuj tylko imiona, które składają się z mniej, niż 5 znaków.
 */
public class Exercise8 {
    public static void main(String[] args) {

        //grocery();
        //sum();
        nameArray();
    }


    public static void grocery(){
        Scanner scanner = new Scanner(System.in);
        int groceryListSize = 5;
        String[] groceryList = new String[groceryListSize];
        int i = 0;
        while( i < groceryListSize){
            System.out.printf("Podaj %d produkt.\n", (i+1));
            groceryList[i] = scanner.next();
            i++;
        }

//        System.out.println("Grocery List:");
//        for (int j = 0; j < groceryListSize; j++) {
//            System.out.printf("%s ", groceryList[j]);
//        }

        for (String s: groceryList) {
            System.out.print(s + " ");
        }
    }

    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb:");
        int arrSize = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arrSize; i++) {
            System.out.printf("Insert %d number: ", (i+1));
            sum += scanner.nextInt();
        }
        System.out.printf("Sum: %d", sum);
    }
    //3. Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for-each polacz imiona zapisujac je w zmiennej typu String, oddzielając je przecinkami.
    //Wyświetl utworzony łańcuch znaków. Np. „Małgorzata, Jan, Jakub”.

    public static void nameArray(){
        String[] namesArray = new String[]{"Małgorzata", "Jan", "Jakub", "Tomasz", "Agata"};
        System.out.println(Arrays.toString(namesArray));
        StringBuilder mergeNames = new StringBuilder();

        for (int i = 0; i < namesArray.length; i++) {
            if(i == 0){
                mergeNames.append(namesArray[i]);
                continue;
            }
            mergeNames.append(String.format(", %s", namesArray[i]));
        }

        System.out.println(mergeNames);
    }

    public static void nameArrayLongerThan(int minLength){
        String[] namesArray = new String[]{"Małgorzata", "Jan", "Jakub", "Tomasz", "Agata"};
        System.out.println(Arrays.toString(namesArray));
        StringBuilder mergeNames = new StringBuilder();

        for (int i = 0; i < namesArray.length; i++) {

            if(i == 0){
                mergeNames.append(namesArray[i]);
                continue;
            }

            mergeNames.append(String.format(", %s", namesArray[i]));
        }

        System.out.println(mergeNames);
    }
}
