package model;

import database.AtributosFixos;

public class Bens extends AtributosFixos {

    private double bens;

    public double getBens() {
        return bens;
    }

    public double CalcBens(){
        double resulBens = bens / getAnos();
        return resulBens;
    }
}
