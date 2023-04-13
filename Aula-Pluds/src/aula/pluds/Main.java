/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pluds;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();
        System.out.println(sobrecarga.somar("Receita", LocalDate.now(), "doc"));
        
        sobrecarga.salvar("Receita", "doc");
        sobrecarga.salvar2("Receita", LocalDate.now(), "doc");
        
    }
    
}
