package com.cursojava.main;

import com.cursojava.base.Employees;
import com.cursojava.references.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employees> lst = getEmployees();

        for (Employees employees : lst) {
            System.out.println("\n----==== ++++ || ++++ ====----\n");
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

    }

    private static ArrayList<Employees> getEmployees() {
        ArrayList<Employees> lst = new ArrayList<>();

        lst.addAll(new SalariedReferences().getList());
        lst.addAll(new HourlyReferences().getList());
        lst.addAll(new CommissionedReferences().getList());
        lst.addAll(new BasePlusReference().getList());
        lst.addAll(new PieceWorkerReference().getList());
        return lst;
    }
}
