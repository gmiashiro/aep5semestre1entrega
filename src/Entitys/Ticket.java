package Entitys;

import Enums.Categoria;
import Enums.Prioridade;
import Enums.StatusTicket;

import java.time.LocalDateTime;
import java.util.List;

public class Ticket {
    private Long protocolo;
    private String titulo;
    private LocalDateTime dataCriacao;
    private Categoria categoria;
    private String descricao;
    private String localizacaoEndereco;
    private String bairro;
    private StatusTicket status;
    private Prioridade prioridade;
    private LocalDateTime prazoSLA;
    private int idUsuario;
    private List<TicketHistorico> listaDeHistoricos;

    public Ticket(){

    }

    public Long getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Long protocolo) {
        this.protocolo = protocolo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacaoEndereco() {
        return localizacaoEndereco;
    }

    public void setLocalizacaoEndereco(String localizacaoEndereco) {
        this.localizacaoEndereco = localizacaoEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public StatusTicket getStatus() {
        return status;
    }

    public void setStatus(StatusTicket status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getPrazoSLA() {
        return prazoSLA;
    }

    public void setPrazoSLA(LocalDateTime prazoSLA) {
        this.prazoSLA = prazoSLA;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<TicketHistorico> getListaDeHistoricos() {
        return listaDeHistoricos;
    }

    public void setListaDeHistoricos(List<TicketHistorico> listaDeHistoricos) {
        this.listaDeHistoricos = listaDeHistoricos;
    }
}
