package cs4_project_tau_avenaregalado;

public class Product extends Ingredient implements Draggable {

    public static final Product[] possibleOrders = new Product[]{};
    private final int complexity;
    private final Step[] steps;

    public Product(String name, int complexity, Step[] steps, boolean isFood, Ingredient[] allergens) {
        super(name, allergens, isFood);
        
        this.complexity = complexity;
        this.steps = steps;
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
