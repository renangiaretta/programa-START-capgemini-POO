package ex05;

public class Discipline {
    private Student[] students;

    public Discipline(Student[] students) {
        this.students = students;
    }

    public String calculateStudentsMedia() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            String status = "";
            if (students[i].calculateMedia() >= 70) {
                status = "aprovado.";
            } else if (students[i].calculateMedia() >= 40 && students[i].calculateMedia() < 70) {
                status = "em recuperação.";
            } else {
                status = "reprovado.";
            }
            result.append("\nO aluno ").append(students[i].getName())
                    .append(" ficou com média ")
                    .append(students[i].calculateMedia())
                    .append(" e está ")
                    .append(status);
        }
        return result.toString();
    }

    public String calculateStudentsFinal() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            if (students[i].calculateFinal() != 0) {
                result.append("\nO aluno ")
                        .append(students[i].getName())
                        .append(" precisa de ")
                        .append(students[i].calculateFinal())
                        .append(" na prova final para ser aprovado.");
            }
        }
        return result.toString();
    }
}
