package model;

import database.AtributosFixos;

public class MaoObra extends AtributosFixos{

    private int pessoa;
    private double horasTrabalhada;
    private int qtdDiasTrabalhado;

    public MaoObra (int pessoa, double horasTrabalhada, int qtdDiasTrabalhado){
        this.pessoa = pessoa;
        this.horasTrabalhada = horasTrabalhada;
        this.qtdDiasTrabalhado = qtdDiasTrabalhado;
    }

    public int getPessoas() {
        return pessoa;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhada;
    }

    public int getQtdDiasTrabalhado() {
        return qtdDiasTrabalhado;
    }

    public double CalcMO() {
        double resulMO = pessoa * horasTrabalhada * qtdDiasTrabalhado * getEnergiaPessoaAno();
        return resulMO;
    }
}
