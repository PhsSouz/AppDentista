package br.com.prodonto.entity;

import java.util.ArrayList;

public class Paciente {

    private int codPacient;
    private String nome;
    private String emil;
    private String endereco;
    private int telefone;
    private String senha;

    public void pacient(int codPaciente, String nome, String email, String endereco, int telefone, String senha){
        this.codPacient = codPaciente;
        this.nome = nome;
        this.emil = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getCodPacient() {
        return codPacient;
    }

    public void setCodPacient(int codPacient) {
        this.codPacient = codPacient;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean efetuarLogin(){

        //==> CODE HERE <===
        return true;
    }

    public boolean agendarConsulta(Agendamento agendamento){

        //==> CODE HERE <===
        return true;
    }

    public boolean desmarcarConsulta(Agendamento agendamento){

        //==> CODE HERE <===
        return true;
    }

    public ArrayList<Agendamento> getAgendamento() {
        ArrayList<Agendamento> agendamento = new ArrayList<>();

        // para cada conta do banco de dados, contas.add

        return agendamento;
    }
    public ArrayList<Pagamento> getPagamentos() {
        ArrayList<Pagamento> pagamento = new ArrayList<>();

        // para cada conta do banco de dados, contas.add

        return pagamento;
    }

}
