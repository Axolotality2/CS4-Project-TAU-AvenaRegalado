package cs4_project_tau_avenaregalado;

public class Denser extends Level {
    public Denser(WeightedDist<Integer> complexityTable, WeightedDist<Integer> orderSizeTable, WeightedDist<Float> timeMultTable, int initialCustomerCount) {
        super(complexityTable, orderSizeTable, initialCustomerCount);
        
        for (Customer c : this.customers)
            c.setLeaveTime(c.getLeaveTime() * timeMultTable.pickRandom());
    }
}
