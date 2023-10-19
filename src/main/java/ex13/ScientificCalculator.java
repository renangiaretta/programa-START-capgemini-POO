package ex13;

public class ScientificCalculator extends Calculator{

    public ScientificCalculator(double num1, double num2, String operator) {
        super(num1, num2, operator);
    }

    public double squareRoot () {
        return this.num1 * this.num1;
    }
    public double pow () {
        return Math.pow(this.num1, this.num2);
    }
}
