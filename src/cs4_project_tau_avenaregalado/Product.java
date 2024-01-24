package cs4_project_tau_avenaregalado;

public class Product implements Draggable {
    private String name;
    private Step[] steps;
    private boolean isFood;
    
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

    public boolean isIsFood() {
        return isFood;
    }
}
