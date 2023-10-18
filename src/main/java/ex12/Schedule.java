package ex12;

import javax.naming.NameNotFoundException;
import java.util.*;

public class Schedule {
    private ArrayList<PersonOnSchedule> persons = new ArrayList<>();

    public Schedule() {

    }

    public void addPerson(PersonOnSchedule person) {
        persons.add(person);
    }

    public void removePerson(String person) {
        Optional<PersonOnSchedule> findPerson = persons.stream()
                .filter(el -> el.getName().equals(person)).findFirst();
        findPerson.ifPresent(persons::remove);
        if (!findPerson.isPresent()) {
            throw new InputMismatchException("Nome não encontrado.");
        }
    }

    public int findPerson(String person) {
        Optional<PersonOnSchedule> search = persons.stream()
                .filter(el -> el.getName().equals(person)).findFirst();
        if (search.isPresent()) {
            return persons.indexOf(search.get()) + 1;
        } else {
            throw new InputMismatchException("Nome não encontrado.");
        }
    }

    public void getData() {
        for (PersonOnSchedule person : persons) {
            String data = "\nNome: " +
                    person.getName() +
                    "\nIdade: " +
                    person.getAge() +
                    " anos." +
                    "\nAltura\n: " +
                    person.getHeight() +
                    "cm.";
            System.out.println(data);
        }
    }

    public void getPersonData(int index) {
        int positionIndex = index - 1;
        if (positionIndex >= 0 && positionIndex < persons.size()) {
            PersonOnSchedule person = persons.get(positionIndex);
            String data = "\nNome: " +
                    person.getName() +
                    "\nIdade: " +
                    person.getAge() +
                    " anos." +
                    "\nAltura: " +
                    person.getHeight() +
                    "cm.";

            System.out.println(data);
        } else {
            throw new InputMismatchException("Pessoa não encontrada.");
        }
    }
}
