package br.senac.tads.dsw.exemplos;

import java.time.LocalDate;

public class Formacao {


    String curso;

    String instituicao;

    LocalDate dataConclusao;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Formacao() {
    }


    public Formacao(String curso, String instituicao, LocalDate dataConclusao) {
        this.curso = curso;
        this.instituicao = instituicao;
        this.dataConclusao = dataConclusao;
    }

}


