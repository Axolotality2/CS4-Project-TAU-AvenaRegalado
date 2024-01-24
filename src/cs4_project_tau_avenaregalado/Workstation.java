package cs4_project_tau_avenaregalado;

import java.util.ArrayList;

public class Workstation implements Clickable {
    String name;
    ArrayList<Ingredient> contents;
    String[] useMethod;
    
    public Workstation(String name, String[] useMethods) {
        
    }

    @Override
    public void click() {
        
    }
    
    public void useMethod(String useMethod) {
        
    }
    
    public void insert(Ingredient ingredient) {
        
    }
    
    public Ingredient[] releaseProducts() {
        return (Ingredient[]) contents.toArray();
    }
}
