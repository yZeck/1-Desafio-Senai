/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17deabril;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public class Util {
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return data.format(formatar);
    }
    public static String fortamarNumero(double valor){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
    }
    public static String formatarPorcentagemDeDoisIndices(double comissao, double bonificao){
        double resultado = (comissao + bonificao) *100.00;
        return resultado + "%";
    }
    public static String formatarPorcentagem(double x){
        double resultado = x*100.00;
        return resultado + "%";
    }
    
}
