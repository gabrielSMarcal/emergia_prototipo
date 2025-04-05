package model;

public class PerdaSolo {

    private double perdaDeSoloToneladasPorAno;
    private double conversaoToneladaParaGramas = 1.00E06;
    private double gramasMOporGramasSolo = 0.07;
    private double kcalPorGrama = 3.6;
    private double joulesPorKcal = 4186;

    public PerdaSolo(double perdaDeSoloToneladasPorAno){
        this.perdaDeSoloToneladasPorAno = perdaDeSoloToneladasPorAno;
    }

    public double getPerdaDeSoloToneladasPorAno() {
        return perdaDeSoloToneladasPorAno;
    }

    public void setPerdaDeSoloToneladasPorAno(double perdaDeSoloToneladasPorAno) {
        this.perdaDeSoloToneladasPorAno = perdaDeSoloToneladasPorAno;
    }

    public double getConversaoToneladaParaGramas() {
        return conversaoToneladaParaGramas;
    }

    public void setConversaoToneladaParaGramas(double conversaoToneladaParaGramas) {
        this.conversaoToneladaParaGramas = conversaoToneladaParaGramas;
    }

    public double getGramasMOporGramasSolo() {
        return gramasMOporGramasSolo;
    }

    public void setGramasMOporGramasSolo(double gramasMOporGramasSolo) {
        this.gramasMOporGramasSolo = gramasMOporGramasSolo;
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

    public double CalcPS(){
        double resulPs = perdaDeSoloToneladasPorAno * conversaoToneladaParaGramas * gramasMOporGramasSolo * kcalPorGrama * joulesPorKcal;
        return resulPs;
    }
}
