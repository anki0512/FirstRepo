package com.sunbeam;
class Employeee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    public Employeee(String firstName, String lastName, double monthlySalary) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}

public class Employee {
    public static void main(String[] args) {
       
        Employeee emp1 = new Employeee("Aditya", "Dev", 3000);
        Employeee emp2 = new Employeee("omkar", "bhagat", 4000);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("After 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary());
    }
}