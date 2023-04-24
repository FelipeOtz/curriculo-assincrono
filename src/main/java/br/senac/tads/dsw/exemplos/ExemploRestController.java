package br.senac.tads.dsw.exemplos;

import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class ExemploRestController {


    @GetMapping("/dados")
    public DadosPessoais exemplo03Plus() {
        DadosPessoais dados = new DadosPessoais( );
        dados.setNome("Felipe Ortiz");
        dados.setEmail("felipeht25@gmail.com");
        dados.setTelefone("(11) 94273-5161");
        dados.setDataNascimento(LocalDate.of(2002,8,25));
        dados.setImagem("img/Felipe_Foto.jpg");

        Experiencias experienciasAmazon = new Experiencias("Amazon Brasil","BI Developer",LocalDate.of(2022,9,30),LocalDate.of(2023,12,30) );


        Experiencias experienciasCnx = new Experiencias("Concentrix","Assistente administrativo",LocalDate.of(2021,1,30),LocalDate.of(2021,12,30) );


        List<Experiencias> listExperiencias = new ArrayList<>();
        listExperiencias.add(experienciasAmazon);
        listExperiencias.add(experienciasCnx);


        dados.setExperiencias(listExperiencias);


        Formacao formacaoTADS = new Formacao("Técnologia em Análise e desenvolvimento de sistemas", "Centro Universitário Senac", LocalDate.of(2023, 12,30));

        Formacao formacaoTEc = new Formacao("Ensino Técnico em Informática", "Senac Largo Treze", LocalDate.of(2020, 12,15));


        List<Formacao> formacoes = new ArrayList<>();
        formacoes.add(formacaoTADS);
        formacoes.add(formacaoTEc);



        dados.setFormacoes(formacoes);


        List<String> conhecimentos = new ArrayList<>();
        conhecimentos.add("Java");
        conhecimentos.add("HTML");
        conhecimentos.add("CSS");
        conhecimentos.add("Javascript");
        conhecimentos.add("Python");


        dados.setConhecimentos(conhecimentos);



        return dados;
    }



}