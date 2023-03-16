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
public class Medico extends Funcionario{
    private String CRM;

    public Medico() {
    }

    public Medico(String CRM, String cpf, String rg, String Salario, String matricula, int id, String nome, Genero genero, Endereco endereco, Setor setor) {
        super(cpf, rg, Salario, matricula, id, nome, genero, endereco, setor);
        this.CRM = CRM;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "Medico" + 
                "CRM" + CRM +
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
                "\nCidade" + this.endereco.getCidade();
                
    }
    
    
}
