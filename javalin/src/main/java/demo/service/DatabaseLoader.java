package demo.service;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseLoader {

    private static final String DB_URL = "jdbc:sqlite:equipes.db";

    public static Connection getConnection() throws Exception {
        Connection conn = DriverManager.getConnection(DB_URL);
        conn.createStatement().execute("PRAGMA foreign_keys = ON");
        return conn;
    }

    public static void inicializar() {
        try {
            executarSql("/demo/database/criacao_banco.sql");
            if (bancoPrecisaDeDados()) {
                executarSql("/demo/database/dados_iniciais.sql");
            }
            System.out.println("[DB] Banco inicializado com sucesso.");
        } catch (Exception e) {
            System.err.println("[DB] Erro ao inicializar banco: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void resetar() {
        try {
            executarSql("/demo/database/limpar_banco.sql");
            executarSql("/demo/database/criacao_banco.sql");
            executarSql("/demo/database/dados_iniciais.sql");
            System.out.println("[DB] Banco resetado com sucesso.");
        } catch (Exception e) {
            System.err.println("[DB] Erro ao resetar banco: " + e.getMessage());
        }
    }

    private static boolean bancoPrecisaDeDados() throws Exception {
        try (Connection conn = getConnection();
             var rs = conn.createStatement().executeQuery("SELECT COUNT(*) FROM trabalhador")) {
            return rs.getInt(1) == 0;
        }
    }

    public static void executarSql(String resourcePath) throws Exception {
        InputStream is = DatabaseLoader.class.getResourceAsStream(resourcePath);
        if (is == null) throw new RuntimeException("SQL não encontrado: " + resourcePath);
        String sql = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            for (String comando : sql.split(";")) {
                String c = comando.trim();
                if (!c.isEmpty()) stmt.execute(c);
            }
        }
    }
}
