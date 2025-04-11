package model;

import database.AtributosFixos;
import database.AtributosVariaveis;

public class MaoObra extends AtributosVariaveis implements AtributosFixos{

    private int pessoa;
    private double horasTrabalhada;
    private int qtdDiasTrabalhado;

    public MaoObra (int pessoa, double horasTrabalhada, int qtdDiasTrabalhado){
        this.pessoa = pessoa;
        this.horasTrabalhada = horasTrabalhada;
        this.qtdDiasTrabalhado = qtdDiasTrabalhado;
    }

    @Override
    public int getPessoas() {
        return pessoa;
    }

    @Override
    public double getHorasTrabalhadas() {
        return horasTrabalhada;
    }

    @Override
    public int getQtdDiasTrabalhado() {
        return qtdDiasTrabalhado;
    }

    public double CalcMO() {
        double resulMO = pessoa * horasTrabalhada * qtdDiasTrabalhado * getEnergiaPessoaAno();
        return resulMO;
    }
}
