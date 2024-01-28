package cs4_project_tau_avenaregalado;

public class PlayerManager {

    private static Customer currCustomer;
    private static Week currWeek;
    private static int customersServed, totalRating;
    private static float averageRating;

    private static void addRating(int rating) {
        totalRating += rating;
        averageRating = totalRating / customersServed;
    }

    public static void submitProduct(Product product) {
        
    }

    public static void lose() {

    }

    public static void win() {

    }

    public static void endDay() {
        customersServed += currWeek.getCurrDay().getCustomersServed();
    }

    public static Customer getCurrCustomer() {
        return currCustomer;
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

    public static Week getCurrWeek() {
        return currWeek;
    }
    
    public static int getCurrTime() {
        return currWeek.getCurrDay().getTime();
    }
}