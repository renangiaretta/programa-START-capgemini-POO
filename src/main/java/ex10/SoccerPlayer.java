package ex10;

import java.time.LocalDate;
import java.time.Period;

public class SoccerPlayer {
    private String name;
    private String position;
    private LocalDate birthdate;
    private String nationality;
    private int height;
    private float weight;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public int getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getData() {
        return "\nnome: " +
                name +
                "\nposição: " +
                position +
                "\nData de nascimento: " +
                birthdate +
                "\nNacionalidade: " +
                nationality +
                "\nAltura" +
                height +
                "\nPeso: " +
                weight;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.birthdate, today);
        return period.getYears();
    }

    public int getTimeToRetire() {
        int age = getAge();
        return switch (this.position) {
            case "defesa" -> 40 - age;
            case "meio campo" -> 38 - age;
            case "atacante" -> 35 - age;
            default -> throw new IllegalArgumentException();
        };
    }
}
