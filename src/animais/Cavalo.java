package animais;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchando!");
    }

    @Override
    public void correr() {
        System.out.println("Cavalo correndo!");
    }
}