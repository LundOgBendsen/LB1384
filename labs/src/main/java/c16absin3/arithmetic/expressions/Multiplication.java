package c16absin3.arithmetic.expressions;

public class Multiplication implements Expression {

    private Expression e1, e2;

    public Multiplication(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public String toString() {
        return "(" + e1 + " * " + e2 + ")";
    }

    public double calculate() {
        return e1.calculate() * e2.calculate();
    }
}
