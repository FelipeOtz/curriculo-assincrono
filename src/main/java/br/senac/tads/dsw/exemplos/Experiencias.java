package br.senac.tads.dsw.exemplos;

import java.time.LocalDate;

public class Experiencias {

    String empresa;
    String cargo;
    LocalDate dataInicio;

    LocalDate dataTermino;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }



    public Experiencias() {
    }


    public Experiencias(String empresa, String cargo, LocalDate dataInicio, LocalDate dataTermino) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }


}
