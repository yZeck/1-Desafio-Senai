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
public class Coordenador extends Funcionario{

    public Coordenador() {
    }

    public Coordenador(String id, String nome, String idade, Genero genero) {
        super(id, nome, idade, Setores.COORDENACAO, genero);
    }
     @Override
    public String toString() {
        return "Coordenador-->"
                + "/nNome:"+ super.nome
                + "/Idade:"+ super.idade
                + "/Id:" + super.id
                + "Gênero:"+ super.genero;
    }
        
}
