package model;

public class PotencialQuimico {

    // ha = hectares
    private double haFazenda;
    private double mediaChuva;
    private double conversaoHaParaM2 = 10000;
    private double kgPorM3 = 1000;
    private double energiaPorKg = 4940;

    public PotencialQuimico(double haFazenda, double mediaChuva){
        this.haFazenda = haFazenda;
        this.mediaChuva = mediaChuva;
    }

    public double getHaFazenda() {
        return haFazenda;
    }

    public void setHaFazenda(double haFazenda) {
        this.haFazenda = haFazenda;
    }

    public double getMediaChuva() {
        return mediaChuva;
    }

    public void setMediaChuva(double mediaChuva) {
        this.mediaChuva = mediaChuva;
    }

    public double getConversaoHaParaM2() {
        return conversaoHaParaM2;
    }

    public void setConversaoHaParaM2(double conversaoHaParaM2) {
        this.conversaoHaParaM2 = conversaoHaParaM2;
    }

    public double getKgPorM3() {
        return kgPorM3;
    }

    public void setKgPorM3(double kgPorM3) {
        this.kgPorM3 = kgPorM3;
    }

    public double getEnergiaPorKg() {
        return energiaPorKg;
    }

    public void setEnergiaPorKg(double energiaPorKg) {
        this.energiaPorKg = energiaPorKg;
    }

    public double CalcPQ() {
        double resulPQ = haFazenda * mediaChuva * conversaoHaParaM2 * kgPorM3 * energiaPorKg;
        return resulPQ;
    }
}