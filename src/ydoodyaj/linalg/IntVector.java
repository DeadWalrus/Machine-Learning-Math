package ydoodyaj.linalg;

import java.util.List;
import java.util.ArrayList;
public class IntVector implements Vector{
    private List<Integer> elements;

    public IntVector(){
        this.elements = new ArrayList<>();
    }
    public IntVector(int numElements){
        this();
        this.elements = new ArrayList<>(numElements);
    }
    public IntVector(List<Integer> elementList){
        this();
        this.elements = elementList;
    }
    @Override
    public void add(Vector v) {

    }

    @Override
    public void subtract(Vector v) {

    }

    @Override
    public void elementDivide(Vector v) {

    }

    @Override
    public void elementMiltiply(Vector v) {

    }

    @Override
    public double dotProduct(Vector v) {
        return 0;
    }

    @Override
    public Vector crossProduct(Vector v) {
        return null;
    }

    public int getNumElements(){
        return this.elements.size();
    }
    // Returns the ith element from this vector
    public int getVectorElement(int index){
        return (int)this.elements.get(index);
    }
}
