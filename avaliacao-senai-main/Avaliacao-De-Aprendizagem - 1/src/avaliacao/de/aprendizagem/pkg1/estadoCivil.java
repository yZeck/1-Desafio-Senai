/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.de.aprendizagem.pkg1;

/**
 *
 * @author Aluno
 */
public enum estadoCivil {
    SOLTEIRO("SOLTEIRO"),
    CASADO("CASADO"),
    SEPARADO("SEPARADO"),
    DIVORCIADO("DOVORCIADO"),
    VIUVO("VIUVO");
    
    
    private String texto;

    private estadoCivil(String texto) {
        this.texto = texto;
    }
      
    
}
