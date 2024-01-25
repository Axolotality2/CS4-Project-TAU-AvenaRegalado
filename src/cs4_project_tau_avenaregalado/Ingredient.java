package cs4_project_tau_avenaregalado;

public class Ingredient implements Draggable {
    protected final Ingredient[] allergens;
    protected final String name;
    protected final Step[] steps;
    protected final boolean isFood;
    
    // best for raw ingredients   
    public Ingredient (String name, boolean isFood, boolean isAllergen) {
        this.name = name;
        this.steps = new Step[0];
        this.isFood = isFood;
        
        if (isAllergen) 
            this.allergens = new Ingredient[] { this };
        else 
            this.allergens = new Ingredient[0];
    }
    
    public Ingredient (String name, Step[] steps, boolean isFood, Ingredient[] allergens) {
        this.name = name;
        this.steps = steps;
        this.isFood = isFood;
        this.allergens = allergens;
    }

    @Override
    public void drag() {
        
    }

    @Override
    public void click() {
        
    }
}
