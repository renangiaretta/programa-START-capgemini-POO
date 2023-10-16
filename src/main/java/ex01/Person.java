package ex01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
    private String name;
    private LocalDate birthdate;
    private double height;

    public Person (String name, String stringBirthdate, double height){
        this.name = name;
        setBirthdate(stringBirthdate);
        this.height = height;
        calculateAge();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthdate(String stringBirthdate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        this.birthdate = LocalDate.parse(stringBirthdate, formatter);
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getHeight() {
        return this.height;
    }

    public String getData() {
        return "Name: " + this.name
                + "\nBirthdate: " + this.birthdate
                + "\nHeight: " + this.height
                + "\nage: " + calculateAge();
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthdate, currentDate).getYears();
    }
}
