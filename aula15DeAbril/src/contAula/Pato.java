/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contAula;

/**
 *
 * @author Aluno
 */
public class Pato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }
    @Override
    public void comer() {
        System.out.println("Frutas e Ração");
    }
}
