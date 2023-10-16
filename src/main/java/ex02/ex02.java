package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    02 - Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
    número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
    saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */

public class ex02 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o nome do cliente: ");
                String personName = lScanner.nextLine();

                System.out.print("Digite o saldo inicial em R$: ");
                double initialBalance = lScanner.nextDouble();
                if (initialBalance >= 0) {
                    CheckingAccount account01 = new CheckingAccount(personName, initialBalance);
                    System.out.println("\nConta criada com sucesso!" + account01.getData());
                } else {
                    throw new InputMismatchException("Não é possível iniciar uma conta com saldo negativo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                ? e.getMessage()
                        : "Os dados fornecidos são inválidos.");
                lScanner.nextLine();
            }
        }
    }
}
