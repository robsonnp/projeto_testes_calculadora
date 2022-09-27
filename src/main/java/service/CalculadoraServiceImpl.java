package service;

import model.Calculadora;

public class CalculadoraServiceImpl implements CalculadoraService {

    Double resultadoOperacao;

    @Override
    public Double somar(Calculadora calculadora) {
        if (calculadora.isLigada()) {
            Double resultadoSoma = calculadora.getNumero1() + calculadora.getNumero2();
            resultadoOperacao = resultadoSoma;
        }
        return calculadora.setResultadoOperacao(resultadoOperacao);
    }

    @Override
    public Double subtrair(Calculadora calculadora) {
        if (calculadora.isLigada()) {
            Double resultadoSubtracao = calculadora.getNumero1() - calculadora.getNumero2();
            resultadoOperacao = resultadoSubtracao;
        }
        return calculadora.setResultadoOperacao(resultadoOperacao);
    }

    @Override
    public Double dividir(Calculadora calculadora) {
        if (calculadora.isLigada()) {
        Double resultadoDivisao = calculadora.getNumero1() / calculadora.getNumero2();
        resultadoOperacao=resultadoDivisao;}
        return calculadora.setResultadoOperacao(resultadoOperacao);
    }

    @Override
    public Double multiplicar(Calculadora calculadora) {
        if (calculadora.isLigada()) {
        Double resultadoMultiplicao = calculadora.getNumero1() * calculadora.getNumero2();
        resultadoOperacao=resultadoMultiplicao;}
        return calculadora.setResultadoOperacao(resultadoOperacao);
    }

    @Override
    public void ligar(Calculadora calculadora) {
        calculadora.setLigada(true);

    }

    @Override
    public void desligar(Calculadora calculadora) {
        calculadora.setLigada(false);
    }

    public String estadoAtual(Calculadora calculadora) {
        return "A calculadora está ligada: " +
                calculadora.isLigada();
    }
}
