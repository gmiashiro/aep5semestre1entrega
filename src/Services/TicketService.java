package Services;

import Entitys.Ticket;
import Enums.Prioridade;
import Enums.StatusTicket;

import java.time.LocalDateTime;

public class TicketService {


    public Ticket criarTicket(Ticket novoTicket){

        novoTicket.setProtocolo(System.currentTimeMillis());
        novoTicket.setDataCriacao(LocalDateTime.now());
        novoTicket.setStatus(StatusTicket.ABERTO);
        LocalDateTime prazo = calcularPrazoSlA(novoTicket.getPrioridade(), novoTicket.getDataCriacao());
        novoTicket.setPrazoSLA(prazo);

        return novoTicket;
    }

    private LocalDateTime calcularPrazoSlA (Prioridade prioridade, LocalDateTime prazo){
        if(prioridade == null){
            return prazo.plusDays(30);
        }

        switch (prioridade) {
            case Urgente:
                return prazo.plusDays(2);
            case Alta:
                return prazo.plusDays(7);
            case Normal:
                return prazo.plusDays(15);
            case Baixa:
            default:
                return prazo.plusDays(30);
        }
    }
}
