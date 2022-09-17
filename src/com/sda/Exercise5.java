package com.sda;

import java.util.Scanner;

/*
1. Napisz prosty kalkulator, który:

a) Przyjmuje dwie wartości x i y, zwraca ich sumę oraz różnicę.
Wykorzystaj funkcję printf albo String.format tak, aby znak „=„ i „+” oraz „-” były w tym samym miejscu jeden pod drugim.
Nie używaj metody nextInt().

b) j/w + podawanie informacji, czy chcemy, aby dokonać dodawania, czy odejmowania poprzez napisanie „suma” lub „różnica”.
Wykorzystaj instrukcję warunkową if-else

c) j/w + użytkownik może zdecydować jaką operację chce wykonać uwzględniając mnożenie i dzielenie.
Wykorzystaj instrukcję warunkową switch-case

d) j/w + skorzystaj z „ternary operator” zamiast standardowej instrukcji if-else

e) obsłuż sytuację, w której użytkownik poda wartość 0 podczas dzielenia.
 */
public class Exercise5 {

    public static void main(String[] args) {

        //bPoint();
        cPoint();

    }

    public static void aPoint() {

        messageInsert("x");
        double x = getNumberFromUserInput();
        messageInsert("y");
        double y = getNumberFromUserInput();

        switch (getActionFromUserInput()) {
            case "+" -> System.out.printf("Adding result: %f + %f = %f\n", x, y, add(x, y));
            case "-" -> System.out.printf("Substract result: %f - %f = %f\n", x, y, sub(x, y));
            default -> System.out.println("Not valid action\n");
        }

    }

    public static void bPoint() {

        messageInsert("x");
        double x = getNumberFromUserInput();
        messageInsert("y");
        double y = getNumberFromUserInput();

        System.out.println("Insert action \"sum\" or \"difference\"");
        switch (getActionFromUserInput()) {
            case "sum" -> System.out.printf("Adding result: %f + %f = %f\n", x, y, add(x, y));
            case "difference" -> System.out.printf("Substract result: %f - %f = %f\n", x, y, sub(x, y));
            default -> System.out.println("Not valid action\n");
        }

    }

    public static void cPoint() {

        messageInsert("x");
        double x = getNumberFromUserInput();
        messageInsert("y");
        double y = getNumberFromUserInput();

        switch (getActionFromUserInput()) {
            case "+" -> System.out.printf("Adding result: %f + %f = %f\n", x, y, add(x, y));
            case "-" -> System.out.printf("Substract result: %f - %f = %f\n", x, y, sub(x, y));
            case "/" -> System.out.println((y != 0) ?
                    System.out.printf("Division result: %f / %f = %f", x, y, div(x, y))
                    : "Cant divide by 0!");
            case "*" -> System.out.printf("Division result: %f / %f = %f", x, y, mul(x, y));
            default -> System.out.println("Not valid action\n");
        }

    }

    public static void messageInsert(String s) {
        System.out.printf("Insert %s\n", s);
    }

    public static double getNumberFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static String getActionFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static double div(double x, double y) {
        return x / y;
    }

    public static double mul(double x, double y) {
        return x * y;
    }

}
