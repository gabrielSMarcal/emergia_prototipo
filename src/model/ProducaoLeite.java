package model;

public class ProducaoLeite {

    // ha = hectares
    private int leitePorDia;
    private int diaAno = 365;
    private double litroParaGrama = 1000;
    private double kcalPorGrama = 0.625F;
    private double joulesPorKcal = 4186;
    private double haFazenda;

    public ProducaoLeite(int leitePorDia, double haFazenda) {
            this.haFazenda = haFazenda;
            this.leitePorDia = leitePorDia;
    }

    public int getLeitePorDia() {
        return leitePorDia;
    }

    public void setLeitePorDia(int leitePorDia) {
        this.leitePorDia = leitePorDia;
    }

    public int getDiaAno() {
        return diaAno;
    }

    public void setDiaAno(int diaAno) {
        this.diaAno = diaAno;
    }

    public double getLitroParaGrama() {
        return litroParaGrama;
    }

    public void setLitroParaGrama(double litroParaGrama) {
        this.litroParaGrama = litroParaGrama;
    }

    public double getKcalPorGrama() {
        return kcalPorGrama;
    }

    public void setKcalPorGrama(double kcalPorGrama) {
        this.kcalPorGrama = kcalPorGrama;
    }

    public double getJoulesPorKcal() {
        return joulesPorKcal;
    }

    public void setJoulesPorKcal(double joulesPorKcal) {
        this.joulesPorKcal = joulesPorKcal;
    }

    public double getHectaresFazenda() {
        return haFazenda;
    }

    public void setHectaresFazenda(double haFazenda) {
        this.haFazenda = haFazenda;
    }

    public double calcPL () {

        double energiaTotalano = leitePorDia * diaAno * litroParaGrama * kcalPorGrama* joulesPorKcal;
        double resulPL = energiaTotalano/haFazenda;

        return resulPL;
    }


}
