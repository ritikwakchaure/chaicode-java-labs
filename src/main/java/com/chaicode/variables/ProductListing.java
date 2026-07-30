package com.chaicode.variables;

/**
 * GreenBasket Grocery Listings
 *
 * <p>
 * You're building product cards for an online grocery app. Each card shows the
 * item name,
 * stock quantity, line total, and whether it's organic.
 *
 * <p>
 * Format (exactly):
 * 
 * <pre>
 * Organic Tomatoes x3 = $4.50
 * Regular Milk x2 = $6.00
 * </pre>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>Line total = quantity × unitPrice, shown with 2 decimal places</li>
 * <li>Prefix "Organic " when isOrganic is true; otherwise "Regular "</li>
 * <li>Use String.format for the price part: "%.2f"</li>
 * </ul>
 *
 * @param item the product item
 * @return formatted listing line
 */
public final class ProductListing {

    private String name;

    public String getName() {
        return name;
    }

    public static String buildProductCard(String item, int quantity, double unitPrice, boolean isOrganic) {
        double total = quantity * unitPrice;

        String type = isOrganic ? "Organic " : "Regular";

        return type + item + " x" + quantity + " = $" +
                String.format("%.2f", total);

        // Your code here

    }

    public static void main(String[] args) {
        // Pro item = new Pro("Tomatoes");
        System.out.println(buildProductCard("Tomatoes", 3, 1.50, true));

        System.out.println(buildProductCard("Milk", 2, 3.00, false));
    }
}
