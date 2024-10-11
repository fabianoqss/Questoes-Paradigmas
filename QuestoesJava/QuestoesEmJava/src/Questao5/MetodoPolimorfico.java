package Questao5;

import Questao4.Animal;

import java.util.List;

public class MetodoPolimorfico {
    public static void emitirSons(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.som();
        }
    }
}
