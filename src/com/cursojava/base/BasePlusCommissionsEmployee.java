package com.cursojava.base;

import java.time.LocalDate;

public class BasePlusCommissionsEmployee extends CommissionEmployees{

    private double baseSalary;

    public BasePlusCommissionsEmployee(String firstName, String lastName, String socialNumber, LocalDate birthDate, double grossSales, double comissonRate, double baseSalary) {
        super(firstName, lastName, socialNumber, birthDate, grossSales, comissonRate);

        if(baseSalary <= 0.0){
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        }

        if(comissonRate >= 1.0){
            throw new IllegalArgumentException("CommissionRate must be less than 1.0");
        }

        this.baseSalary = baseSalary;
    }


    @Override
    public double earnings() {
        return baseSalary + (super.VerifyBirthDay(getBirthDate())?getBonusPay():0.0) + super.earnings();
    }

    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f %n%s",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary(),
                super.VerifyBirthDay(getBirthDate())?"bonus applied":" ");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
