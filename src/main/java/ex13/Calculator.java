package ex13;

public class Calculator {
    double num1;
    double num2;
    String operator;
    public Calculator (double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
    public double sum () {
        return this.num1 + this.num2;
    }
    public double multiplication () {
        return this.num1 * this.num2;
    }
    public double subtraction () {
        return this.num1 - this.num2;
    }
    public  double division () {
        if(num2 != 0) {
            return this.num1 / this.num2;
        } else {
            throw new ArithmeticException("Não pode dividir por 0.");
        }
    }
}
