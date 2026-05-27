package demo.models;

public class DiaSemana {
    public enum DiaSemanas {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO;

        public String getLabel() {
            return switch (this) {
                case SEGUNDA -> "Segunda-feira";
                case TERCA   -> "Terça-feira";
                case QUARTA  -> "Quarta-feira";
                case QUINTA  -> "Quinta-feira";
                case SEXTA   -> "Sexta-feira";
                case SABADO  -> "Sábado";
                case DOMINGO -> "Domingo";
            };
        }

        public static DiaSemanas fromString(String valor) {
            for (DiaSemanas dia :  DiaSemanas.values()) {
                if (dia.getLabel().equals(valor) || dia.getLabel().equalsIgnoreCase(valor)) {
                    return dia;
                }
            }
            throw new IllegalArgumentException("Dia invalido: " + valor);
        }
    }
}
