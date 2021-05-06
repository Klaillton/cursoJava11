package com.cursojava.references;

import com.cursojava.base.SalariedEmployees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalariedReferences {

    ArrayList<SalariedEmployees> tList = new ArrayList<SalariedEmployees>(List.of(
           new SalariedEmployees("Klaillton", "Santos", "123456", LocalDate.of(1986,5,13), 900.0),
           new SalariedEmployees("Gustavo", "Hugo", "123456", LocalDate.of(1987,07,12), 700.0),
           new SalariedEmployees("Pedro", "Thiago", "123456", LocalDate.of(1954, 01,21), 850.0),
           new SalariedEmployees("Jose", "Simao", "123456", LocalDate.of(1989,06,18), 600.0)
    ));

    public ArrayList<SalariedEmployees> gettList() {
        return tList;
    }

}
