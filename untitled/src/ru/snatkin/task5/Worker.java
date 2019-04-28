package ru.snatkin.task5;

public class Worker extends Person {
    private int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Salary=" + Salary +
                '}';
    }
}
