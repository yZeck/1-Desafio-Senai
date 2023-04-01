/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.de.aprendizagem.pkg1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    
    protected Genero genero;
    protected LocalDate dataNascimento;
    protected estadoCivil estado;

    public Fisica( Genero genero, LocalDate dataNascimento, estadoCivil estado, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.estado = estado;
    }

    public int getIdade2(){
       return  LocalDate.now().getYear() - this.dataNascimento.getYear();
    }
    
    public int getIdade(){
       return  Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String getDataNascimento() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataNascimento.format(formatar);
        
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

   

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}
