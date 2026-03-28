package Enums;

public enum StatusTicket {
    ABERTO(1),
    TRIAGEM(2),
    EM_ANDAMENTO(3),
    RESOLVIDO(4),
    FECHADO(5);

    private int valor;
    StatusTicket(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static StatusTicket fromId(int valor) {
        for (StatusTicket s : StatusTicket.values()) {
            if (s.getValor() == valor) {
                return s;
            }
        }
        return null;
    }
}
