package ex03;

/*
    03 - Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
    seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
    atributos a classes deve conter os seguintes métodos.

    a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
    litros que foi colocada no veículo
    b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
    valor a ser pago pelo cliente.
    c. alterarValor; //altera o valor do litro do combustível.
    d. alterarCombustivel; //altera o tipo do combustível.
    e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        boolean validFuelChoice = false;
        String fuelType = "";
        double fuelPrice = 0;
        double fuelQuantity = 0;

        while (true) {
            try {
                while (!validFuelChoice) {
                    try {
                        System.out.println("Selecione o tipo de combustível:");
                        System.out.println("1. Álcool");
                        System.out.println("2. Gasolina");
                        System.out.println("1. Diesel");
                        System.out.print("Opção: ");
                        int choice = lScanner.nextInt();

                        switch (choice) {
                            case 1:
                                fuelType = "Álcool";
                                validFuelChoice = true;
                                break;
                            case 2:
                                fuelType = "Gasolina";
                                validFuelChoice = true;
                                break;
                            case 3:
                                fuelType = "Diesel";
                                validFuelChoice = true;
                                break;
                            default:
                                System.out.println("Opção inválida. Selecione 1, 2 ou 3.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println((e.getMessage() != null
                                ? e.getMessage()
                                : "Selecione uma das opções."));
                        lScanner.nextLine();
                    }
                }
                System.out.print("Digite o preço do litro em R$: ");
                fuelPrice = lScanner.nextDouble();

                System.out.print("Digite a quantidade de combustível na bomba em litros: ");
                fuelQuantity = lScanner.nextDouble();

                FuelPump newPump = new FuelPump(fuelType, fuelPrice, fuelQuantity);

                boolean validWayToFuel = false;

                while (!validWayToFuel) {
                    int wayToFuel = 0;
                    try {
                        int choice = 0;
                        System.out.println("Como deseja abastecer?");
                        System.out.println("1. Abastecer por valor.");
                        System.out.println("2. Abastecer por litros.");
                        System.out.print("Opção: ");
                        choice = lScanner.nextInt();

                        switch (choice) {
                            case 1:
                                wayToFuel = 1;
                                validWayToFuel = true;
                                break;
                            case 2:
                                wayToFuel = 2;
                                validWayToFuel = true;
                                break;
                            default:
                                System.out.print("Selecione uma das opções.");
                        }
                        if (wayToFuel == 1) {
                            System.out.print("Insira o valor em R$: ");
                            double amount = lScanner.nextDouble();
                            System.out.println(newPump.refuelByValue(amount));
                        } else {
                            System.out.print("Insira quantos litros deseja abastecer: ");
                            double amount = lScanner.nextDouble();
                            System.out.println(newPump.refuelByLiters(amount));
                        }

                    } catch (InputMismatchException e) {
                        System.out.println((e.getMessage() != null)
                                ? e.getMessage()
                                : "O valor inserido é inválido.");
                        lScanner.nextLine();
                    }
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Informe um valor válido.");
                lScanner.nextLine();
            }
        }
    }
}
