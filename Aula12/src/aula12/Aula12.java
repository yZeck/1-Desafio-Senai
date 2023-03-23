
package aula12;

import java.time.LocalDate;
import java.time.Month;


public class Aula12 {

  
    public static void main(String[] args) {
     Funcionario funcionario = new Advogado("31212","231","123123","323","3232",2,"1212", Genero.FEMININO,
             new Endereco("3221","12123","1212", "1212","1212", UnidadeFederativa.GOIAS), Setor.SAUDE, LocalDate.of(2000, 01, 12));
        Funcionario funcionario1 = new Medico("31212","231","123123","323","3232",2,"1212", Genero.MASCULINO,
             new Endereco("3221","12123","1212", "1212","1212", UnidadeFederativa.GOIAS), Setor.SAUDE, LocalDate.of(2021, 03,12));
        Funcionario funcionario2 = new Engenheiro("31212","231","123123","323","3232",2,"1212", Genero.MASCULINO,
             new Endereco("3221","12123","1212", "1212","1212", UnidadeFederativa.GOIAS), Setor.SAUDE, LocalDate.of(2032, 01, 02));
        
        System.out.println(funcionario.toString());
        System.out.println("");
        System.out.println(funcionario1.toString());
        System.out.println("");
        System.out.println(funcionario2.toString());       
    }
    
}
