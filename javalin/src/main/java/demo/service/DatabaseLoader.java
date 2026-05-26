package demo.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.util.stream.Stream;


public class DatabaseLoader {

    private final Connection connection;
    private final String pastaScripts = "database/";

    public DatabaseLoader(Connection connection) {
        this.connection = connection;
    }

    public void inicializarBanco() {
        executarScript("criacao_banco.sql");
        executarScript("dados_iniciais.sql");

        System.out.println("BANCO INICIADO");
    }

    public void executarScript(String nomeArquivo) {
        Path caminho = Paths.get(pastaScripts + nomeArquivo);

        if (!Files.exists(caminho)){
            throw new RuntimeException("Arquivo SQL nao encontrado: " +  nomeArquivo);
        }

        try {
            String conteudo = Files.readString(caminho);
            String[] comandos = conteudo.split(";");

            try (Statement stmt = connection.createStatement()) {
                for (String comando : comandos) {
                    comando = comando.trim();

                    if (!comando.isEmpty()) {
                        stmt.execute(comando);
                    }
                }
            }
            System.out.println("BANCO EXECUTADO");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao executar script SQL: " + nomeArquivo, e);
        }
    }

    public void resetarBanco() {
        executarScript("limpar_banco.sql");
        executarScript("banco resetado com suceso");
    }

}
