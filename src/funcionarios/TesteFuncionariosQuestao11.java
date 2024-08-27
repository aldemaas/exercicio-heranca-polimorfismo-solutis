package funcionarios;

import funcionarios.cargos.Gerente;
import funcionarios.cargos.Supervisor;
import funcionarios.cargos.Vendedor;

public class TesteFuncionariosQuestao11 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Gerente("Gerente 1", 101); // 1 Gerente
        funcionarios[1] = new Supervisor("Supervisor 1", 102); // 2 Supervisores
        funcionarios[2] = new Supervisor("Supervisor 2", 103);

        for (int i = 3; i < 10; i++) {
            funcionarios[i] = new Vendedor("Vendedor " + (i - 2), 104 + i);
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
