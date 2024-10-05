package org.zoologico;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalDAO dao = new AnimalDAO();

        // Criar um novo animal (Felino)
        Felino leao = new Felino(1, "Leão", "Terrestre", "Carnívoro");
        dao.adicionarAnimal(leao);

        // Criar um novo animal (Mamifero)
        Mamifero foca = new Mamifero(2, "Foca",  "Aquático",  "Peixes");
        dao.adicionarAnimal(foca);

        // Listar todos os animais
        List<Animal> animais = dao.listarAnimais();
        for (Animal animal : animais) {
            System.out.println("ID: " + animal.getId() + ", Nome: " + animal.getNome() + ", Habitat: " + animal.getHabitat() + ", Alimentação: " + animal.getAlimentacao());
        }

        // Atualizar um animal
        leao.setNome("Leão Atualizado");
        dao.atualizarAnimal(leao);

        foca.setNome("Foca Update");
        dao.atualizarAnimal(foca);

        // Deletar um animal
        // dao.deletarAnimal(leao.getId());
    }
}
