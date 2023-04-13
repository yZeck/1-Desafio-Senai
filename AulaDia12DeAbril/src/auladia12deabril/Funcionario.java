/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia12deabril;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{

  private String cpf;
  private String rg;
  private LocalDate dataNascimento;
  private double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, LocalDate dataNascimento, double salario, String id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
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

    public String getDataNascimento() {
        return Util.formatarData(dataNascimento);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSalario() {
        return Util.formatarBrl(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario" +
                "\ncp-->f" + this.cpf +
                ",\n rg-->" + this.rg +
                ",\n"+ " dataNascimento-->" + this.getDataNascimento()+
                ",\n salario-->" + this.getSalario() +
                "\n" + "id-->" + super.id +
                "\n" + "nome-->" + super.nome + 
                "\n" + "genero--> " + super.genero +
                "\n " + "Endereço ------------->"+
                "\n" + "Logradouro-->" + super.endereco.Logradouro+
                "\n" + "Número-->" + super.endereco.numero+
                "\n" + "Complemento-->" + super.endereco.complemento+
                "\n "+ "cep-->" + super.endereco.cep+
                "\n" + "cidae-->"+ super.endereco.cidade+
                "\n" + "uf-->" + super.endereco.uf;
    }
    
  
  
}
