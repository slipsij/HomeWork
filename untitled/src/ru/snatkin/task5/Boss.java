package ru.snatkin.task5;

public class Boss extends Person {
    private int salary;

    @Override
    public String toString() {
        return "Boss{" +
                "salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
