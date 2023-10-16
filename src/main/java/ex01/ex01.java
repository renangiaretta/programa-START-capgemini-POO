package ex01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        Person personObj = new Person("Petr", "22/10/1992", 1.86);
        System.out.println(personObj.getData());
    }
}
