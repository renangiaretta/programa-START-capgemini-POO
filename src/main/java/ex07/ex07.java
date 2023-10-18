package ex07;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    7 - A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
    três informações a seguir como atributos:
    a. um primeiro nome,
    b. um sobrenome
    c. um salário mensal
    Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
    cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
    que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
    instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
    empregado.
 */
public class ex07 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        Employee employee1 = new Employee("João", "Grilo", 1000.0f);
        Employee employee2 = new Employee("Chicó", "Duarte", 500.0f);
        while (true) {
            try {
                boolean keepChosing = true;
                while (keepChosing) {
                    System.out.println("Escolha uma das opções");
                    System.out.println("1. Verificar salários.");
                    System.out.println("2. Conceder aumento de 10%.");
                    System.out.println("3. Encerrar");
                    System.out.print("Opção: ");
                    int choice = lScanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Salário dos funcionários:");
                            System.out.println("\nFuncionário "
                                    + employee1.getFirstName()
                                    + " "
                                    + employee1.getLastName()
                                    + " R$ "
                                    + employee1.getMonthWage()
                                    + ".");
                            System.out.println("Funcionário "
                                    + employee2.getFirstName()
                                    + " "
                                    + employee2.getLastName()
                                    + " R$ "
                                    + employee2.getMonthWage()
                                    + ".\n");
                            break;
                        case 2:
                            employee1.setMonthWage(10f);
                            employee2.setMonthWage(10f);
                            System.out.println("\nOs funcionários receberam um aumento de 10%.");
                            break;
                        case 3:
                            keepChosing = false;
                            break;
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Escolha uma das opções.");
            }
        }
    }
}
