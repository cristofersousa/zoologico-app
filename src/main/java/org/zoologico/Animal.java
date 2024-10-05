package org.zoologico;

public abstract class Animal {
    private int id;
    private String nome;
    private String habitat; // terrestre, aquatico, aereo
    private String alimentacao; // carnivoro, herbivoro, onivoro

    public Animal(int id, String nome, String habitat, String alimentacao) {
        this.id = id;
        this.nome = nome;
        this.habitat = habitat;
        this.alimentacao = alimentacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract String emitirSom();
}
