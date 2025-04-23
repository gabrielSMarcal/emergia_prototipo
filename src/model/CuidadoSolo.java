package model;

import database.AtributosFixos;

public class CuidadoSolo extends AtributosFixos{

    // Ha = Hectatres
    private double toneladasPorHa;
    private String uToneladasHa = "T";
    private int ano;
    private String uAno = "Ano";


    public double getToneladasPorHa() {
        return toneladasPorHa;
    } //não sei se isso é necessário

    private double areaDevastadaPeloGado;

    public CuidadoSolo (double toneladasPorHa, double areaDevastadaPeloGado, int ano) {
        this.areaDevastadaPeloGado = areaDevastadaPeloGado;
        this.toneladasPorHa = toneladasPorHa;
        this.ano = ano;
    }

    public double calcCS() {
        /*getAreaPorHa()*/
        return (toneladasPorHa/ano) * getConversaoToneladaParaGramas() * areaDevastadaPeloGado;
    }

    /*
    o que atualizei:
    - Retirei a variável resul e coloquei apenas return
     */
}
