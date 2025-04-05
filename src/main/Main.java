package main;

import model.*;

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
                    int litrosAdicionalDia = leitura.nextInt();
                    AguaUsada aguaUsada = new AguaUsada(litroPorDiaAnimal, qtdAnimal, litrosAdicionalDia);
                    valorEmergeticoTotal += aguaUsada.CalcAU();
                    System.out.println("Valor emergético da água usada: " + aguaUsada.CalcAU());
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
                    valorEmergeticoTotal += combustivelUtilizado.calcularTotalEnergiaPorAno();
                    System.out.println("Valor emergético do combustivel: "
                            + combustivelUtilizado.calcularTotalEnergiaPorAno());
                    break;
                case 3:
                    System.out.println("Digite a quantidade de energia elétrica utilizada por KWH:");
                    double energiaEletrica = leitura.nextDouble();
                    Eletricidade energia = new Eletricidade(energiaEletrica);
                    valorEmergeticoTotal += energia.CalcE();
                    System.out.println("Valor emergético da energia elétrica: " + energia.CalcE());
                    break;
                case 4:
                    System.out.println("Digite a quantidade de pessoas:");
                    int pessoa = leitura.nextInt();
                    System.out.println("Digite a quantidade de horas trabalhadas:");
                    double horasTrabalhada = leitura.nextInt();
                    System.out.println("Digite a quantidade de dias trabalhados:");
                    int qtdDiasTrabalhado = leitura.nextInt();
                    MaoObra maoObra = new MaoObra(pessoa, horasTrabalhada, qtdDiasTrabalhado);
                    valorEmergeticoTotal += maoObra.CalMO();
                    System.out.println("Valor emergético da mão de obra: " + maoObra.CalMO());
                    break;
                case 5:
                    System.out.println("Digite a quantidade de ração utilizada em sacas:");
                    int saca = leitura.nextInt();
                    System.out.println("Digite o valor da saca:");
                    double valorSaca = leitura.nextDouble();
                    Racao racaoUsada = new Racao(saca, valorSaca);
                    valorEmergeticoTotal += racaoUsada.CalcR();
                    System.out.println("Valor emergético da ração: " + racaoUsada.CalcR());
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
                System.out.println("Valor emergético total: " + valorEmergeticoTotal);
                break;
            }
        }
    }
}