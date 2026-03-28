package Controllers;

import Entitys.Ticket;
import Services.TicketService;

public class CidadaoController {

    private TicketService ticketService;

    public  CidadaoController(){
        ticketService = new TicketService();
    }

    public Ticket criarTicket(Ticket ticket){

        Ticket novoTicket = ticketService.criarTicket(ticket);
        return novoTicket;
    }
}
