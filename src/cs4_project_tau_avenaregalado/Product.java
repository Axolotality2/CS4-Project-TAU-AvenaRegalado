package cs4_project_tau_avenaregalado;

public class Product extends Ingredient implements Draggable {

    public static final Product[] possibleOrders = new Product[]{};
    private final int complexity;
    

    public Product(String name, Step[] steps, boolean isFood, Ingredient[] allergens, int complexity) {
        super(name, steps, isFood, allergens);
        
        this.complexity = complexity;
    }

    @Override
    public void click() {

    }

    @Override
    public void drag() {

    }

    public String getName() {
        return name;
    }

    public Step[] getSteps() {
        return steps;
    }

    public boolean isFood() {
        return isFood;
    }

    public int getComplexity() {
        return complexity;
    }

    public Ingredient[] getAllergens() {
        return allergens;
    }
}
