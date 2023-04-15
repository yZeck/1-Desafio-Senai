/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia15deabril;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    protected String id;
    protected String nome;
    protected Genero genero;
    protected Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, Genero genero, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    
    
    
}
