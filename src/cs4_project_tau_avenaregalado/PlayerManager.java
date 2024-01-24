package cs4_project_tau_avenaregalado;

import java.util.ArrayList;

public class PlayerManager {

    private static Product currentOrder;
    private static int customersServed, totalRating;
    private static float averageRating;

    public static void addRating(int rating) {
        totalRating += rating;
        averageRating = totalRating / customersServed;
    }

    public static void submitProduct() {

    }

    public static void lose() {

    }

    public static void win() {

    }

    public static void forceEndDay() {

    }

    public static Product getCurrentOrder() {
        return currentOrder;
    }

    public static int getCustomersServed() {
        return customersServed;
    }

    public static int getTotalRating() {
        return totalRating;
    }

    public static float getAverageRating() {
        return averageRating;
    }

    public static void setCurrentOrder(Product order) {
        currentOrder = order;
    }
}
