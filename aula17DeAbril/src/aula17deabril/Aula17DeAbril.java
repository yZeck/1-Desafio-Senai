/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17deabril;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Aula17DeAbril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario1 = new Diretor("Homen","1231331", "43434", Genero.MASCULINO, 100.00, LocalDate.of(2000, Month.MARCH, 3));
        Funcionario funcionario2 = new Moroboy("323-23-423", "Gkay", "31323", "13212", Genero.FEMININO, 100.00, LocalDate.of(2012, Month.MARCH, 3));
        Funcionario funcionario3 = new Gerente("jane", "99993", "01290", Genero.FEMININO, 100.00, LocalDate.of(2000, Month.MARCH, 2));

        
        
        System.out.println("");
        System.out.println(funcionario1.toString());
        System.out.println("");
        System.out.println(funcionario2.toString());
        System.out.println("");
       System.out.println(funcionario3.toString());
                
                }
    
}
