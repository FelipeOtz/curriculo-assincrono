package br.senac.tads.dsw.exemplos;

import java.time.LocalDate;
import java.util.List;

public class DadosPessoais {




    private String nome;

    private String imagem;

    private String email;

    private String telefone;

    private LocalDate dataNascimento;

    private List<Experiencias> experiencias;


    private List<Formacao> formacoes;

    private List<String> conhecimentos;


    public DadosPessoais(){

    }

    public DadosPessoais(String nome, String imagem, String email, String telefone, LocalDate dataNascimento, List<Experiencias> experiencias, List<Formacao> formacoes, List<String> conhecimentos) {
        this.nome = nome;
        this.imagem = imagem;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.experiencias = experiencias;
        this.formacoes = formacoes;
        this.conhecimentos = conhecimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Experiencias> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencias> experiencias) {
        this.experiencias = experiencias;
    }

    public List<Formacao> getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(List<Formacao> formacoes) {
        this.formacoes = formacoes;
    }

    public List<String> getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(List<String> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }



}
