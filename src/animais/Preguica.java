package animais;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça fazendo som!");
    }

    @Override
    public void correr() {
        System.out.println("Preguiça está subindo em árvores!");
    }
}