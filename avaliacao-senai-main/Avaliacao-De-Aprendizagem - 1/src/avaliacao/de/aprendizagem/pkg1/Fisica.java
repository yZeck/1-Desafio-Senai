/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.de.aprendizagem.pkg1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    protected int idade;
    protected Genero genero;
    protected LocalDate dataNascimento;
    protected estadoCivil estado;

    public Fisica(int idade, Genero genero, LocalDate dataNascimento, estadoCivil estado, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.idade = idade;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.estado = estado;
    }

    

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public estadoCivil getEstado() {
        return estado;
    }

    public void setEstado(estadoCivil estado) {
        this.estado = estado;
    }

    

    

    public Fisica() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}
