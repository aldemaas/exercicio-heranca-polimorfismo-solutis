package funcionarios;

import java.util.Random;

public class TesteFuncionariosQuest7 {
    public static void main(String[] args) {
        /*

        Questao 7

        Crie um programa que simule uma empresa com 10 funcionários,
        utilize um array, sendo que a escolaridade dos funcionários é
        distribuída da seguinte forma:

        40% ensino básico, 40% ensino médio e 20% nível superior. Calcule
        os custos da empresa com salários totais e por nível de escolaridade,
        utilize a classe funcionário desenvolvida no exercício anterior.

         */

        Funcionario[] funcionarios = new Funcionario[10];
        Random random = new Random();


        for (int i = 0; i < 4; i++) { // 40% ensino básico (4 funcionários)
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), 100 + i, "Escola Básica");
        }

        for (int i = 4; i < 8; i++) { // 40% ensino médio (4 funcionários)
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), 100 + i, "Escola Básica", "Escola Média");
        }

        for (int i = 8; i < 10; i++) { // 20% nível superior (2 funcionários)
            funcionarios[i] = new FuncionarioGraduado("Funcionario " + (i + 1), 100 + i, "Escola Básica", "Escola Média", "Universidade");
        }

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoNivelSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularRenda();
            custoTotal += salario;

            if (funcionario instanceof FuncionarioEnsinoBasico && !(funcionario instanceof FuncionarioEnsinoMedio)) {
                custoEnsinoBasico += salario;
            } else if (funcionario instanceof FuncionarioEnsinoMedio && !(funcionario instanceof FuncionarioGraduado)) {
                custoEnsinoMedio += salario;
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoNivelSuperior += salario;
            }
        }

        System.out.printf("Custo Total da Empresa com Salários: R$ %.2f%n", custoTotal);
        System.out.printf("Custo com Funcionários de Ensino Básico: R$ %.2f%n", custoEnsinoBasico);
        System.out.printf("Custo com Funcionários de Ensino Médio: R$ %.2f%n", custoEnsinoMedio);
        System.out.printf("Custo com Funcionários de Nível Superior: R$ %.2f%n", custoNivelSuperior);




    }
}
