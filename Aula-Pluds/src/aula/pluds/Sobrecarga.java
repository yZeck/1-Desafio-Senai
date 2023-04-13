/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pluds;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public class Sobrecarga {
   
    public String somar3(String a, String b){
        return a+"."+b;
    }

    public String somar(String a,LocalDate hoje,String c){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return a+"-"+hoje.format(formatar)+"." +c;
    }
    public void salvar(String a, String b){
        System.out.println(a+"."+b);
    }

    public void salvar2(String a,LocalDate hoje,String c){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(a + hoje.format(formatar)+"."+ c);
    }
    
    
    
    
    
}
