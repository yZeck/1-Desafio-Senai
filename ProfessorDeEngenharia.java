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
public class ProfessorDeEngenharia extends Funcionario{
        private String CREA;

    public ProfessorDeEngenharia() {
    }

    public ProfessorDeEngenharia(String CREA, String id, String nome, String idade, Genero genero) {
        super(id, nome, idade, Setores.ACADEMICO, genero);
        this.CREA = CREA;
    }

    

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    @Override
    public String toString() {
        return "Professor de Engenharia"
                + "\nCREA-->" + this.CREA
                + "\nid-->" + super.id
                + "\nnome-->" + super.nome
                + "\nidade-->" + super.idade
                + "\nSetor-->" + super.setor
                + "\nGenero-->" + super.genero;
    }

    
}
