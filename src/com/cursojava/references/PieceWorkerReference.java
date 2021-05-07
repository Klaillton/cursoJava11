package com.cursojava.references;

import com.cursojava.base.PieceWorker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PieceWorkerReference implements GetList<ArrayList<PieceWorker>>{

    ArrayList<PieceWorker> pieceWorkers = new ArrayList<>(List.of(
            new PieceWorker("Paulo", "Ricardo", "123456",
                    LocalDate.of(1980, 5, 13), 0.7, 910),
            new PieceWorker("Bruna", "Santos", "123456",
                    LocalDate.of(2001,3,18), 0.5, 1001),
            new PieceWorker("Fernanda", "Sobreiro", "123456",
                    LocalDate.of(1997,5,29), 0.6, 712),
            new PieceWorker("Mauro", "Ramos", "123456",
                    LocalDate.of(1989,6,8), 0.4, 1310)
            ));


    @Override
    public ArrayList<PieceWorker> getList() {
        return pieceWorkers;
    }
}
