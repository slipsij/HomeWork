package ru.snatkin.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom",4));
        people.add(new Person("Nick",4));
        people.add(new Person("Alice",3));
        people.add(new Person("Tom",2));


        Collections.sort(people, new PersonComparator());

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
