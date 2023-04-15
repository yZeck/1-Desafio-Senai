/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15deabril;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        operacaoMatematica cal= new Soma();
        operacaoMatematica cal2= new Subtracao();
        operacaoMatematica cal3= new  Divisao();
        operacaoMatematica cal4= new Multiplicacao();
        
        System.out.println(cal.calcular(5, 6)); 
        System.out.println("");
        System.out.println(cal2.calcular(5, 6)); 
        System.out.println("");
        System.out.println(cal3.calcular(5, 6)); 
        System.out.println("");
        System.out.println(cal4.calcular(5, 6)); 
        System.out.println("");
        
        
    }
} 
 