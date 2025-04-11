package database;

public interface AtributosFixos {

    // AguaUsada
    double getLitroPorDiaAnimal();
    int getQtdAnimal();
    double getLitrosAdicionalDia();

    // Bens
    double getBens();

    // CombustivelUsado
    double getHorasTratorPorAno();
    double getQtdTrator();
    double getLitrosPorHora();

    // CuidadoSolo
    double getToneladasPorHa7Anos();

    // Eletricidade
    double getEnergiaPorKWH();

    // Mão de obra
    int getPessoas();
    double getHorasTrabalhadas();
    int getQtdDiasTrabalhado();

    // Maquinarios
    double getQtdHorasTrator();
    double getValorHoraTrator();

    // PerdaSolo
    double getPerdaDeSoloToneladasPorAno();

    // PotencialQuimico
    double getHaFazenda();
    double getMediaChuva();

    // ProducaoLeite
    int getLeitePorDia();
    double getHaFazendaLeite();

    // Racao
    int getSaca();
    double valorSaca();
}
