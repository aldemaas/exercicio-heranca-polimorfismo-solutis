package funcionarios.cargos;

import funcionarios.Funcionario;

public class Supervisor extends Funcionario {
    private final double comissaoSupervisor = 600.00;

    public Supervisor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = comissaoSupervisor;
    }

    @Override
    public double calcularRenda() {
        return salarioBase + comissao;
    }
}


