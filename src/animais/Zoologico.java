package animais;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < 10) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora do intervalo de jaulas.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            System.out.println("Jaula " + (i + 1) + ":");
            if (jaulas[i] != null) {
                jaulas[i].emitirSom();
                jaulas[i].correr();
            } else {
                System.out.println("Jaula vazia.");
            }
            System.out.println();
        }
    }
}