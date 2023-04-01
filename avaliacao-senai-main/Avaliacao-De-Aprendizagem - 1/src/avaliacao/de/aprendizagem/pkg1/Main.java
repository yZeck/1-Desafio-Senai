
package avaliacao.de.aprendizagem.pkg1;

import java.time.LocalDate;
import java.time.Month;


public class Main {

  
    public static void main(String[] args) {
        Advogado funcionario1 = new Advogado("23123", "1212","123","1212", Setor.SAUDE,59.00, 121, Genero.FEMININO, LocalDate.of(1000, 3, 2), estadoCivil.CASADO, 2, "Carlos", "75912122", "lslacs.@gmail.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        
        Medico funcionario2 = new Medico("23123", "1212","123","1212", Setor.SAUDE,59.00, 121, Genero.FEMININO, LocalDate.of(1000, 3, 2), estadoCivil.CASADO, 2, "Carlos", "75912122", "lslacs.@gmail.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        
        Engenheiro funcionario3 = new Engenheiro("23123", "1212","123","1212", Setor.SAUDE,59.00, 121, Genero.FEMININO, LocalDate.of(1000, 3, 2), estadoCivil.CASADO, 2, "Carlos", "75912122", "lslacs.@gmail.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        
        Fornecedor google = new Fornecedor("1212", "121212", 212, "ORACLE","12121212", "LASASLK2@GMAI.COM", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
        
        PrestacaoDeServico notaFiscal = new PrestacaoDeServico(LocalDate.of(2999, Month.MARCH, 2), LocalDate.of(2999, Month.MARCH, 2), "123232", "1231231",1212, "lucas","1312312", "ls@gmail.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
                
        Cliente cliente = new Cliente(1212, 1212, Genero.FEMININO, LocalDate.of(2999, Month.MARCH, 2), estadoCivil.CASADO, 2, "Curica","721233122","1231231212@gmail.com", 
                new Endereco("Rua Rezende Costa", "21", "Casa", "40430-000", "Salvador", UnidadeFederativa.BAHIA));
                
        
        
        
        System.out.println("");
        System.out.println(funcionario1.toString());
        System.out.println("");
        System.out.println(funcionario2);
        System.out.println("");
        System.out.println(funcionario3);
        System.out.println(""); 
        System.out.println(notaFiscal.toString());
        System.out.println("");
        System.out.println(google.toString());
        System.out.println("");
        System.out.println(cliente.toString());
    
    }
    
}
