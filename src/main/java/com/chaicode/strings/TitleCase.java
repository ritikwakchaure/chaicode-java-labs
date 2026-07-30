package com.chaicode.strings;

/**
 * NewsDesk Title Formatter
 *
 * <p>
 * Convert a headline to title case: first letter of each word uppercase, rest
 * lowercase.
 *
 * <p>
 * Rules:
 * <ul>
 * <li>Words separated by one or more spaces</li>
 * <li>If input is null, return ""</li>
 * <li>Trim leading/trailing spaces; collapse multiple spaces to single space in
 * output</li>
 * </ul>
 *
 * <p>
 * Example: "the quick BROWN fox" → "The Quick Brown Fox"
 *
 * @param headline input headline
 * @return title-cased headline
 */
public final class TitleCase {

    private TitleCase() {
    }

    public static String format(String headline) {
        // Your code here

          // Rule 1
        if (headline == null) {
            return "";
        }

        // Remove leading/trailing spaces
        headline = headline.trim();

        // If empty after trim
        if (headline.isEmpty()) {
            return "";
        }

        // Split words (one or more spaces)
        String[] words = headline.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(Character.toUpperCase(word.charAt(0)));

            if (word.length() > 1) {
                result.append(word.substring(1).toLowerCase());
            }

            result.append(" ");
        }

        // Remove last space
        return result.toString().trim();
    }
}
