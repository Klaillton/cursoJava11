package com.cursojava.base;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employees {

    private String firstName;
    private String lastName;
    private String socialNumber;
    private LocalDate birthDate;
    private final double bonusPay = 100.0;

    public Employees(String firstName, String lastName, String socialNumber, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;
        this.birthDate = birthDate;
    }

    protected boolean VerifyBirthDay(LocalDate birthDate){
        return LocalDate.now().getMonth().equals(birthDate.getMonth());
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s %nBirthDay: %s", getFirstName(),
                getLastName(),
                getSocialNumber(),
                getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public double earnings() {
        return 0;
    }

    public double getBonusPay() {
        return bonusPay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
