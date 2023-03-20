
package aula12;


public class Aula12 {

  
    public static void main(String[] args) {
      
        Pessoa funcionario = new Advogado("1221313","2323213","323213","213123", "3232",123213, "LUCAS", Genero.FEMININO,
                new Endereco("Rua Santos","11","Prédio","43000","Salvador", UnidadeFederativa.TOCATINS));
        Pessoa funcionario2 = new Medico("1221313","2323213","323213","213123", "3232",123213, "LUCAS", Genero.FEMININO,
                new Endereco("Rua Santos","11","Prédio","43000","Salvador", UnidadeFederativa.TOCATINS));
        Pessoa funcionario3 = new Engenheiro("1221313","2323213","323213","213123", "3232",123213, "LUCAS", Genero.FEMININO,
                new Endereco("Rua Santos","11","Prédio","43000","Salvador", UnidadeFederativa.TOCATINS));
     
        System.out.println(funcionario.toString());
        System.out.println("");
        System.out.println(funcionario2.toString());
        System.out.println("");
        System.out.println(funcionario3.toString());
        
       
        
       
    }
    
}
