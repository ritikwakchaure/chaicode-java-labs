package com.chaicode.whileloop;

/**
 * Digit Detective
 *
 * <p>
 * Sum all digits of a non-negative integer using a while loop.
 *
 * <p>
 * Examples: 123 → 6, 905 → 14, 0 → 0
 *
 * <p>
 * If n is negative, return -1.
 *
 * @param n the number
 * @return digit sum, or -1 for negative input
 */
public final class DigitSum {

    private DigitSum() {
    }

    public static int sumDigits(int n) {

        if (n < 0)
            return -1;
        // Your code here

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;
            n /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumDigits(123)); // 6
        System.out.println(sumDigits(905)); // 14
        System.out.println(sumDigits(0)); // 0
        System.out.println(sumDigits(-45)); // -1
    }
}
