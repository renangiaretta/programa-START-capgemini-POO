package ex05;

/*
    Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
    classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
    Escreva os seguintes métodos para esta classe:

    a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
    b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int studentsOnDiscipline = 0;

        System.out.print("Insira a quantidade de alunos matriculados na disciplina: ");
        studentsOnDiscipline = lScanner.nextInt();
        lScanner.nextLine();
        Student[] registeredStudents = new Student[studentsOnDiscipline];
        while (true) {
            try {
                for (int i = 0; i < studentsOnDiscipline; i++) {
                    double[] grades = new double[studentsOnDiscipline];
                    System.out.print("Digite o nome do aluno " + (i + 1) + "/" + studentsOnDiscipline + ": ");
                    String studentName = lScanner.nextLine();
                    System.out.print("Digite a nota da prova 1: ");
                    grades[0] = lScanner.nextInt();
                    System.out.print("Digite a nota da prova 2: ");
                    grades[1] = lScanner.nextInt();
                    System.out.print("Digite a nota do trabalho: ");
                    int homeWorkGrade = lScanner.nextInt();
                    lScanner.nextLine();
                    if (grades[i] > 100 || grades[i] < 0 || homeWorkGrade > 100 || homeWorkGrade < 0) {
                        throw new InputMismatchException("As notas devem estar entre 0 e 100.");
                    }
                    registeredStudents[i] = new Student(studentName, grades, homeWorkGrade);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "O valor inserido é inválido.");
            }
        }

        Discipline discipline = new Discipline(registeredStudents);
        boolean finish = false;
        while (!finish) {
            try {
                System.out.println("\nO que deseja fazer?");
                System.out.println("1. Calcular as médias.");
                System.out.println("2. Verificar resultado final dos alunos.");
                System.out.println("3. Encerrar.");
                System.out.print("Opção: ");
                int choice = lScanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(discipline.calculateStudentsMedia());
                        break;
                    case 2:
                        System.out.println(discipline.calculateStudentsFinal());
                        break;
                    case 3:
                        finish = true;
                        break;
                    default:
                        System.out.println("Escolha uma das opções.");
                }
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "O valor inserido é inválido.");
                lScanner.nextLine();
            }
        }
    }
}
