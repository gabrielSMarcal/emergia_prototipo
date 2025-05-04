package main;

import model.ContribuicaoAmbiental.energiaNRenovavel.AguaUsada;
import model.ContribuicaoAmbiental.energiaNRenovavel.PerdaSolo;
import model.ContribuicaoAmbiental.energiaNRenovavel.energiaRenovavel.PotencialQuimico;
import model.contribuicaoHumana.CuidadoSolo;
import model.contribuicaoHumana.bens.ValorConsumoManutencao;
import model.contribuicaoHumana.operacoesProducao.*;
import model.producao.ProducaoLeite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura =new Scanner(System.in);
        double valorEmergeticoTotal = 0;
        int opcao;

        while (true) {
            System.out.println("""
                    **************************************************************************
                    Bem vindo ao calculador de emergia para agropecuária! Escolha um cálculo:
                     1 - Calcular emergia por agua usada
                     2 - Calcular emergia por combustivel utilizado
                     3 - Calcular emergia por energia elétrica
                     4 - Calcular emergia por mão de obra
                     5 - Calcular emergia por quantidade de ração
                     6 - Calcular emergia por cuidado do solo
                     7 - Calcular emergia por maquinário
                     8 - Calcular emergia por perda do solo
                     9 - Calcular emergia por potencial químico dda chuva
                    10 - Calcular emergia por Valor de bens e manutenção da fazenda
                    11 - Calcular emergia do gado
                    12 - Calcular emergia por produção de leite
                    
                
                    99 - Verificar valor emergético final
                    0 - Sair
                    **************************************************************************""");
            System.out.println("Opção desejada: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de litros por dia por animal:");
                    double litroPorDiaAnimal = leitura.nextDouble();

                    System.out.println("Digite a quantidade de animais:");
                    int qtdAnimal = leitura.nextInt();

                    System.out.println("Digite a quantidade de litros adicionais por dia:");
                    double litrosAdicionalDia = leitura.nextInt();

                    AguaUsada aguaUsada = new AguaUsada(litroPorDiaAnimal, qtdAnimal, litrosAdicionalDia);

                    double valorEmergeticoAU = aguaUsada.calcAU();
                    double refEmergiaSolarAU = aguaUsada.calRefEmergiaSolarAguaUsada();
                    valorEmergeticoTotal += valorEmergeticoAU;

                    System.out.printf("Valor emergético da água usada: %.2e\n", valorEmergeticoAU);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarAU);
                    break;
                case 2:
                    System.out.println("Digite a quantidade de horas de tratores por ano:");
                    double combustivel = leitura.nextDouble();

                    System.out.println("Digite quantos tratores são utilizados:");
                    double qtdTrator = leitura.nextDouble();

                    System.out.println("Digite quantos litros de combustível é gasto por hora:");
                    double valorCombustivel = leitura.nextDouble();

                    CombustivelUsado combustivelUtilizado = new CombustivelUsado(combustivel,
                            valorCombustivel, qtdTrator);

                    double valorEmergeticoCU = combustivelUtilizado.calCU();
                    double refEmergiaSolarCU = combustivelUtilizado.calRefEmergiaSolarCombustivelUsado();

                    valorEmergeticoTotal += combustivelUtilizado.calCU();

                    System.out.printf("Valor emergético do Combustivel usada: %.2e\n", valorEmergeticoCU);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarCU);

                    break;
                case 3:
                    System.out.println("Digite a quantidade de energia elétrica utilizada por KWH:");
                    double energiaEletrica = leitura.nextDouble();

                    Eletricidade energia = new Eletricidade(energiaEletrica);

                    double valorEmergeticoE = energia.calcE();

                    double refEmergiaSolarE = energia.calRefEmergiaSolarEletricidade();

                    valorEmergeticoTotal += valorEmergeticoE;

                    System.out.printf("Valor emergético da energia elétrica (kcal): %.2e\n", valorEmergeticoE);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarE);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de pessoas:");
                    int pessoa = leitura.nextInt();

                    System.out.println("Digite a quantidade de horas trabalhadas:");
                    double horasTrabalhada = leitura.nextInt();

                    System.out.println("Digite a quantidade de dias trabalhados:");
                    int qtdDiasTrabalhado = leitura.nextInt();

                    MaoObra maoObra = new MaoObra(pessoa, horasTrabalhada, qtdDiasTrabalhado);

                    double valorEmergeticoMO = maoObra.calcMO();

                    double refEmergiaSolarMO = maoObra.calRefEmergiaSolarMaoObra();

                    valorEmergeticoTotal += maoObra.calcMO();


                    System.out.printf("Valor emergético da mão de obra: %.2e\n", valorEmergeticoMO);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarMO);
                    break;
                case 5:
                    System.out.println("Digite a quantidade de ração utilizada em sacas:");
                    int saca = leitura.nextInt();

                    System.out.println("Digite o valor da saca:");
                    double valorSaca = leitura.nextDouble();

                    System.out.println("Analisando...");

                    Racao racaoUsada = new Racao(saca, valorSaca);

                    double valorEmergeticoR = racaoUsada.calcR();

                    double refEmergiaSolarR = racaoUsada.calRefEmergiaSolarRacao();

                    valorEmergeticoTotal += valorEmergeticoR;

                    System.out.printf("Valor emergético da ração usada: %.2e\n", valorEmergeticoR);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarR);
                    break;
                case 6:
                    System.out.println("Digite a quantidade de tonelada de produto utilizado para cuidar: ");
                    double toneladasPorHa7Anos = leitura.nextDouble();

                    System.out.println("Digite a quantidade de anos esas toneladas foi usada: ");
                    int ano = leitura.nextInt();

                    System.out.println("Digite a quantidade de area devastada pelo gado em Hectares:");
                    double areaDevastadaPeloGado = leitura.nextDouble();

                    CuidadoSolo cuidadoSolo = new CuidadoSolo(toneladasPorHa7Anos,areaDevastadaPeloGado, ano);

                    double valorEmergeticoCS = cuidadoSolo.calcCS();

                    double refEmergiaSolarCS = cuidadoSolo.calRefEmergiaSolarCuidadoSolo();
                    valorEmergeticoTotal += valorEmergeticoCS;

                    System.out.printf("Valor emergético do cuidado do solo: %.2e\n", valorEmergeticoCS);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarCS);
                    break;
                case 7:
                    System.out.println("Digite a quantidade de horas que o trator é usado:");
                    double qtdHoraTrator = leitura.nextDouble();

                    System.out.println("Digite o valor da hora do Trator, em reais: ");
                    double valorHoraTrator = leitura.nextDouble();

                    System.out.println("Analisando...");

                    Maquinarios maquinarios = new Maquinarios(qtdHoraTrator,valorHoraTrator);

                    double valorEmergeticoM = maquinarios.calcM();

                    double refEmergiaSolarM = maquinarios.calRefEmergiaSolarMaquinario();

                    valorEmergeticoTotal += valorEmergeticoM;

                    System.out.printf("Valor emergético do maquinário: %.2e\n", valorEmergeticoM);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarM);
                    break;
                case 8:
                    System.out.println("Digite a quantidade de perda do solo:");
                    double perdaSolo = leitura.nextDouble();

                    PerdaSolo perdasolo = new PerdaSolo(perdaSolo);

                    double valorEmergeticoPS = perdasolo.calcPS();

                    double refEmergiaSolarPS = perdasolo.calRefEmergiaSolarPerdaSolo();

                    valorEmergeticoTotal += perdasolo.calcPS();

                    System.out.printf("Valor emergético da perda do solo: %.2e\n", valorEmergeticoPS);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarPS);
                    break;
                case 9:
                    System.out.println("Digite a area da fazenda em HA(hectares):");
                    double haFazenda = leitura.nextDouble();

                    System.out.println("Digite a quantidade de chuva por ano em m3 ");
                    double precipitacao = leitura.nextDouble();

                    PotencialQuimico potecialquimico = new PotencialQuimico(haFazenda, precipitacao);

                    double valorEmergeticoPQ = potecialquimico.calcPQ();

                    double refEmergiaSolarPQ = potecialquimico.calRefEmergiaSolarPotencialQuimico();
                    valorEmergeticoTotal += valorEmergeticoPQ;

                    System.out.printf("Valor emergético do potêncial químico: %.2e\n", valorEmergeticoPQ);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarPQ);

                    break;
                case 10:
                    System.out.println("Digite o valor monetário utilizado para o consumo e manutenção do gado e fazenda por ano: ");
                    double bens = leitura.nextDouble();

                    System.out.println("Digite a quantidade de anos deste gasto: ");
                    int anos = leitura.nextInt();

                    System.out.println("Analisando...");

                    ValorConsumoManutencao valorConsumoManutencao = new ValorConsumoManutencao(bens,anos);

                    double valorEmergeticoVCM = valorConsumoManutencao.calcBens();

                    double refEmergiaSolarVCM = valorConsumoManutencao.calRefEmergiaSolarVCM();

                    valorEmergeticoTotal += valorEmergeticoVCM;

                    System.out.printf("Valor emergético de manutenção e bens da fazenda: %.2e\n", valorEmergeticoVCM);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarVCM);
                    break;
                case 11:
                    System.out.println("Digite o peso médio do gado em kg: ");
                    double pesoKgMedia = leitura.nextDouble();

                    System.out.println("Digite a quantidade de animais: ");
                    int numeroAnimais = leitura.nextInt();

                    System.out.println("Digite a quantidade de anos de vida média do gado: ");
                    float anosVidamedia = leitura.nextFloat();

                    Gado gado = new Gado(pesoKgMedia, numeroAnimais, anosVidamedia);

                    double valorEmergeticoG = gado.calcG();

                    double refEmergiaSolarG = gado.calRefEmergiaSolarGado();

                    valorEmergeticoTotal += valorEmergeticoG;

                    System.out.printf("Valor emergético do gado: %.2e\n", valorEmergeticoG);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarG);
                    break;
                case 12:
                    System.out.println("Digite a area da sua fazenda: ");
                    double HaFazenda = leitura.nextDouble();

                    System.out.println("Digite a quantidade de leite produzido por dia: ");
                    double leiteDia = leitura.nextDouble();

                    ProducaoLeite producaoLeite = new ProducaoLeite(leiteDia,HaFazenda);

                    double valorEmergeticoPL = producaoLeite.calcPL();

                    double refEmergiaSolarPL = producaoLeite.calRefEmergiaSolarProducaoLeite();

                    valorEmergeticoTotal += valorEmergeticoPL;

                    System.out.printf("Valor emergético da produção de leite: %.2e\n", valorEmergeticoPL);

                    System.out.printf("Referência de emergia solar: %.2e\n", refEmergiaSolarPL);;
                    break;
                case 99:
                    System.out.println("Valor emergético total: " + valorEmergeticoTotal);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    leitura.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println("Deseja fazer mais cálculos? (1 - Sim, 0 - Não)");
            int continuar = leitura.nextInt();
            if (continuar == 0) {
                System.out.printf("Valor emergético total: %.2e",valorEmergeticoTotal);
                break;
            }
        }
    }

}