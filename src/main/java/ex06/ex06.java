package ex06;
 /*
    6 - Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
    representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
    como atributos:
    a. o número do item faturado,
    b. a descrição do item,
    c. a quantidade comprada do item e
    d. o preço unitário do item.
  */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        while (true) {
            boolean keepChosing = true;
            try {
                System.out.print("Digite o número do item: ");
                int itemNumber = lScanner.nextInt();
                lScanner.nextLine();
                System.out.print("Digite a descrição do item: ");
                String itemDescription = lScanner.nextLine();
                System.out.print("Digite a quantidade comprada: ");
                int itemQuantity = lScanner.nextInt();
                System.out.print("Digite o preço unitário do item: ");
                double itemUnitPrice = lScanner.nextDouble();

                Invoice invoice = new Invoice(itemNumber, itemDescription, itemQuantity, itemUnitPrice);
                while (keepChosing) {
                    try {
                        int chosenChoice = 0;
                        System.out.println("\nO que deseja fazer?");
                        System.out.println("1. Verificar o número do item.");
                        System.out.println("2. Alterar o número do item.");
                        System.out.println("3. Verificar a descrição do item.");
                        System.out.println("4. Alterar a descrição do item.");
                        System.out.println("5. Verificar a quantidade comprada do item.");
                        System.out.println("6. Alterar a quantidade comprada do item.");
                        System.out.println("7. Verificar o preço unitário do item.");
                        System.out.println("8. Alterar o preço unitário do item.");
                        System.out.println("9. Verificar o valor total da compra.");
                        System.out.println("10. Encerrar.");
                        System.out.print("Opção: ");
                        int choice = lScanner.nextInt();
                        lScanner.nextLine();
                        switch (choice) {
                            case 1:
                                System.out.println("\nO número do item é " + invoice.getItemNumber() + ".");
                                break;
                            case 2:
                                System.out.print("Digite um novo número para o item: ");
                                int newItemNumber = lScanner.nextInt();
                                invoice.setItemNumber(newItemNumber);
                                System.out.println("\nO número do item foi atualizado com sucesso.");
                                break;
                            case 3:
                                System.out.println("\nA descrição do item é: " + invoice.getItemDescription());
                                break;
                            case 4:
                                System.out.print("Digite uma nova descrição para o item: ");
                                String newItemDescription = lScanner.nextLine();
                                invoice.setItemDescription(newItemDescription);
                                System.out.println("\nA descrição do item foi atualizada com sucesso.");
                                break;
                            case 5:
                                System.out.println("\nA quantidade do item é: " + invoice.getItemQuantity());
                                break;
                            case 6:
                                System.out.print("Digite uma nova quantidade para o item: ");
                                int newItemQuantity = lScanner.nextInt();
                                invoice.setItemQuantity(newItemQuantity);
                                System.out.println("A quantidade do item foi atualizada com sucesso.");
                                break;
                            case 7:
                                System.out.println("\nO preço unitário do item é R$ " + invoice.getItemUnitPrice());
                                break;
                            case 8:
                                System.out.print("Digite um novo preço unitário para o item: ");
                                double newItemUnitPrice = lScanner.nextDouble();
                                invoice.setItemUnitPrice(newItemUnitPrice);
                                System.out.println("\nO preço unitário do item foi atualizado com sucesso.");
                                break;
                            case 9:
                                System.out.println("\nO valor total da compra foi de R$: "
                                        + invoice.getInvoiceAmount()
                                        + ".");
                                break;
                            case 10:
                                keepChosing = false;
                                break;

                            default:
                                System.out.println("Selecione uma das opções.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Selecione uma das opções.");
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("O valor inserido é inválido. Tente novamente.");
            }
        }
    }
}
