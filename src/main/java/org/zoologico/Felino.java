package org.zoologico;

public class Felino extends Animal {

    public Felino(int id, String nome, String habitat, String alimentacao) {
        super(id, nome, habitat, alimentacao);
    }

    @Override
    public String emitirSom() {
        return "Felino ruge!";
    }
}
