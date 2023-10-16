package ex04;

import java.util.InputMismatchException;

public class Elevator {
    private int floor;
    private final int maxFloor;
    private final int capacity;
    private int peopleInside;

    public Elevator(int maxFloor, int capacity) {
        this.maxFloor = maxFloor;
        this.capacity = capacity;
        this.floor = 0;
        this.peopleInside = 0;
    }

    public int getFloor() {
        return floor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPeopleInside() {
        return peopleInside;
    }

    public String enterPerson() {
        if (peopleInside == capacity) {
            return "\nElevador cheio!\n" + "Aguarde para entrar.\n";
        } else {
            this.peopleInside = peopleInside + 1;
            return "\nUma pessoa entrou no elevador.\n";
        }
    }

    public String exitPerson() {
        if (peopleInside == 0) {
            return "\nO elevador está vazio!\n";
        } else {
            this.peopleInside = peopleInside - 1;
            return "\nUma pessoa saiu do elevador.\n";
        }
    }

    public String upFloor () {
        if (floor < maxFloor) {
            floor = floor + 1;
            return "\nO elevador subiu um andar.\n";
        } else {
            return "\nO elevador já está no último andar.\n";
        }
    }

    public String downFloor () {
        if (floor>0) {
            floor = floor - 1;
            return "\nO elevador desceu um andar.\n";
        } else {
            return "\nO elevador está no térreo, não é possível descer.\n";
        }
    }
}
