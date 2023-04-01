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
public enum Genero {
    MASCULINO("MASCULINO",'M'),
    FEMININO("FEMININO",'F');
    
    private String texto;
    private char sigla;

    private Genero(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }

    
}
