package c17absin3.arithmetic.expressions;

public class Number implements Expression {

    private double number;

    public Number(double number) {
        this.number = number;
    }

    public String toString() {
        return "" + number;
    }

    public double calculate() {
        return number;
    }
}
