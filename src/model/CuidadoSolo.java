package model;

import database.AtributosFixos;

public class CuidadoSolo extends AtributosFixos{

    // Ha = Hectatres
    private double toneladasPorHa7Anos;

    public double getToneladasPorHa7Anos() {
        return toneladasPorHa7Anos;
    }

    public double CalcCS() {
        double resulCS = toneladasPorHa7Anos * getConversaoToneladaParaGramas() * getAreaPorHa();
        return resulCS;
    }
}
