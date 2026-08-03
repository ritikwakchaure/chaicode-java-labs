package com.chaicode.dowhileloop;

public final class PizzaOrders {

    private PizzaOrders() {}

    public static int countOrders(String[] orders) {

        if (orders == null || orders.length == 0) {
            return 0;
        }

        int count = 0;
        int i = 0;

        do {

            if ("DONE".equals(orders[i])) {
                break;
            }

            if (orders[i] != null && !orders[i].isEmpty()) {
                count++;
            }

            i++;

        } while (i < orders.length);

        return count;
    }
}