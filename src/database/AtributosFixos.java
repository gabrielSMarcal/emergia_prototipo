package database;

public class AtributosFixos {

    // Globais
    int diasAno = 365;
    int mesAno = 12;
    double conversaoToneladaParaGramas = 1.00E06;

    // AguaUsada
    double qtdEnergiaPorKilo = 4.94E03;

    // Bens
    int anos = 20;

    // CombustivelUsado
    double joulesPorTonelada = 4.40E10;
    double toneladaPorLitro = 1.00E03;

    // CuidadoSolo
    double areaPorHa = 27.0;

    // Eletricidade
    int kwhParaKcal = 860;
    int energiaPorKcal = 4186;

    // MaoObra
    double energiaPessoaAno = 4.6E09;

    // PerdaSolo
    double gramasMOporGramasSolo = 0.07;
    double kcalPorGrama = 3.6;
    double joulesPorKcal = 4186;

    // PotencialQuimico
    double conversaoHaParaM2 = 10000;
    double kgPorM3 = 1000;
    double energiaPorKg = 4940;

    // ProducaoLeite
    double litroParaGrama = 1000;
    double kcalPorGramaLeite = 0.625F;
    double joulesPorKcalLeite = 4186;

    public int getDiasAno() {
        return diasAno;
    }

    public int getMesAno() {
        return mesAno;
    }

    public double getQtdEnergiaPorKilo() {
        return qtdEnergiaPorKilo;
    }

    public int getAnos() {
        return anos;
    }

    public double getJoulesPorTonelada() {
        return joulesPorTonelada;
    }

    public double getToneladaPorLitro() {
        return toneladaPorLitro;
    }

    public double getAreaPorHa() {
        return areaPorHa;
    }

    public int getKwhParaKcal() {
        return kwhParaKcal;
    }

    public int getEnergiaPorKcal() {
        return energiaPorKcal;
    }

    public double getEnergiaPessoaAno() {
        return energiaPessoaAno;
    }

    public double getConversaoToneladaParaGramas() {
        return conversaoToneladaParaGramas;
    }

    public double getGramasMOporGramasSolo() {
        return gramasMOporGramasSolo;
    }

    public double getKcalPorGrama() {
        return kcalPorGrama;
    }

    public double getJoulesPorKcal() {
        return joulesPorKcal;
    }

    public double getConversaoHaParaM2() {
        return conversaoHaParaM2;
    }

    public double getKgPorM3() {
        return kgPorM3;
    }

    public double getEnergiaPorKg() {
        return energiaPorKg;
    }

    public double getLitroParaGrama() {
        return litroParaGrama;
    }

    public double getKcalPorGramaLeite() {
        return kcalPorGramaLeite;
    }

    public double getJoulesPorKcalLeite() {
        return joulesPorKcalLeite;
    }
}
