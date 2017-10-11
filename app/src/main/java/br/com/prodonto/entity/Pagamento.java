package br.com.prodonto.entity;

import java.util.Date;

public class Pagamento{

    private int codPaciente;
    private Date dataPagto;
    private int codDentista;
    private Double valor;
    private Boolean status;

    public void pagamento(int codPaciente, Date dataPagto, int codDentista, Double valor, Boolean status){
        this.codPaciente = codPaciente;
        this.codDentista = codDentista;
        this.dataPagto = dataPagto;
        this.valor = valor;
        this.status = status;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public Date getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(Date dataPagto) {
        this.dataPagto = dataPagto;
    }

    public int getCodDentista() {
        return codDentista;
    }

    public void setCodDentista(int codDentista) {
        this.codDentista = codDentista;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public boolean consultarValor(){

        //==> CODE HERE <===
        return true;
    }

    public boolean solicitarBoleto(){

        //==> CODE HERE <===
        return true;
    }
}
