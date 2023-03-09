/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Aluno
 */
public class ProfessorDeNutricao extends Funcionario{
    private String CRN;

    public ProfessorDeNutricao() {
    }

    public ProfessorDeNutricao(String CRN, String id, String nome, String idade, Genero genero) {
        super(id, nome, idade, Setores.ACADEMICO, genero);
        this.CRN = CRN;
    }

    
    

    
    public String getCRN() {
        return CRN;
    }

    public void setCRN(String CRN) {
        this.CRN = CRN;
    }
    
     @Override
    public String toString() {
        return "Professor de Nutrição" 
                + "\nCRN-->" + CRN
                + "\nid-->" + super.id
                + "\nnome-->" + super.nome
                + "\nidade-->" + super.idade
                + "\nSetor-->" + super.setor
                + "\nGenero-->" + super.genero;
        
}
}