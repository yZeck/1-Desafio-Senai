/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {

    protected int id;
    protected String nome;
    protected Genero genero;
    protected Endereco endereco;
    protected Setor setor;
    protected LocalDate date;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, Genero genero, Endereco endereco, Setor setor, LocalDate date) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.endereco = endereco;
        this.setor = setor;
        this.date = date;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String getDate() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatar);
    }

    
    
}
