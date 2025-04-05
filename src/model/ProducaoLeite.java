package model;

public class ProducaoLeite {

    private int leitePorDia;
    private int diaAno = 365;
    private float litroParaGrama = 1000;
    private float kcalPorGrama = 0.625F;
    private float joulesPorKcal = 4186;
    private float hectaresFazenda;

    public ProducaoLeite(int leitePorDia, float hectaresFazenda) {
            this.hectaresFazenda = hectaresFazenda;
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

    public float getLitroParaGrama() {
        return litroParaGrama;
    }

    public void setLitroParaGrama(float litroParaGrama) {
        this.litroParaGrama = litroParaGrama;
    }

    public float getKcalPorGrama() {
        return kcalPorGrama;
    }

    public void setKcalPorGrama(float kcalPorGrama) {
        this.kcalPorGrama = kcalPorGrama;
    }

    public float getJoulesPorKcal() {
        return joulesPorKcal;
    }

    public void setJoulesPorKcal(float joulesPorKcal) {
        this.joulesPorKcal = joulesPorKcal;
    }

    public float getHectaresFazenda() {
        return hectaresFazenda;
    }

    public void setHectaresFazenda(float hectaresFazenda) {
        this.hectaresFazenda = hectaresFazenda;
    }

    public double calcPL () {

        double energiaTotalano = leitePorDia * diaAno * litroParaGrama * kcalPorGrama* joulesPorKcal;
        double resulPL = energiaTotalano/hectaresFazenda;

        return resulPL;
    }


}
