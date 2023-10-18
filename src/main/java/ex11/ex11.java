package ex11;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    11 - Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor. Crie uma
    classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um método que retorne o
    valor do ingresso VIP (com o adicional incluído). Crie um programa para criar as instâncias de Ingresso e
    IngressoVIP, mostrando a diferença de preços.
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        boolean stopChosing = false;
        double price = 0;
        Ticket ticket = new Ticket(0d);

        try {
            System.out.print("Insira o valor do ingresso comum em RS: ");
            price = lScanner.nextDouble();
            ticket.setPrice(price);
        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido");
        }
        VipTicket vipTicket = new VipTicket(ticket.getPrice());
        while (!stopChosing) {
            try {
                System.out.println("1. Verificar o valor do ingresso comum.");
                System.out.println("2. Verificar o valor do ingresso VIP.");
                System.out.println("3. Encerrar.");
                System.out.print("Opção: ");
                int choice = lScanner.nextInt();
                switch (choice) {
                    case 1:
                        ticket.printValue();
                        break;
                    case 2:
                        vipTicket.printValue();
                        break;
                    case 3:
                        stopChosing = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Escolha uma das opções.");
                lScanner.nextLine();
            }
        }
    }
}
