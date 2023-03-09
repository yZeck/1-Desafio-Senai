
package aula11;


public enum TiposDeFuncionarios {

    COORDENADOR,
    SECRETARIA,
    PROFESSORDENUTRICAO("CRN"),
    PROFESSORDEENGENHARIA("CREA"),
    PROFESSORDEDIREITO("OAB");

    private String certificacao;

    private TiposDeFuncionarios(String certificacao) {
        this.certificacao = certificacao;
    }

    private TiposDeFuncionarios() {
    }
    

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }
    

}
