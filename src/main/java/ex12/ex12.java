package ex12;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
    12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
    operações:
    a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
    b. void removerPessoa(String nome); //remove a pessoa do array
    c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
    d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
    e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        Schedule schedule = new Schedule();
        boolean manageSchedule = false;
        while (!manageSchedule) {
            try {
                System.out.println("O que deseja fazer?");
                System.out.println("1. Adicionar pessoa.");
                System.out.println("2. Remover pessoa.");
                System.out.println("3. Buscar pessoa.");
                System.out.println("4. Imprimir agenda.");
                System.out.println("5. Imprimir pessoa.");
                System.out.println("6. Encerrar.");
                System.out.print("Opção: ");
                int choice = lScanner.nextInt();
                lScanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Digite o nome da pessoa: ");
                        String name = lScanner.nextLine();
                        System.out.print("Digite a idade da pessoa: ");
                        int age = lScanner.nextInt();
                        System.out.print("Digite a altura da pessoa em cm: ");
                        int height = lScanner.nextInt();
                        PersonOnSchedule newPerson = new PersonOnSchedule(name, age, height);
                        schedule.addPerson(newPerson);
                        System.out.println("Pessoa adicionada com sucesso.");
                        break;
                    case 2:
                        System.out.print("Digite o nome da pessoa que deseja remover: ");
                        String nameToRemove = lScanner.nextLine();
                        schedule.removePerson(nameToRemove);;
                        System.out.println("Pessoa removida com sucesso.");
                        break;
                    case 3:
                        System.out.print("Digite o nome da pessoa: ");
                        String nameToFind = lScanner.nextLine();
                        int position = schedule.findPerson(nameToFind);
                        System.out.print(nameToFind + "Está na posição " + position + " da agenda.");
                        break;
                    case 4:
                        schedule.getData();
                        break;
                    case 5:
                        System.out.print("Digite a posição da pessoa na agenda: ");
                        int positionOnSchedule = lScanner.nextInt();
                        schedule.getPersonData(positionOnSchedule);
                        break;
                    case 6:
                        manageSchedule = true;
                }
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Valor inválido.");
            }
        }
    }
}