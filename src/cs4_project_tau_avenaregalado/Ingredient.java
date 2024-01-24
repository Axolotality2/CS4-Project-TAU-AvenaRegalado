package cs4_project_tau_avenaregalado;

public class Ingredient implements Draggable {
    protected final Ingredient[] allergens;
    protected final String name;
    protected final boolean isFood;
    
    public Ingredient (String name, Ingredient[] allergens, boolean isFood) {
        this.name = name;
        this.allergens = allergens;
        this.isFood = isFood;
    }
    
    public Ingredient (String name, boolean isFood) {
        this(name, new Ingredient[0], isFood);
    }

    @Override
    public void drag() {
        
    }

    @Override
    public void click() {
        
    }
}
