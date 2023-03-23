/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    private String CREA;

    public Engenheiro() {
    }

    public Engenheiro(String CREA, String cpf, String rg, String Salario, String matricula, int id, String nome, Genero genero, Endereco endereco, Setor setor, LocalDate date) {
        super(cpf, rg, Salario, matricula, id, nome, genero, endereco, setor, date);
        this.CREA = CREA;
    }

    

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + 
                "CREA=" + CREA + 
                "\ncpf" + this.getCpf()+ 
                "\nrg" + this.getRg() + 
                "\nSalario" + super.getSalario() + 
                "\nmatricula" + super.getMatricula()+
                "\nid"+  this.id +
                "\nnome"  + this.nome +
                "\nGenero" + this.genero+
                "\nEndereço --->"+
                "\nLogradouro" + this.endereco.getLogradouro()+
                "\nNumero" + this.endereco.getNumero()+
                "\nComplemento" + this.endereco.getComplemento()+
                "\nCep" + this.endereco.getCep()+
                "\nCidade" + this.endereco.getCidade()+
                "\nData" + this.getDate();
                
               
    }

     
   
    
}
