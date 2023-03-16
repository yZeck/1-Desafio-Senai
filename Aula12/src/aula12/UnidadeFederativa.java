/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {

    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    MATO_GROSSO("Mato_Grosso", "MT"),
    MATO_GROSSO_DO_SUL("Mato_Grosso_Do_Sul", "MG"),
    PARANA("PARANA", "PR"),
    PARA("PARA", "PA"),
    TOCATINS("TOCANTIS", "TO"),
    PERNAMBUCO("PERNAMBUCO", "PE"),
    CEARA("CEARÁ", "CA"),
    SERGIPE("SERGIPE", "SE"),
    MARANHAO("MARANHÃO", "MA"),
    RIO_GRANDE_DO_SUL("RIO GRANDE DO SUL", "RGS"),
    ACRE("ACRE", "AC"),
    RORAIMA("RORAIMA", "RO"),
    AMAPA("AMAPÁ", "AM"),
    GOIAS("GOIÁS", "GO"),
    SANTA_CATARINA("SANTA CATARINA", "SA"),
    PIAUI("PIAUÍ", "PI"),
    AMAZONAS("AMAZONAS", "AM"),
    ESPIRITO_SANTO("ESPIRITO SANTO", "ES"),
    ALAGOAS("ALAGOAS", "AL");

    protected String sigla;
    protected String nome;

    private UnidadeFederativa(String nome, String sigla) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

}
