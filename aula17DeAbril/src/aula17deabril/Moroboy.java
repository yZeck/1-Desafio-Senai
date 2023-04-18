/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17deabril;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Moroboy extends Funcionario{
    
    private String placaDaMoto;

    public Moroboy() {
    }

    public Moroboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "\nMoroboy-->" + 
                "\nplacaDaMoto-->" + this.placaDaMoto + 
                 "\nNome-->"  + super.nome +
                 "\nCPF-->" + super.cpf + 
                 "\nRg-->" + super.rg +
                 "\nGenero-->" + super.genero.name() + 
                 "\nSalário Base-->" + Util.fortamarNumero(salarioBase)+
                 "\nData Adimissão-->" + Util.formatarData(dataAdmissao);
    }
    
    
}
