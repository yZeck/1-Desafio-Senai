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
public abstract class cargoDeConfianca extends  Funcionario{
    protected Bonificacao bonificacao;

    public cargoDeConfianca(Bonificacao bonificao,String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public cargoDeConfianca() {
    }
    
    
}
