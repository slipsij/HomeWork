

package ru.snatkin.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<PersonSimple> peopleSimple = new ArrayList<>();
        peopleSimple.add(new PersonSimple("Tom"));
        peopleSimple.add(new PersonSimple("Nick"));
        peopleSimple.add(new PersonSimple("Alice"));
        peopleSimple.add(new PersonSimple("Bill"));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        people.add(new Person("Alice"));
        people.add(new Person("Bill"));

        iterate(people);

        for (PersonSimple personSimple : peopleSimple) {
            System.out.println(personSimple.getName());
        }
        System.out.println();
        System.out.println("Simple people list");
        System.out.println();

        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println();
        System.out.println("People list");
        System.out.println();

        Collections.sort(people);
        Collections.sort(peopleSimple, new PersonComparator());

        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println();
        System.out.println("Sorted Simple people list");
        System.out.println();

        for (PersonSimple person : peopleSimple) {
            System.out.println(person.getName());
        }
        System.out.println();
        System.out.println("Sorted people list");
    }

    private static void iterate(List<Person> people) {
        Iterator i = people.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.print(" : ");
        }
        System.out.println();
    }
}
