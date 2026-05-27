package demo.models;

public class Cargo {
    public enum Cargos {
        DESENVOLVEDOR,
        GERENTE,
        VENDEDOR,
        ADMINISTRADOR;

        public String getLabel() {
            return switch (this) {
                case DESENVOLVEDOR -> "Desenvolvedor";
                case GERENTE -> "Gerente";
                case VENDEDOR -> "Vendedor";
                case ADMINISTRADOR -> "Administrador";
            };
        }

        public static Cargos fromString(String valor) {
            for (Cargos c : values()) {
                if (c.name().equalsIgnoreCase(valor) || c.getLabel().equalsIgnoreCase(valor)) {
                    return c;
                }
            }
            throw new IllegalArgumentException("Cargo inválido: " + valor);
        }
    }
}