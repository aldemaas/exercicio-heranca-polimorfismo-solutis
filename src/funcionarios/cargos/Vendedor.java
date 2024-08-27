package funcionarios.cargos;

import funcionarios.Funcionario;

public class Vendedor extends Funcionario {
    private final double comissaoVendedor = 250.00;

    public Vendedor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = comissaoVendedor;
    }

    @Override
    public double calcularRenda() {
        return salarioBase + comissao;
    }
}

