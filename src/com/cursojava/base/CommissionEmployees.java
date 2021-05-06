package com.cursojava.base;

import java.time.LocalDate;

public class CommissionEmployees extends Employees{

    private double grossSales;
    private double comissonRate;

    public CommissionEmployees(String firstName, String lastName, String socialNumber, LocalDate birthDate, double grossSales, double comissonRate) {
        super(firstName, lastName, socialNumber, birthDate);

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales must be > 0.0");
        }

        if(comissonRate <= 0.0 || comissonRate >= 1.0){
            throw new IllegalArgumentException("Comission Rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.comissonRate = comissonRate;

    }

    @Override
    public double earnings() {
        return (getGrossSales() * getComissonRate()) + (super.VerifyBirthDay(getBirthDate())?getBonusPay():0.0);
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f %n%s",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getComissonRate(),
                super.VerifyBirthDay(getBirthDate())?"bonus applied":" ");
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getComissonRate() {
        return comissonRate;
    }

    public void setComissonRate(double comissonRate) {
        this.comissonRate = comissonRate;
    }
}
