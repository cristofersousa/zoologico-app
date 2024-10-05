package org.zoologico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    // Create
    public void adicionarAnimal(Animal animal) {
        String sql = "INSERT INTO animais (nome, habitat, alimentacao) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getHabitat());
            stmt.setString(3, animal.getAlimentacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar animal.", e);
        }
    }

    // Read
    public List<Animal> listarAnimais() {
        String sql = "SELECT * FROM animais";
        List<Animal> animais = new ArrayList<>();

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String habitat = rs.getString("habitat");
                String alimentacao = rs.getString("alimentacao");

                Animal animal = new Felino(id, nome, habitat, alimentacao); // Exemplo com Felino
                animais.add(animal);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar animais.", e);
        }

        return animais;
    }

    // Update
    public void atualizarAnimal(Animal animal) {
        String sql = "UPDATE animais SET nome = ?, habitat = ?, alimentacao = ? WHERE id = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getHabitat());
            stmt.setString(3, animal.getAlimentacao());
            stmt.setInt(4, animal.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar animal.", e);
        }
    }

    // Delete
    public void deletarAnimal(int id) {
        String sql = "DELETE FROM animais WHERE id = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar animal.", e);
        }
    }
}
