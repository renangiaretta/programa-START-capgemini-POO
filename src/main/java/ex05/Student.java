package ex05;

import java.util.UUID;

public class Student {

    private UUID registration;
    private String name;
    private double[] testGrades;
    private int homeWorkGrade;
    public Student (String name, double[] testGrades, int homeWorkGrade) {
        this.registration = UUID.randomUUID();
        this.name = name;
        this.testGrades = testGrades;
        this.homeWorkGrade = homeWorkGrade;
    }

    public UUID getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public double[] getTestGrades() {
        return testGrades;
    }

    public int getHomeWorkGrade() {
        return homeWorkGrade;
    }

    public void setRegistration(UUID registration) {
        this.registration = registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestGrades(double[] testGrades) {
        this.testGrades = testGrades;
    }

    public void setHomeWorkGrade(int homeWorkGrade) {
        this.homeWorkGrade = homeWorkGrade;
    }

    public double calculateMedia () {
        double totalGrades = ((((this.testGrades[0] + this.testGrades[1]) * 2.5) + (this.homeWorkGrade * 2)));
        double media = totalGrades / 7;
        return Math.round(media);
    }

    public double calculateFinal () {
        if (this.calculateMedia() < 40 || this.calculateMedia() >= 70) {
            return 0;
        } else {
            return Math.round(((70 - this.calculateMedia()) + 70));
        }
    }
}
