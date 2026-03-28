package Enums;

public enum Prioridade {
    Baixa(1),
    Normal(2),
    Alta(3),
    Urgente(4);

    private int valor;
    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static Prioridade fromId(int valor) {
        for (Prioridade p : Prioridade.values()) {
            if (p.valor == valor) {
                return p;
            }
        }
        return null;
    }
}
