package Sequence;

import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;
    
    // getter & setter
    public ArrayList<Integer> getValues() {
        return values;
    }
    
    // constructor
    public Sequence() {
        values = new ArrayList<Integer>();
    }
    
    // toString
    public String toString() {
        return values.toString();
    }
    
    // method    
    public void add(int n) {
        values.add(n);       
    }
    public Sequence merge(Sequence other) {
        ArrayList<Integer> first = this.values;
        ArrayList<Integer> second = other.getValues(); //?
        Sequence result = new Sequence();
        
        int max = Math.max(first.size(), second.size());
        
        for (int i = 0; i < max; i++) {
            if (i < first.size()) {
                result.add(first.get(i));
            }
            if (i < second.size()) {
                result.add(second.get(i));
                
            }
        }
        return result;
        
    }
}
