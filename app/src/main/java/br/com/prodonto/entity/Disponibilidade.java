package br.com.prodonto.entity;

import java.util.Date;

public class Disponibilidade {

    private Date dataDispon;
    private String hora;
    private String dentista;

    public void disponibilidade(Date dataDispon, String hora, String dentista){
        this.dataDispon = dataDispon;
        this.hora = hora;
        this.dentista = dentista;
    }
    public Date getDataDispon() {
        return dataDispon;
    }

    public void setDataDispon(Date dataDispon) {
        this.dataDispon = dataDispon;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDentista() {
        return dentista;
    }

    public void setDentista(String dentista) {
        this.dentista = dentista;
    }

}
