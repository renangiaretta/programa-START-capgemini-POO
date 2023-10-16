package ex04;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
    04 - Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
    prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
    térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
    disponibilizar os seguintes métodos:

    a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
       prédio (os elevadores sempre começam no térreo e vazio);
    b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
    e. Desce: para descer um andar (não deve descer se já estiver no térreo);
 */
public class ex04 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        while (true) {
            boolean stopWorking = false;
            try {
                System.out.print("Insira quantos andares tem o prédio: ");
                int maxFloor = lScanner.nextInt();
                System.out.print("Insira a capacidade máxima de pessoas que o elevador suporta: ");
                int capacity = lScanner.nextInt();


                Elevator elevator = new Elevator(maxFloor, capacity);

                while (!stopWorking) {
                    try {
                        System.out.println("Selecione uma das opções");
                        System.out.println("1. Entra uma pessoa no elevador.");
                        System.out.println("2. Sai uma pessoa no elevador.");
                        System.out.println("3. Elevador sobe um andar.");
                        System.out.println("4. Elevador desce um andar.");
                        System.out.println("5. Encerrar.");
                        System.out.println("Opção: ");
                        int choice = lScanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println(elevator.enterPerson());
                                break;
                            case 2:
                                System.out.println(elevator.exitPerson());
                                break;
                            case 3:
                                System.out.println(elevator.upFloor());
                                break;
                            case 4:
                                System.out.println(elevator.downFloor());
                                break;
                            case 5:
                                stopWorking = true;
                                System.out.println("Acabou o expediente. Volte amanhã!");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Selecione uma das opções.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.print((e.getMessage() != null)
                                ? e.getMessage()
                                : "Selecione uma opção válida.");
                        lScanner.nextLine();
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Os dados inseridos são inválidos.");
                lScanner.nextLine();
            }
        }
    }
}
