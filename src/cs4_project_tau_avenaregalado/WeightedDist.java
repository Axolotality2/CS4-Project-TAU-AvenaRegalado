package cs4_project_tau_avenaregalado;

import java.util.HashMap;
import java.util.Random;

public class WeightedDist<T> {

    private HashMap<T, Double> table;
    private double weightSum;
    private final Random generator = new Random();

    public void addEntry(T entry, double weight) {
        weightSum += weight;
        table.put(entry, weightSum);
    }

    public T selectRandom() {
        double reference = generator.nextDouble() * weightSum;

        for (T entry : table.keySet()) {
            if (table.get(entry) >= reference) {
                return entry;
            }
        }
        return null;
    }
}