package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class Bens extends AtributosVariaveis implements AtributosFixos {

    private double bens;

    @Override
    public double getBens() {
        return bens;
    }

    public double CalcBens(){
        double resulBens = bens / getAnos();
        return resulBens;
    }
}
