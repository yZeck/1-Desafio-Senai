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
public class Gato implements Animal{
    
     @Override
    public void emitirSom() {
        System.out.println("Miau Miau");   
        
    }
    @Override
    public void comer() {
       System.out.println("Ração de gato");
    }
}
