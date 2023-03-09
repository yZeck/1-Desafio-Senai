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
public class ProfessorDeDireito extends Funcionario{
       private String OAB;

    public ProfessorDeDireito() {
    }

    public ProfessorDeDireito(String id, String nome, String idade, Genero genero) {
        super(id, nome, idade, Setores.ACADEMICO, genero);
    }

    

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }

    @Override
    public String toString() {
        return "Professor de Direito"
                + "\nOAB-->" + this.OAB
                + "\nid-->" + super.id
                + "\nnome-->" + super.nome
                + "\nidade-->" + super.idade
                
                + "\nSetor-->" + super.setor
                + "\nGenero-->" + super.genero;
    }


}
