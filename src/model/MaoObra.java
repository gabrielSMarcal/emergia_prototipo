package model;

import database.AtributosFixos;

public class MaoObra extends AtributosFixos{

    private int pessoa;
    private double horasTrabalhada;
    private int qtdDiasTrabalhado;
    private int horasAnoReferencia = 2000;

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

    public double calcMO() {
        double resulMO = (pessoa * horasTrabalhada * qtdDiasTrabalhado) / horasAnoReferencia * getEnergiaPessoaAno();
        return resulMO;
    }

    /* O que atualizei:
    - corrigir o cálculo
    - adicionei uma variável constante, mas não coloquei no AtributoFixo, porque não sei puxar com get.
     */
}
