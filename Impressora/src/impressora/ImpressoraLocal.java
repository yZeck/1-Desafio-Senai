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
public class ImpressoraLocal {
   
    
    private impressora impressora;
      public void ligar (impressora impressora){
        this.impressora = impressora;
        System.out.println("Ligando a impressora " + impressora.getClass().getSimpleName()+ "...");
    }
    
    public void imprimir () {
        this.impressora.imprimir();
    }
    
    public void desligar (){
        System.out.println("Desligando a impressora "  + impressora.getClass().getSimpleName()+ "...");
    }
    
}

 /*
    public void ligar (){
        System.out.println("Ligando a impressora...");
    }
    
    public void imprimir ( Impressora impressora){
        this.impressora = impressora;
        impressora.imprimir();
    }
    
    public void desligar (){
        System.out.println("Desligando a impressora...");
    }*/
