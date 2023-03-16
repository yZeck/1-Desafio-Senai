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
public class Fornecedor extends Pessoa {
    
    private String cnpj;
    private String inscricaoEstadual;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, int id, String nome, Genero genero, Endereco endereco, Setor setor) {
        super(id, nome, genero, endereco, setor);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Fornecedor " 
                + "cnpj" + this.cnpj 
                + "inscricaoEstadual" + this.inscricaoEstadual+
                "\nid"+  this.id +
                "\nnome"  + this.nome +
                "\nGenero" + this.genero+
                "\nEndereço --->" +
                "\nLogradouro" + this.endereco.getLogradouro()+
                "\nNumero" + this.endereco.getNumero()+
                "\nComplemento" + this.endereco.getComplemento()+
                "\nCep" + this.endereco.getCep()+
                "\nCidade" + this.endereco.getCidade()+
                "\nUF" + this.endereco.getUnidade();
    }
    
    
    
    
}
