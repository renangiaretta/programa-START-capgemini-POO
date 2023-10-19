package ex13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        label:
        while (true) {
            try {
                System.out.print("Digite um número: ");
                double num1 = lScanner.nextDouble();
                lScanner.nextLine();
                System.out.print("Digite o sinal da operação aritmética: ");
                String operator = lScanner.nextLine();
                double num2 = 0;
                if (!operator.equals("²")) {
                    System.out.print("Digite um número: ");
                    num2 = lScanner.nextDouble();
                }
                Calculator calculator = new Calculator(num1, num2, operator);
                ScientificCalculator scientificCalculator = new ScientificCalculator(num1, num2, operator);
                switch (operator) {
                    case "+":
                        System.out.println("Resultado: " + calculator.sum());
                        break label;
                    case "-":
                        System.out.println("Resultado: " + calculator.subtraction());
                        break label;
                    case "*":
                        System.out.println("Resultado: " + calculator.multiplication());
                        break label;
                    case "/":
                        System.out.println("Resultado: " + calculator.division());
                        break label;
                    case "²":
                        System.out.println("Resultado: " + scientificCalculator.squareRoot());
                        break label;
                    case "^":
                        System.out.println("Resultado: " + scientificCalculator.pow());
                        break label;
                }
            } catch (InputMismatchException | ArithmeticException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Insira um valor válido.");
            }
        }
    }
}
