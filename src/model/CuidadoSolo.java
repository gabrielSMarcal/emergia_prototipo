package model;

public class CuidadoSolo {

    // Ha = Hectatres
    private double tonelasPorHa7anos;
    private double conversaoToledaParaGrama = 1.00E6;
    private double areaPorHa = 27.0;

    public CuidadoSolo (double tonelasPorHa7anos) {
        this.tonelasPorHa7anos= tonelasPorHa7anos;
    }

    public double getTonelasPorHa7anos() {
        return tonelasPorHa7anos;
    }

    public void setTonelasPorHa7anos(double tonelasPorHa7anos) {
        this.tonelasPorHa7anos = tonelasPorHa7anos;
    }

    public double getConversaoToledaParaGrama() {
        return conversaoToledaParaGrama;
    }

    public void setConversaoToledaParaGrama(double conversaoToledaParaGrama) {
        this.conversaoToledaParaGrama = conversaoToledaParaGrama;
    }

    public double getAreaPorHa() {
        return areaPorHa;
    }

    public void setAreaPorHa(double areaPorHa) {
        this.areaPorHa = areaPorHa;
    }

    public double CalcCS() {
        double resulCS = tonelasPorHa7anos * conversaoToledaParaGrama * areaPorHa;
        return resulCS;
    }
}
