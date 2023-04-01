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
public class Fornecedor extends Juridica {
        
        private String produto;

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + 
                "\nproduto" + this.produto + 
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
