/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia12deabril;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
        
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, String id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
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

    public String getDataInicio() {
        return Util.formatarData(dataInicio);
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return Util.formatarData(dataInicio);
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getValorContrato() {
        return Util.formatarBrl(valorContrato);
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return "Juridica" + 
                "\ncnpj-->" + this.cnpj +
                "\n inscricaoEstadual-->" + this.inscricaoEstadual + 
                "\n dataInicio-->" + this.getDataInicio() + 
                "\n dataTermino-->" + this.getDataTermino() + 
                "\n valorContrato-->" + this.getValorContrato() +
                "\n" + "id-->" + super.id +
                "\n" + "nome-->" + super.nome + 
                "\n" + "genero--> " + super.genero +
                "\n " + "Endereço ------------->"+
                "\n" + "Logradouro-->" + super.endereco.Logradouro+
                "\n" + "Número-->" + super.endereco.numero+
                "\n" + "Complemento-->" + super.endereco.complemento+
                "\n "+ "cep-->" + super.endereco.cep+
                "\n" + "cidae-->"+ super.endereco.cidade+
                "\n" + "uf-->" + super.endereco.uf;
                
    }
    
    
    
    
    
}
