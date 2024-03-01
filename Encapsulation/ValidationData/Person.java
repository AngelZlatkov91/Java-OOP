package Encapsulation.ValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
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
        if (firstName != null && firstName.length() < 3) {
            throw  new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() < 3) {
            throw  new IllegalArgumentException("Last  name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw  new IllegalArgumentException("Age cannot ne zero or negative number");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 460) {
            throw  new IllegalArgumentException("Salary cannot be less than 460 leva");

        }
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
