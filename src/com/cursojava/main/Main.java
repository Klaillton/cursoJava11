package com.cursojava.main;

import com.cursojava.base.Employees;
import com.cursojava.references.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employees> lst = new ArrayList<>();
        lst.addAll(new SalariedReferences().gettList());
        lst.addAll(new HourlyReferences().getHeList());
        lst.addAll(new CommissionedReferences().getCommissionEmployeesArrayList());
        lst.addAll(new BasePlusReference().getBasePlusComissionEmployeeArrayList());
        lst.addAll(new PieceWorkerReference().getPieceWorkers());

        for (Employees employees : lst) {
            System.out.println("\n----==== ++++ || ++++ ====----\n");
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

    }
}
