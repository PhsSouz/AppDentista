package br.com.prodonto.entity;

public class Dentista {

    private int codDentista;
    private String nome;
    private Double cargaHorario;
    private String email;
    private String telefone;
    private String agenda;

    public int getCodDentista() {
        return codDentista;
    }

    public void setCodDentista(int codDentista) {
        this.codDentista = codDentista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(Double cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public Dentista(int codDentista, String nome, Double cargaHorario, String email, String telefone, String agenda) {
        super();
        this.codDentista = codDentista;
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.email = email;
        this.telefone = telefone;
        this.agenda = agenda;
    }

    public boolean consultaHist(){

        return true;
    }

    public boolean consultaAgendamento(){

        return true;
    }

    public boolean getAgendamento(){

        return true;
    }

    public boolean setVerificarAgenda(){

        return true;
    }

}
