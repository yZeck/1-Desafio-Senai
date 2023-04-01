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
public abstract class Funcionario extends Fisica{
    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected Double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor setor, Double salario, Genero genero, LocalDate dataNascimento, estadoCivil estado, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, dataNascimento, estado, id, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

  

  


   

    public Funcionario() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
}
