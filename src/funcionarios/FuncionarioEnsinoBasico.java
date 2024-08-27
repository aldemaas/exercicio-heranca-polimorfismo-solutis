package funcionarios;

public class FuncionarioEnsinoBasico extends Funcionario {
    protected String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    @Override
    public double calcularRenda() {
        double rendaBasica = this.salarioBase;
        return rendaBasica * 1.10 + this.comissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Ensino Básico: " + escolaEnsinoBasico;
    }
}
