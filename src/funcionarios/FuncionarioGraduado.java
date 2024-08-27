package funcionarios;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    protected String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio);
        this.universidade = universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
