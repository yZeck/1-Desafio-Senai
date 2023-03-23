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
public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String oab, String cpf, String rg, String Salario, String matricula, int id, String nome, Genero genero, Endereco endereco, Setor setor, LocalDate date) {
        super(cpf, rg, Salario, matricula, id, nome, genero, endereco, setor, date);
        this.oab = oab;
    }

    
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "Advogado -->" + 
                "oab" + this.oab +
                "\ncpf" + this.getCpf() + 
                "\nrg" + super.getRg() + 
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
