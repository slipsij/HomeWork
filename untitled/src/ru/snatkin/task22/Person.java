package ru.snatkin.task22;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compare(Person p) {
        return name.compareTo(p.getName());
    }

    public int compareAge(Person r) {

        if (this.age > r.getAge()){
            return 1;
        } else if (this.age < r.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int AgeResult = compareAge(o);
        if  (AgeResult == 0) {
            return compare(o);
        }
        return AgeResult;
    }
}

