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
public class Galo implements Animal{
     @Override
    public void emitirSom() {
        System.out.println("Cocoricó");   
        
    }
    @Override
    public void comer() {
       System.out.println("Milho");
    }
}
