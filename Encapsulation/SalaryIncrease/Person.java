package Encapsulation.SalaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary (double bonus) {
        bonus = bonus / 100;
        double modifier = 1;
        if (this.getAge() < 30) {
            modifier += bonus  / 2;
        } else {
            modifier += bonus ;
        }
        this.setSalary(this.getSalary() * modifier);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva"
                ,getFirstName()
                ,getLastName(),
                new DecimalFormat("#.0#####").format(this.getSalary()));
    }
}
