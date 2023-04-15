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
public class Main {
    public static void main(String[] args) {
        Animal k0 = new Gato();
        Animal k1 = new Galo();
        Animal k2 = new Pato();
        Animal k3 = new Cachorro();
        
        System.out.println("GATO");
        k0.comer();
        k0.emitirSom();
        System.out.println("");
        System.out.println("GALO");
        k1.comer();
        k1.emitirSom();
        System.out.println("");
        System.out.println("PATO");
        k2.comer();
        k2.emitirSom();
        
        System.out.println("");
        System.out.println("CACHORRO");
        k3.comer();
        k3.emitirSom();
    }
}
