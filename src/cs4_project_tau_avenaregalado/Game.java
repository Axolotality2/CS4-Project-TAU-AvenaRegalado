package cs4_project_tau_avenaregalado;

import java.util.ArrayList;

public class Game {
    public static class PlayerManager {
        private Product currentOrder;
        private int customersServed, totalRating;
        private float averageRating;
        
        public void addRating(int rating) {
            totalRating += rating;
            averageRating = getTotalRating() / getCustomersServed();
        }
        
        public void submitProduct() {
            
        }
        
        public void lose() {
            
        }
        
        public void win() {
            
        }
        
        public void forceEndDay() {
            
        }

        public Product getCurrentOrder() {
            return currentOrder;
        }

        public int getCustomersServed() {
            return customersServed;
        }

        public int getTotalRating() {
            return totalRating;
        }

        public float getAverageRating() {
            return averageRating;
        }
    }
}
