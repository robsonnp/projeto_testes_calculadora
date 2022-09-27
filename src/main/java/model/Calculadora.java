package model;

public class Calculadora {
    private Double numero1=0.0;
    private Double numero2=0.0;
    private boolean ligada;

    private Double resultadoOperacao;


    public Calculadora(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.ligada=false;
        this.resultadoOperacao=null;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public Double getResultadoOperacao() {
        return resultadoOperacao;
    }

    public Double setResultadoOperacao(Double resultadoOperacao) {
        this.resultadoOperacao = resultadoOperacao;
        return resultadoOperacao;
    }

    public Double getNumero1() {
        return numero1;
    }

    public Double getNumero2() {
        return numero2;
    }




}
