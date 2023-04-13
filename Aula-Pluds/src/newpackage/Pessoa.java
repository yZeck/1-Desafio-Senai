/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    
    private double salario;
    private LocalDate dataDeNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, double salario, LocalDate dataDeNascimento) {
        this.nome = nome;
        
        this.salario = salario;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

  

    public String getSalario() {
        return Util.formatarBrl(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeNascimento() {
        return Util.formatarData(dataDeNascimento);
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
    
}
