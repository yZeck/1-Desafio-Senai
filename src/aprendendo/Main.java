package aprendendo;

public class Main {
			public static void main(String args[]) {
				
				Funcionario Ronaldo = new Funcionario("Ronaldo",1500.0,25000.0);
				
				Ronaldo.calcComissao();
				Ronaldo.calcSalarioTotal();
				
			System.out.println("Seus dados são:");
			System.out.println("nome:" + Ronaldo.getNome());
			System.out.println("Seus dados :" + Ronaldo.getSalarioFixo());
			System.out.println("Salario total"+ Ronaldo.getSalarioTotal());
			
			}
	
}
