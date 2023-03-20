/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Lucas
 */
public class Advogado extends Funcionario{
    private String OAB;

    public Advogado() {
    }

    public Advogado(String OAB, String cpf, String rg, String Salario, String matricula, int id, String nome, Genero genero, Endereco endereco) {
        super(cpf, rg, Salario, matricula, id, nome, genero, endereco, Setor.JURIDICO);
        this.OAB = OAB;
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }

    @Override
    public String toString() {
        return "Advogado" + 
                "OAB:" + OAB+
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
