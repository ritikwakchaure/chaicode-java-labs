package com.chaicode.methods;

/**
 * WelcomeBot Greeting Generator
 *
 * <p>
 * A chatbot greets users based on the hour of day (24-hour format).
 *
 * <p>
 * Rules:
 * <ul>
 * <li>5–11 → "Good morning, {name}!"</li>
 * <li>12–16 → "Good afternoon, {name}!"</li>
 * <li>17–21 → "Good evening, {name}!"</li>
 * <li>Otherwise → "Good night, {name}!"</li>
 * <li>If name is null or blank after trim, return "Hello, guest!"</li>
 * <li>If hour is not 0–23, return "Invalid hour"</li>
 * </ul>
 *
 * @param name user's name
 * @param hour hour of day (0–23)
 * @return greeting message
 */
public final class GreetingGenerator {

    private GreetingGenerator() {
    }

    public final class GreetingGenerator {

        private GreetingGenerator() {
        }

        public static String greet(String name, int hour) {

            // Check invalid hour
            if (hour < 0 || hour > 23) {
                return "Invalid hour";
            }

            // Check null or blank name
            if (name == null || name.trim().isEmpty()) {
                return "Hello, guest!";
            }

            // Remove extra spaces
            name = name.trim();

            if (hour >= 5 && hour <= 11) {
                return "Good morning, " + name + "!";
            } else if (hour >= 12 && hour <= 16) {
                return "Good afternoon, " + name + "!";
            } else if (hour >= 17 && hour <= 21) {
                return "Good evening, " + name + "!";
            } else {
                return "Good night, " + name + "!";
            }
        }
    }
}
