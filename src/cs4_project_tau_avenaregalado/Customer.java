package cs4_project_tau_avenaregalado;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    
    private final int orderTime, orderSize;
    private final ArrayList<Product> orderLeft;
    private final Ingredient[] allergies;
    private int totalRating, leaveTime;

    public Customer(WeightedDist<Integer> complexityTable, int orderSize, Ingredient[] allergies, int leaveTime, int currentTime) {
        this.orderLeft = getOrder(complexityTable, orderSize);
        this.totalRating = this.orderSize = this.orderLeft.size();
        this.allergies = allergies;
        this.leaveTime = leaveTime;
        this.orderTime = currentTime;
    }
    
    public Customer(WeightedDist<Integer> complexityTable, int orderSize, Ingredient[] allergies, int currentTime) {
        this(complexityTable, orderSize, allergies, 0, currentTime);
        
        this.leaveTime = 1;
    }

    public Customer(ArrayList<Product> order, Ingredient[] allergies, int leaveTime, int currentTime) {
        this.orderLeft = order;
        this.totalRating = this.orderSize = this.orderLeft.size();
        this.allergies = allergies;
        this.leaveTime = leaveTime;
        this.orderTime = currentTime;
    }

    private ArrayList<Product> getOrder(WeightedDist<Integer> complexityTable, int variation, int orderSize) {
        ArrayList<Product> orderList = new ArrayList<>();
        Product[] orderable;
        int index;
        
        for (int i = 0; i < orderSize; i++) {
            orderable = Product.filterByComplexity(complexityTable.pickRandom(), variation); 
            index = (int) (Math.random() * (orderable.length - 1));
            orderList.add(orderable[index]);
        }

        return orderList;
    }

    private ArrayList<Product> getOrder(WeightedDist<Integer> complexityTable, int orderSize) {
        return this.getOrder(complexityTable, 0, orderSize);
    }

    public int rateProduct(Product product, int currentTime) throws Exception {
        int score = 1;
        int percentTimeSpent = (currentTime - orderTime) / (currentTime - leaveTime);
        boolean allergenFree = true;

        if (!orderLeft.remove(product)) { // Remove from remaining order
            throw new Exception();
        }

        for (Ingredient allergy : allergies) // Test for allergies
        {
            if (Arrays.asList(product.getAllergens()).contains(allergy)) {
                allergenFree = false;
            }
        }

        if (percentTimeSpent < 0.90) {
            score++;
        }
        if (percentTimeSpent < 0.60) {
            score++;
        }
        if (allergenFree) {
            score++;
        }

        this.totalRating += score;
        return score;
    }

    public float getOverallRating() {
        return totalRating / orderSize;
    }

    public int getLeaveTime() {
        return leaveTime;
    }

    public ArrayList<Product> getOrderLeft() {
        return orderLeft;
    }
}
