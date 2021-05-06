package com.cursojava.base;

import java.time.LocalDate;

public class PieceWorker extends Employees{

    /**
     * wage per piece
     */
    private double wage;

    /**
     * number of pieces produced
     */
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialNumber, LocalDate birthDate, double wage, int pieces) {
        super(firstName, lastName, socialNumber, birthDate);
        this.wage = wage;
        this.pieces = pieces;

        if(wage <= 0.0){
            throw new IllegalArgumentException("Wage must be > 0.0");
        }

        if(pieces < 0){
            throw new IllegalArgumentException("Pieces must be > 0");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %n%s: $%,.2f %n%s",
                super.toString(),
                "PiecesWorker Salary",earnings(), super.VerifyBirthDay(getBirthDate())==true?"bonus applied":" ");
    }

    @Override
    public double earnings() {
        return getPieces() * getWage()+(super.VerifyBirthDay(getBirthDate())?getBonusPay():0.0);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
