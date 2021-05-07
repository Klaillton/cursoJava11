package com.cursojava.references;

import com.cursojava.base.CommissionEmployees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommissionedReferences implements GetList<ArrayList<CommissionEmployees>> {

    private double commissionRate = 0.4;

    ArrayList<CommissionEmployees> commissionEmployeesArrayList = new ArrayList<>(List.of(
       new CommissionEmployees("Fernanda", "Vieira", "123456",
               LocalDate.of(1982,8,25), 1300, commissionRate),
       new CommissionEmployees("Bruna", "Oliveira", "123456",
               LocalDate.of(1993,2,14), 900, commissionRate),
       new CommissionEmployees("Rafael", "Olivença", "123456",
               LocalDate.of(1986,12,10), 1012, commissionRate),
       new CommissionEmployees("Claudia", "Fagundes", "123456",
               LocalDate.of(1987,1,2), 1189, commissionRate)
    ));


    @Override
    public ArrayList<CommissionEmployees> getList() {
        return commissionEmployeesArrayList;
    }
}
