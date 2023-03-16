/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

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

    public Pessoa() {
    }

    public Pessoa(int id, String nome, Genero genero, Endereco endereco, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.endereco = endereco;
        this.setor = setor;
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

    
    
}
