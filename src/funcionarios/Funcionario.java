package funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double salarioBase = 1000.00;
    protected double comissao;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = 0;
    }

    public abstract double calcularRenda();

    @Override
    public String toString() {
        return String.format("Nome: %s, Comissão: R$ %.2f, Salário Total: R$ %.2f",
                nome, comissao, calcularRenda());
    }
}

