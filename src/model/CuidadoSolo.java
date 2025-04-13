package model;

import database.AtributosFixos;

public class CuidadoSolo extends AtributosFixos{

    // Ha = Hectatres
    private double toneladasPorHa;
    private int ano;


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
        double resulCS = (toneladasPorHa/ano) * getConversaoToneladaParaGramas() * areaDevastadaPeloGado /*getAreaPorHa()*/;
        return resulCS;
    }

    /* O que foi atualizado:
    - Mudei o nome da variável para ficar mais intuitivo
    - Adicionei uma variável ano (não é constante)
    - No cálculo foi adicionado ano
     */
}
