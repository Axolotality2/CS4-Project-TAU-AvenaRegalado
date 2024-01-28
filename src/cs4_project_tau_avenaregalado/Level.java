package cs4_project_tau_avenaregalado;

import java.util.ArrayList;
import java.util.Random;

public class Level {

    private static final WeightedDist<Integer> allergyTable = new WeightedDist<>();
    private final ArrayList<Customer> customers;
    private final int closingTime;
    private final WeightedDist<Integer> complexityTable, orderSizeTable;
    private int time, customersServed;
    private Customer currentCustomer;

    public Level(WeightedDist<Integer> complexityTable, WeightedDist<Integer> orderSizeTable, int closingTime, int initialCustomerCount) {
        this.complexityTable = complexityTable;
        this.orderSizeTable = orderSizeTable;
        this.time = 0;
        this.closingTime = closingTime;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> cueCustomers(int customerCount) {
        ArrayList<Customer> customerList = new ArrayList<>();

        for (int i = 0; i < customerCount; i++) {
            int orderSize = this.orderSizeTable.pickRandom();
            Ingredient[] allergies = Ingredient.ALLERGENS.pickRandom(allergyTable.pickRandom());

            customerList.add(new Customer(complexityTable, orderSize, allergies, 0, time));
        }

        return customerList;
    }

    public Customer removeCustomer(Customer customer) {
        return customer;
    }

    public Customer removeCustomer(int index) {
        return null;
    }

    public void updateTime() {
        time++;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public int getTime() {
        return time;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public int getCustomersServed() {
        return customersServed;
    }
}
