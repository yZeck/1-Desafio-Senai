/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.de.aprendizagem.pkg1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class PrestacaoDeServico extends Juridica{
    
    protected LocalDate contratoInicio;
    protected LocalDate contratoFim;

    public PrestacaoDeServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    
    
    
    
    
    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
        
    

    

    @Override
    public String toString() {
        return "PrestacaoDeServico{" + 
                "\ncontratoInicio" + this.contratoInicio + 
                "\ncontratoFim" + this.contratoFim + 
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
