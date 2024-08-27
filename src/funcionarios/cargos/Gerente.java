package funcionarios.cargos;

import funcionarios.Funcionario;

public class Gerente extends Funcionario {
    private final double comissaoGerente = 1500.00;

    public Gerente(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = comissaoGerente;
    }

    @Override
    public double calcularRenda() {
        return salarioBase + comissao;
    }
}