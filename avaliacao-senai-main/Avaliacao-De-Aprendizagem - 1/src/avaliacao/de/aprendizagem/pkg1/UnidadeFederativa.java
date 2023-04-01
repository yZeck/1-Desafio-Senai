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
public enum UnidadeFederativa {
    BAHIA("BAHIA","BA"),
    SAO_PAULO("SAOPULO","SP"),
    RIO_DE_JANEIRO("RIODEJANEIRO","RJ"),
    ACRE("ACRE","AC"),
    ALAGOAS("ALAGOAS","AL"),
    AMAPA("AMAPÁ","AP"),
    AMAZONAS("Amazonas","AM"),
    CEARA("CEARÁ","CE"),
    ESPIRITO_SANTO("ESPIRITO SANTO","ES"),
    GOIAS("GOIÁS","GO"),
    MARANHAO("MARANHAO","MA"),
    MATO_GROSSO("MATO GROSSO","MT"),
    MATO_GROSSO_DO_SUL("MATO GROSSO DO SUL","MTS"),
    MINAS_GERAIS("MINAS GERAIS","MG"),
    PARA("PARÁ","PA"),
    PARAÍBA("PARAIBA","PB"),
    PARANA("PARANÁ","PR"),
    PERNAMBUCO("PERNAMBUCO","PE"),
    PIAUÍ("PIUÍ","PI"),
    
    RIO_GRNADE_DO_NORTE("RIO GRANDE DO NORTE","RN"),
    RIO_GRANDE_DO_SUL("RIO GRANDE DO SUL","RS"),
    RONDONIA("RONDÔNIA","RO"),
    RORAIMA("RORAIMA","RR"),
    SANTA_CATARINA("SANTA CATARINA","SC"),
    SERGIPE("SEGIPE","SE"),
    TOCANTIS("TOCANTIS","TO"),
    DISTRITO_FEDERAL("DISTRITO FEDERAL","DF");
    
    ;
    
    private String nome;
    private String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.nome = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
