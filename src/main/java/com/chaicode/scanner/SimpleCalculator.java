package com.chaicode.scanner;

import java.util.Scanner;

public final class SimpleCalculator {

    private SimpleCalculator() {
    }

    public static double calculate(Scanner scanner) {

        if (scanner == null) {
            return Double.NaN;
        }

        double first = scanner.nextDouble();
        String operator = scanner.next();
        double second = scanner.nextDouble();

        switch (operator) {
            case "+":
                return first + second;

            case "-":
                return first - second;

            case "*":
                return first * second;

            case "/":
                if (second == 0) {
                    return Double.NaN;
                }
                return first / second;

            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {

        String input = """
                10
                +
                20
                """;

        Scanner scanner = new Scanner(input);

        System.out.println(calculate(scanner));
    }
}