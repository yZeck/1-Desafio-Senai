
package aula12;

import java.time.LocalDate;


public abstract class Funcionario extends Pessoa{
    private String cpf;
    private String rg;
    private String Salario;
    private String matricula;

    public Funcionario() {
        
    }

    public Funcionario(String cpf, String rg, String Salario, String matricula, int id, String nome, Genero genero, Endereco endereco, Setor setor, LocalDate date) {
        super(id, nome, genero, endereco, setor, date);
        this.cpf = cpf;
        this.rg = rg;
        this.Salario = Salario;
        this.matricula = matricula;
    }

  

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nFuncionario" + 
                "\ncpf" + this.cpf + 
                "\nrg" + this.rg + 
                "\nSalario" + this.Salario + 
                "\nmatricula" + this.matricula+
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
