package cs4_project_tau_avenaregalado;

public class Customer {
    private int orderComplexity, leaveTime, performanceRating;
    private Product[] order;
    
    public Customer(int orderComplexity) {
        this.orderComplexity = orderComplexity;
    }
    
    public Customer(int orderComplexity, int leaveTime) {
        this.orderComplexity = orderComplexity;
        this.leaveTime = leaveTime;
    }
    
    public Customer(Product[] order) {
        this.order = order;
    }
    
    private void generateOrder(int complexity) {
        
    }
    
    public void rateProduct(Product product) {
        
    }

    public int getLeaveTime() {
        return leaveTime;
    }

    public Product[] getOrder() {
        return order;
    }
}