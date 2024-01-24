package cs4_project_tau_avenaregalado;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private int leaveTime, orderTime, performanceRating;
    private final Product order;
    private final Ingredient[] allergies;
    
    public Customer(int orderComplexity, int marginOfComplexity, Ingredient[] allergies, int leaveTime, int currentTime) {
        this.order = this.generateOrder(orderComplexity, marginOfComplexity);
        this.allergies = allergies;
        this.leaveTime = leaveTime;
        this.orderTime = currentTime;
    }
    
    public Customer(Product order, Ingredient[] allergies, int leaveTime, int currentTime) {
        this.order = order;
        this.allergies = allergies;
        this.leaveTime = leaveTime;
        this.orderTime = currentTime;
    }
    
    private Product generateOrder(int orderComplexity, int marginOfComplexity) {
        ArrayList<Product> orderable = new ArrayList<Product>();
        int orderIndex;
        
        for (Product p : Product.possibleOrders) // Search for orderable products
            if (p.getComplexity() >= orderComplexity - marginOfComplexity && p.getComplexity() <= orderComplexity + marginOfComplexity)
                orderable.add(p);
        
        orderIndex = (int) (Math.random() * orderable.size()); // Select one out of the list
        return orderable.get(orderIndex);
    }
    
    public void rateProduct(Product product, int currentTime) {
        int score = 1;
        int percentTimeSpent = (currentTime - orderTime) / (currentTime - leaveTime);
        boolean allergenFree = true;
        
        for (Ingredient allergy : allergies)
            if (Arrays.asList(product.getAllergens()).contains(allergy))
                allergenFree = false;
        
        if (order.equals(product))
            score++;
        if (percentTimeSpent < 0.90)
            score++;
        if (percentTimeSpent < 0.60)
            score++;
        if (allergenFree)
            score++;
    }

    public int getLeaveTime() {
        return leaveTime;
    }

    public Product getOrder() {
        return order;
    }
}