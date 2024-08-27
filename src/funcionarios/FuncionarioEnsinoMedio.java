package funcionarios;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    protected String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Ensino Médio: " + escolaEnsinoMedio;
    }
}

