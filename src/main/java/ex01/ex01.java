package ex01;

import java.util.Scanner;

/*
    01 - Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
    altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
    todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
 */

public class ex01 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        Person personObj = new Person("Petr", "22/10/1992", 1.86);
        System.out.println(personObj.getData());
    }
}
