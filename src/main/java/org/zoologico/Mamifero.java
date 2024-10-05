package org.zoologico;

public class Mamifero extends Animal {

    public Mamifero(int id, String nome, String habitat, String alimentacao) {
        super(id, nome, habitat, alimentacao);
    }

    @Override
    public String emitirSom() {
        return "Mamífero faz som!";
    }
}
