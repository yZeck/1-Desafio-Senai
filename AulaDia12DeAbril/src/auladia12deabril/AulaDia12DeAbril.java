
package auladia12deabril;

import java.time.LocalDate;


public class AulaDia12DeAbril {

    
    public static void main(String[] args) {
        Funcionario funcionari = new Funcionario("121212121", "121212", LocalDate.now(), 1212, "21212", "Alfreedo", Genero.FEMININO, 
                new Endereco("Rua Ruy Barbosa", "33","Edifício", "40500", "Salvado", "BA"));
        
        Juridica juridica = new  Juridica("1231231","3243542", LocalDate.now(), LocalDate.now(), 132123, "123","Solutions", Genero.FEMININO, 
                new Endereco("Rua Ruy Barbosa", "33","Edifício", "40500", "Salvado", "BA"));
        
        
        System.out.println(funcionari.toString());
           System.out.println("");
        System.out.println(juridica.toString());
                
        
    }
    
}
