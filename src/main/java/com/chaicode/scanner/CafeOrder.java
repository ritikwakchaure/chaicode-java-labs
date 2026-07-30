package com.chaicode.scanner;

import java.util.Scanner;

/**
 * BeanStreet Cafe Order Terminal
 *
 * <p>Read line items from a Scanner until a line "DONE" is entered. Each line before DONE
 * is a price (double). Return the order total.
 *
 * <p>Example input:
 * <pre>
 * 4.50
 * 3.25
 * 2.00
 * DONE
 * </pre>
 * Total = 9.75
 *
 * <p>Rules:
 * <ul>
 *   <li>Skip blank lines</li>
 *   <li>Ignore negative prices</li>
 *   <li>If scanner is null, return 0.0</li>
 * </ul>
 *
 * @param scanner input source
 * @return order total
 */
public final class CafeOrder {

    private CafeOrder() {}

    public static double readOrderTotal(Scanner scanner) {

        if(scanner == null) return 0.0;

        double total = 0.0;

        while(scanner.hasNext()){
            String line = scanner.nextLine().trim();

            // Rule 2: Stop when DONE is entered
            if (line.equalsIgnoreCase("DONE")) {
                break;
            }

            // Rule 3: Skip blank lines
            if (line.isEmpty()) {
                continue;
            }

            // Convert String to double
            double price = Double.parseDouble(line);

            // Rule 4: Ignore negative prices
            if (price < 0) {
                continue;
            }

            total += price;
        }

        return total;
    }
    public static void main(String[] args) {

        String input = """
                4.50
                3.25
                2.00
                DONE
                """;

        Scanner scanner = new Scanner(input);

        double total = readOrderTotal(scanner);

        System.out.println("Total = " + total);
    }
}


        // Your code here


