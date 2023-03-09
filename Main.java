/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        //   Coordenador coordenador = new Coordenador("182712", "JO", "721", Genero.FEMININO);
        //   ProfessorDeDireito direito = new ProfessorDeDireito("121", "Charlles", "33", Genero.MASCULINO);
        //   ProfessorDeEngenharia engenharia = new ProfessorDeEngenharia("12312", "122", "GOOGLE", "34", Genero.MASCULINO);
        //   ProfessorDeNutricao nutricao = new ProfessorDeNutricao("1212", "12312", "3123", "44", Genero.FEMININO);
        //   Secretaria secretaria = new Secretaria("123", "Rosana", "12", Genero.FEMININO);
//
        //   System.out.println(coordenador.toString());
        //  System.out.println("");
        //   System.out.println(direito.toString());
        //   System.out.println("");
        //   System.out.println(engenharia.toString());
        //   System.out.println("");
        //   System.out.println(nutricao.toString());
        //   System.out.println("");
        //   System.out.println(secretaria.toString());

        //menu
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o nome do funcionário:");//
        String nome = scan.nextLine();
        System.out.println("Qual o identificador do funcionário:");
        String id = scan.nextLine();
        System.out.println("Qual a idade do funcionário:");
        String idade = scan.nextLine();
        System.out.println("Qual o gênero do funcionário? /n Por Favor, Digite 'F' ou 'M':");
        String genero = scan.nextLine();

        int i = 1;
        while (i != 0) {
            System.out.println("Digite o tipo de funcionario que vc que adcionar:");
            System.out.println("\n2_COORDENADOR \n3_PROFESSOR DE ENGENHARIA \n4_PROFESSOR DE ADVOCACIA \n5_ PROFESSOR DE NUTRICAO \n6_SECRETARIA \n7_SAIR");
            i = scan.nextInt();

            switch (i) {
                case 2:

                    Coordenador coordenador1 = new Coordenador();
                    coordenador1.setNome(nome);
                    coordenador1.setIdade(idade);
                    coordenador1.setId(id);
                    coordenador1.setSetor(Setores.COORDENACAO);
                    if (genero.equals("M")) {
                        coordenador1.setGenero(Genero.MASCULINO);
                    } else {
                        coordenador1.setGenero(Genero.FEMININO);
                    }
                    System.out.println("O COORDENADOR FOI CRIADO -- SEGUE OS DADOS:" + coordenador1.toString());

                    break;

                case 3:
                    ProfessorDeEngenharia engenharia1 = new ProfessorDeEngenharia();
                    System.out.println("Digite seu numero dO CREA");
                    engenharia1.setCREA(scan.nextLine());
                    engenharia1.setNome(nome);
                    engenharia1.setIdade(idade);
                    engenharia1.setId(id);
                    engenharia1.setSetor(Setores.ACADEMICO);
                    if (genero.equals("M")) {
                        engenharia1.setGenero(Genero.MASCULINO);
                    } else {
                        engenharia1.setGenero(Genero.FEMININO);
                    }
                    System.out.println("O PROFESSOR DE ENGENHARIA FOI CRIADO -- SEGUE OS DADOS:" + engenharia1.toString());

                    break;
                case 4:
                    ProfessorDeDireito direito1 = new ProfessorDeDireito();
                    System.out.println("Digite seu numero da OAB");
                    direito1.setOAB(scan.nextLine());
                    direito1.setNome(nome);
                    direito1.setIdade(idade);
                    direito1.setId(id);
                    direito1.setSetor(Setores.ACADEMICO);
                    if (genero.equals("M")) {
                        direito1.setGenero(Genero.MASCULINO);
                    } else {
                        direito1.setGenero(Genero.FEMININO);
                    }
                    System.out.println("O PROFESSOR DE DIREITO FOI CRIADO -- SEGUE OS DADOS:" + direito1.toString());

                    break;

                case 5:
                    ProfessorDeNutricao nutricao1 = new ProfessorDeNutricao();
                    System.out.println("Digite seu numero do CRN");
                    nutricao1.setCRN(scan.nextLine());
                    nutricao1.setNome(nome);
                    nutricao1.setIdade(idade);
                    nutricao1.setId(id);
                    nutricao1.setSetor(Setores.ACADEMICO);
                    if (genero.equals("M")) {
                        nutricao1.setGenero(Genero.MASCULINO);
                    } else {
                        nutricao1.setGenero(Genero.FEMININO);
                    }
                    System.out.println("O PROFESSOR DE NUTRICAO FOI CRIADO -- SEGUE OS DADOS:" + nutricao1.toString());

                    break;

                case 6:
                    Secretaria secretaria1 = new Secretaria();
                    secretaria1.setNome(nome);
                    secretaria1.setIdade(idade);
                    secretaria1.setId(id);
                    secretaria1.setSetor(Setores.SECRETARIA);
                    if (genero.equals("M")) {
                        secretaria1.setGenero(Genero.MASCULINO);
                    } else {
                        secretaria1.setGenero(Genero.FEMININO);
                    }
                    System.out.println("A SECRETARIA FOI CRIADA -- SEGUE OS DADOS:" + secretaria1.toString());

                    break;

                case 7:
                    i = 0;
                    nome = "";
                    id = "";
                    idade = "";
                    System.out.println("Você Saiu do Sistema!");
                    break;

                default:
                    System.out.println("Até mais!");
            }

        }

    }

}
