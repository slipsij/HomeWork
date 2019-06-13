package ru.snatkin.task22;


import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public int compareName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareAge(Person a, Person b) {
        if (a.getAge() > b.getAge()){
            return 1;
        } else if (a.getAge() < b.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (compareAge(o1, o2) == 0) {
            return compareName(o1, o2);
        } else {
            return compareAge(o1, o2);
        }
    }
}