
package aula12;


public class Aula12 {

  
    public static void main(String[] args) {
     Funcionario funcionario = new Funcionario("2323213","323213","213123", "3232",123213, "LUCAS", Genero.FEMININO,
             new Endereco("Rua Santos","11","Prédio","43000","Salvador", UnidadeFederativa.BAHIA));
     
        System.out.println(funcionario.toString());
        
        Fornecedor fornecedor = new Fornecedor("2323213","323213","213123", "3232",123213, "LUCAS",Genero.FEMININO,
               new Endereco("Rua Santos","11","Prédio","43000","Salvador", UnidadeFederativa.ACRE));
        
        System.out.println(fornecedor.toString());
    }
    
}
