package br.com.prodonto.entity;

import java.util.ArrayList;
import java.util.Date;

public class Agendamento {

    private int codAgendamento;
    private Date data;
    private String paciente;
    private String dentista;

    public void agendamento(int codAgendamento, Date data, String paciente, String dentista) {
        this.codAgendamento = codAgendamento;
        this.data = data;
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public int getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(int codAgendamento) {
        this.codAgendamento = codAgendamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDentista() {
        return dentista;
    }

    //Irá retornar as datas de disponibidade do dentista
    public ArrayList<Disponibilidade> verificarDisponibilidades(String data) {
        return verificarDisponibilidades(data);
    }

    public boolean setCancelar(){

        //==> CODE HERE <===
        return true;
    }

    public boolean setAgendamento(){

        //==> CODE HERE <===
        return true;
    }

}

