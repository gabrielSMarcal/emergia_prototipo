package model;

public class MaoObra {

    private int pessoa;
    private double horasTrabalhada;
    private int qtdDiasTrabalhado;
    private double energiaPessoaAno = 4.6E09;

    public MaoObra (int pessoa, double horasTrabalhada, int qtdDiasTrabalhado){
        this.pessoa = pessoa;
        this.horasTrabalhada = horasTrabalhada;
        this.qtdDiasTrabalhado = qtdDiasTrabalhado;
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public double getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(int horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    public int getQtdDiasTrabalhado() {
        return qtdDiasTrabalhado;
    }

    public void setQtdDiasTrabalhado(int qtdDiasTrabalhado) {
        this.qtdDiasTrabalhado = qtdDiasTrabalhado;
    }

    public double getEnergiaPessoaAno() {
        return energiaPessoaAno;
    }

    public void setEnergiaPessoaAno(double energiaPessoaAno) {
        this.energiaPessoaAno = energiaPessoaAno;
    }

    public double CalcMO() {
        double resulMO = pessoa * horasTrabalhada * qtdDiasTrabalhado * energiaPessoaAno;
        return resulMO;
    }
}
