package animais;

public class Main {
    public static void main(String[] args) {
        // Exercício 02: Criando os 3 tipos de animais e invocando o método emitirSom polimorficamente
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Sid", 3);

        System.out.println("Exercício 02:");
        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
        System.out.println();

        // Exercício 03: Implementando a classe Veterinario e usando o método examinar()
        Veterinario veterinario = new Veterinario();

        System.out.println("Exercício 03:");
        veterinario.examinando(cachorro);
        veterinario.examinando(cavalo);
        veterinario.examinando(preguica);
        System.out.println();

        // Exercício 04: Criando uma classe Zoologico com 10 jaulas e colocando diferentes animais
        Zoologico zoologico = new Zoologico();

        // Adicionando diferentes animais às jaulas
        zoologico.adicionarAnimal(0, cachorro);
        zoologico.adicionarAnimal(1, cavalo);
        zoologico.adicionarAnimal(2, preguica);
        zoologico.adicionarAnimal(3, new Cachorro("Bobby", 4));
        zoologico.adicionarAnimal(4, new Cavalo("Mustang", 6));
        zoologico.adicionarAnimal(5, new Preguica("Flash", 2));
        zoologico.adicionarAnimal(6, new Cachorro("Fido", 3));
        zoologico.adicionarAnimal(7, new Cavalo("Thunder", 8));
        zoologico.adicionarAnimal(8, new Preguica("Lazy", 4));
        zoologico.adicionarAnimal(9, new Cachorro("Max", 2));

        // Percorrendo as jaulas e emitindo sons e fazendo os animais correrem
        System.out.println("Exercício 04:");
        zoologico.percorrerJaulas();
    }
}