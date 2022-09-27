package service;

import model.Calculadora;

public interface CalculadoraService {
    Double somar(Calculadora calculadora);
    Double subtrair(Calculadora calculadora);
    Double dividir(Calculadora calculadora);
    Double multiplicar(Calculadora calculadora);
    void ligar(Calculadora calculadora);
    void desligar(Calculadora calculadora);

    String estadoAtual(Calculadora calculadora);




}
