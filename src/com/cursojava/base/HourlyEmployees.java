package com.cursojava.base;

import java.time.LocalDate;

public class HourlyEmployees extends Employees {

    private double hourlyWage;
    private double numberOfHours;

    public HourlyEmployees(String firstName, String lastName, String socialNumber, LocalDate birthDate, double hourlyWage, double numberOfHours) {
        super(firstName, lastName, socialNumber, birthDate);

        if (hourlyWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        if (numberOfHours < 0.0 || numberOfHours > 168) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168");
        }

        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double earnings() {
        if (getNumberOfHours() <= 40) {
            return (getHourlyWage() * getNumberOfHours()) + (super.VerifyBirthDay(this.getBirthDate())?getBonusPay():0.0);
        }
        return (40 * getHourlyWage() + ((getNumberOfHours() - 40) * getHourlyWage() * 1.5)) + (super.VerifyBirthDay(getBirthDate())?getBonusPay():0.0);
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f %n%s",
                super.toString(), "hourly wage",
                getHourlyWage(), "hours worked",
                getNumberOfHours(),
                super.VerifyBirthDay(getBirthDate())?"bonus applied":" ");
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }


}
