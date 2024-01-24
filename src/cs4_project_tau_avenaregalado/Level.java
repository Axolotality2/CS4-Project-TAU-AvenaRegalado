package cs4_project_tau_avenaregalado;

import java.util.ArrayList;

public class Level {
    private ArrayList<Customer> customers;
    private Customer currentCustomer;
    private int meanComplexity, meanOrderSize, time, closingTime;
    private float maxTimeMult;
    
    public Level(int meanComplexity, int meanOrderSize, float maxTimeMult) {
        
    }
    
    private void cueCustomers(int customerCount) {
        
    }
    
    public Customer removeCustomer(Customer customer) {
        return customer;
    }
    
    public Customer removeCustomer(int index) {
        return null;
    }
    
    public void endDay() {
        
    }
    
    public void updateTime() {
        
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public int getMeanComplexity() {
        return meanComplexity;
    }

    public int getMeanOrderSize() {
        return meanOrderSize;
    }

    public int getTime() {
        return time;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public float getMaxTimeMult() {
        return maxTimeMult;
    }
}
