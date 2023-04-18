
package aula17deabril;

import java.time.LocalDate;


public class Gerente extends cargoDeConfianca{

    public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(Bonificacao.GERENTE, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    public Gerente() {
    }

   public double getSalarioFinal(){
        return (super.salarioBase * super.bonificacao.GERENTE.getValor()) + super.salarioBase;
    }
   

    @Override
    public String toString() {
        return "Gerente-->" + 
                 "\nNome-->"  + super.nome +
                 "\nCPF-->" + super.cpf + 
                 "\nRg-->" + super.rg +
                 "\nGenero-->" + super.genero.name() + 
                 "\nSalário Base-->" + Util.fortamarNumero(super.salarioBase) +
                 "\nData Adimissão-->" + Util.formatarData(super.dataAdmissao) +
                 "\nSalrio Final-->" + Util.fortamarNumero(this.getSalarioFinal()) +
                 "\n Bonificação-->" +  Util.formatarPorcentagem(Bonificacao.GERENTE.getValor());
                  
    }
    
    
    
    
}
