package com.sda;
/*
1. Wewnątrz pętli for (np. 5 razy) pobieraj produkt do kupienia i wyświetlaj go na ekran w postaci:
„Dodałem do koszyka <nazwa>, to nasz <numer iteracji> produkt!”

2. Stwórz pętle for, która wykona 5 iteracji.
Wewnątrz pętli pobieraj z konsoli dowolną wartość typu int.
Po wyjściu z pętli zwróć sumę tych wartości.

3. Stwórz pętle wewnątrz pętli (pamiętaj o różnych nazwach zmiennych iterujących!).
Wyświetl wartości iteratorów w postaci: „<iterator nr 1> : <iterator nr 2>”.

4. Wyświetl kwadrat składający się z samych gwiazdek „*”, których liczba (długość boku kwadratu) będzie równa podanej z konsoli wartości.

5. Jak wyżej, ale znak, z którego będzie składał się kwadrat, również pobierz z konsoli.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        //groceryList();
        //addMultipleNumbers();
        //iteratorInception();
        //generateSquare();
    }


    public static void groceryList() {

        String[] groceryList = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            groceryList[i - 1] = scanner.next();
            System.out.printf("Dodalem do koszyka %s, to nasz %d produkt!\n", groceryList[i - 1], i);
        }

        System.out.println(Arrays.toString(groceryList));

    }

    public static void addMultipleNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }

    public static void iteratorInception() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d : %d\n", i, j);
            }
        }

    }

    public static void generateSquare() {

        System.out.println("Insert square size: ");
        int squareSize = getPositiveIntegerFromUserInput();
        System.out.println("Insert square symbol: ");
        String squareSymbol = getStringFromUserInput();
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                System.out.printf("%s ", squareSymbol);
            }
            System.out.println();
        }
    }

    public static int getPositiveIntegerFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            return number;
        } else {
            System.err.println("Insert positive integer");
            return getPositiveIntegerFromUserInput();
        }
    }

    public static String getStringFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
