package com.cursojava.references;

import com.cursojava.base.HourlyEmployees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HourlyReferences {

    ArrayList<HourlyEmployees> heList = new ArrayList<HourlyEmployees>(List.of(
            new HourlyEmployees("Jhonatan", "Cardoso", "123456", LocalDate.of(1999, 05, 13), 13, 90),
            new HourlyEmployees("Isabella", "Fonseca", "123456", LocalDate.of(1978,12,8), 12, 45),
            new HourlyEmployees("Carla", "Maria", "123456", LocalDate.of(1993,05,28), 10, 100),
            new HourlyEmployees("Sabrina", "Torres", "123456", LocalDate.of(2001,05,15),13,50)
    ));

    public ArrayList<HourlyEmployees> getHeList() {
        return heList;
    }
}
