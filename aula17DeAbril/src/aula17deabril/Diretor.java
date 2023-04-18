
package aula17deabril;

import java.time.LocalDate;


public class Diretor extends cargoDeConfianca{
    private final double PARCIPACAO_LUCRO = 0.1;

    public Diretor() {
    }

    public Diretor( String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(Bonificacao.DIRETOR, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }
    
    
    public double getSalarioFinal(){
        double salrioFinal= 0;
        salrioFinal += this.salarioBase * PARCIPACAO_LUCRO;
        salrioFinal += this.salarioBase * this.bonificacao.DIRETOR.getValor();
        salrioFinal += this.salarioBase;
         return salrioFinal;
    }

    @Override
    public String toString() {
        return "Diretor-->" + 
              
                "\nNome-->"  + super.nome +
                 "\nCPF-->" + super.cpf + 
                 "\nRg-->" + super.rg +
                 "\nGenero-->" + super.genero.name() + 
                "\nSalário Base-->" + Util.fortamarNumero(super.salarioBase) +
                 "\nData Adimissão-->" + Util.formatarData(super.dataAdmissao) +
                 "\nSalrio Final-->" + Util.fortamarNumero(this.getSalarioFinal()) +
                 "\n Bonificação-->" + Util.formatarPorcentagem(bonificacao.DIRETOR.getValor()) +
                "\nsoma lucro_e_bonificação-->" + Util.formatarPorcentagemDeDoisIndices(PARCIPACAO_LUCRO, bonificacao.DIRETOR.getValor()) +
                 "\nPARCIPACAO_LUCRO-->" + Util.formatarPorcentagem(PARCIPACAO_LUCRO) ;
    }
    
    
}
