/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", 2000, LocalDate.of(2000, 5, 20));
        System.out.println(pessoa.getNome() + "\n" + pessoa.getDataDeNascimento() + "\n" + pessoa.getSalario());
    }
    
}
