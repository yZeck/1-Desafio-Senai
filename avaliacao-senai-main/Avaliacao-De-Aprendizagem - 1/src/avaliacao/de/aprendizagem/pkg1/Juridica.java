/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.de.aprendizagem.pkg1;

/**
 *
 * @author Aluno
 */
public abstract class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
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
        return   "Pessoa Juridica --> " +
                "\ncnpj= --> " + cnpj +
                "\n inscricaoEstadual= --> " + inscricaoEstadual +
                "\n Id --> " + this.id +
                "\nNome --> "+ this.nome + 
                "\nTelefone --> " + this.telefone +
                "\nemail --> " + this.email +
                "\nLogradouro: --> " + this.endereco.logradouro + 
                "\n Numero --> :"+ this.endereco.numero+
                "\nComplemento --> " + this.endereco.complemento +
                "\nCep --> "+ this.endereco.cep +
                "\n Unidade Federativa --> " + this.endereco.uf+
                "\nCidade --> " + this.endereco.cidade ;
                
    }

    
    
    
}
