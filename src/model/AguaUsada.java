package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class AguaUsada extends AtributosVariaveis implements AtributosFixos {

    private double litroPorDiaAnimal;
    private int qtdAnimal;
    private double litrosAdicionalDia;

    public AguaUsada (double litroPorDiaAnimal, int qtdAnimal, double litrosAdicionalDia){
        this.litroPorDiaAnimal= litroPorDiaAnimal;
        this.qtdAnimal = qtdAnimal;
        this.litrosAdicionalDia = litrosAdicionalDia;
    }

    @Override
    public double getLitroPorDiaAnimal() {
        return litroPorDiaAnimal;
    }

    @Override
    public int getQtdAnimal() {
        return qtdAnimal;
    }

    @Override
    public double getLitrosAdicionalDia() {
        return litrosAdicionalDia;
    }

    public double CalcAU (){

        double totalLitrosDia = (litroPorDiaAnimal * qtdAnimal) + litrosAdicionalDia;
        double totalEnergiaAno = totalLitrosDia * getDiasAno() * getQtdEnergiaPorKilo();
        return totalEnergiaAno;
    }

}
