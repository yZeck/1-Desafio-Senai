package aprendendo;

public class Funcionario {
			private String nome;
			private double salarioFixo;
			private double vendas;
			private double salarioTotal;
			private double comissao;
			
			
			
			public Funcionario(String nome, double salarioFixo, double vendas) {
				this.nome = nome;
				this.salarioFixo = salarioFixo;
				this.vendas = vendas;
			}

			
			
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public double getSalarioFixo() {
				return salarioFixo;
			}
			public void setSalarioFixo(double salarioFixo) {
				this.salarioFixo = salarioFixo;
			}
			public double getVendas() {
				return vendas;
			}
			public void setVendas(double vendas) {
				this.vendas = vendas;
			}
			
			public double calcComissao() {
				return comissao = this.vendas*0.15;
			}
			
			public double calcSalarioTotal(){
				return salarioTotal = comissao + salarioFixo;
			}



			public double getSalarioTotal() {
				return salarioTotal;
			}



			public double getComissao() {
				return comissao;
			}
			
			
}
			