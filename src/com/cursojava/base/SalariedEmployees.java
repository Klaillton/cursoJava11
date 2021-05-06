package com.cursojava.base;

import java.time.LocalDate;

public class SalariedEmployees extends Employees{

    private double weeklySalary;

    public SalariedEmployees(String firstName, String lastName, String socialNumber, LocalDate birthDate, double weeklySalary) {
        super(firstName, lastName, socialNumber, birthDate);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly Salary must be > 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary()+(super.VerifyBirthDay(getBirthDate())?getBonusPay():0.0);
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s %n%s: $%,.2f %n%s",
                super.toString(),
                "weekly salary",
                getWeeklySalary(), super.VerifyBirthDay(getBirthDate())==true?"bonus applied":" ");
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
}
