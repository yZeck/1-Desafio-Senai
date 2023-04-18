
package aula17deabril;


public enum Bonificacao {
    MOTOBOY(0.10),
    GERENTE(0.20),
    DIRETOR(0.40);
    
    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    
    
    
    
}
