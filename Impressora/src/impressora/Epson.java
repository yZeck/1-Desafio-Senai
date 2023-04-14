/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

/**
 *
 * @author Aluno
 */
public class Epson implements impressora{

    @Override
    public void imprimir() {
        System.out.println("A impressora Epson está sendo atualizada...");
        System.out.println("Iniciando a impressão!");
    }
    
}
