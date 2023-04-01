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
public enum Setor {
    ENGENHARIA("ENGENHARIA"),
    SAUDE("SAUDE"),
    JURIDICO("JURIDICO");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }
    
}
