package funcionarios;

import funcionarios.cargos.Gerente;
import funcionarios.cargos.Supervisor;
import funcionarios.cargos.Vendedor;

public class TesteFuncionariosQuest10 {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Gerente("Gerente 1", 101); // 1 Gerente
        funcionarios[1] = new Supervisor("Supervisor 1", 102); // 2 Supervisores
        funcionarios[2] = new Supervisor("Supervisor 2", 103);

        for (int i = 3; i < 10; i++) { // 7 Vendedores
            funcionarios[i] = new Vendedor("Vendedor " + (i - 2), 104 + i);
        }

        double custoTotal = 0;
        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularRenda();
            custoTotal += salario;

            if (funcionario instanceof Gerente) {
                custoGerentes += salario;
            } else if (funcionario instanceof Supervisor) {
                custoSupervisores += salario;
            } else if (funcionario instanceof Vendedor) {
                custoVendedores += salario;
            }
        }

        System.out.printf("Custo Total da Empresa com Salários: R$ %.2f%n", custoTotal);
        System.out.printf("Custo com Gerentes: R$ %.2f%n", custoGerentes);
        System.out.printf("Custo com Supervisores: R$ %.2f%n", custoSupervisores);
        System.out.printf("Custo com Vendedores: R$ %.2f%n", custoVendedores);
    }

}
