/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Joao Victor
 */
public class LogDAOSqlite implements LogDAO {

    private static Connection conexao;

    public LogDAOSqlite() {
        String url = "jdbc:sqlite:db/database.db";
        try{
        conexao = DriverManager.getConnection(url);
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + ex.getMessage());
        }
    }

    @Override
    public void updateLog(int id, String tipoLog) {
        String sql = "UPDATE log SET tipoLog = ? WHERE id = ?;";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, tipoLog);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o log: " + e.getMessage());
        }
    }

    @Override
    public String retornaTipo() {
        String sql = "SELECT tipoLog FROM log WHERE id = ?;";
        String tipoLog = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, 1);  // Definindo o ID como 1

            // Executa a query e pega o resultado
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    tipoLog = rs.getString("tipoLog"); // Obtém o valor da coluna tipoLog
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar o tipo de log: " + e.getMessage());
        }

        return tipoLog;
    }
}
