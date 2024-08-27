package animais;


public class Veterinario {
    public void examinando(Animal animal) {
        System.out.println("Examina o animal: " + animal.getNome());
        animal.emitirSom();
    }
}
