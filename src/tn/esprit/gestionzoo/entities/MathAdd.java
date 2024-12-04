package tn.esprit.gestionzoo.entities;

public class MathAdd implements MathOperation{
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
