package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class CuidadoSolo extends AtributosVariaveis implements AtributosFixos{

    // Ha = Hectatres
    private double tonelasPorHa7anos;

    @Override
    public double getToneladasPorHa7Anos() {
        return toneladasPorHa7Anos;
    }

    public double CalcCS() {
        double resulCS = tonelasPorHa7anos * getConversaoToneladaParaGramas() * getAreaPorHa();
        return resulCS;
    }
}
