package com.chaicode.whileloop;

/**
 * Mirror Number Generator
 *
 * <p>
 * Reverse the digits of a non-negative integer using a while loop.
 *
 * <p>
 * Examples: 123 → 321, 1000 → 1, 0 → 0
 *
 * <p>
 * If n is negative, return -1.
 *
 * @param n the number
 * @return reversed number, or -1 for negative input
 */
public final class ReverseDigits {

    private ReverseDigits() {
    }

    public static int reverse(int n) {

        if (n < 0) {
            return -1;
        }

        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n /= 10;
        }

        // Your code here
        return reverse;
    }
}
