package com.cursojava.main;

import com.cursojava.base.Employees;
import com.cursojava.references.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n----==== ++++ || ++++ ====----\n");

        for (Employees employees : new SalariedReferences().gettList()) {
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

        System.out.println("\n----==== ++++ || ++++ ====----\n");

        for (Employees employees : new HourlyReferences().getHeList()) {
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

        System.out.println("\n----==== ++++ || ++++ ====----\n");

        for (Employees employees : new CommissionedReferences().getCommissionEmployeesArrayList()) {
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

        System.out.println("\n----==== ++++ || ++++ ====----\n");

        for (Employees employees : new BasePlusReference().getBasePlusComissionEmployeeArrayList()) {
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

        System.out.println("\n----==== ++++ || ++++ ====----\n");

        for (Employees employees : new PieceWorkerReference().getPieceWorkers()) {
            System.out.println(employees);
            System.out.println(employees.earnings());
        }

    }
}
