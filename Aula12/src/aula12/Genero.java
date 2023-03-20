/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Aluno
 */
public enum Genero {
   
   
    MASCULINO('M',"Masculino"),
    FEMININO('F', "Feminino");
    
  protected char sexo;
  protected String Genero;

    private Genero(char sexo, String Genero) {
        this.sexo = sexo;
        this.Genero = Genero;
    }

    public char getSexo() {
        return sexo;
    }

    public String getGenero() {
        return Genero;
    }

   
   
}
