package com.cursojava.references;

import com.cursojava.base.BasePlusCommissionsEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BasePlusReference implements GetList<ArrayList<BasePlusCommissionsEmployee>> {

    ArrayList<BasePlusCommissionsEmployee> basePlusCommissionsEmployeeArrayList = new ArrayList<>(List.of(
            new BasePlusCommissionsEmployee("Luan", "Bragança", "123456",
                    LocalDate.of(1998, 2, 28), 400, 0.5, 500),
            new BasePlusCommissionsEmployee("Claudia", "Ferreira", "123456",
                    LocalDate.of(1981, 5, 19), 350, 0.5, 500),
            new BasePlusCommissionsEmployee("Cecilia", "Medeiros", "123456",
                    LocalDate.of(1980,6,3), 750, 0.7, 500),
            new BasePlusCommissionsEmployee("Emanuel", "Abreu", "123456",
                    LocalDate.of(1984,9,9), 521, 0.6, 500)
    ));

    @Override
    public ArrayList<BasePlusCommissionsEmployee> getList() {
        return basePlusCommissionsEmployeeArrayList;
    }
}
