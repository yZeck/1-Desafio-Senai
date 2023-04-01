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
public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, Double salario, Genero genero, LocalDate dataNascimento, estadoCivil estado, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, dataNascimento, estado, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    

    

    

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro" +
                "\ncrea -->" + crea +
                 "\n Id -->" + this.id +
                "\n Idade -->" + this.getIdade2()+
                "\n Genero -->" + this.genero+
                "\nNome -->"+ this.nome + 
                "\nTelefone -->" + this.telefone +
                "\nemail -->" + this.email +
                "\n Cpf -->"+ this.cpf+
                "\nRG -->" + this.rg+
                "\n Matricula -->" + this.matricula+
                "\nSetor -->"+ this.setor+
                "\nSalario -->" + this.salario+
                "\nLogradouro: -->" + this.endereco.logradouro + 
                "\n Numero -->:"+ this.endereco.numero+
                "\nComplemento -->" + this.endereco.complemento +
                "\nCep -->"+ this.endereco.cep +
                "\nCidade -->" + this.endereco.cidade + 
                "\n Unidade Federativa -->" + this.endereco.uf +
                "\n Data de Nascimento --> " + this.getDataNascimento() +
                "\n Estado civil -->" + this.estado;
                
    }
    
    
}
