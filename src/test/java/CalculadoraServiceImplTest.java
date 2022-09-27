import model.Calculadora;
import org.junit.Assert;
import org.junit.Test;
import service.CalculadoraService;
import service.CalculadoraServiceImpl;

import java.util.Optional;

public class CalculadoraServiceImplTest {

    @Test
    public void testeLigarCalculadora(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();


        //Given
        Calculadora calculadora = new Calculadora(1.0,2.0);

        //When
        calculadoraService.ligar(calculadora);


        //Then
        Assert.assertTrue(calculadora.isLigada());



    }

    @Test
    public void testeDesligarCalculadora(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();


        //Given
        Calculadora calculadora = new Calculadora(1.0,2.0);

        //When
        calculadoraService.ligar(calculadora);
        System.out.println(calculadoraService.estadoAtual(calculadora));
        calculadoraService.desligar(calculadora);
        System.out.println(calculadoraService.estadoAtual(calculadora));


        //Then
        Assert.assertFalse(calculadora.isLigada());



    }

    @Test
    public void testeNaoDeveSomarDesligada(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();


        //Given
        Calculadora calculadora = new Calculadora(1.0,2.0);

        //When
        calculadoraService.somar(calculadora);


        //Then
        Assert.assertEquals(null,calculadora.getResultadoOperacao());



    }

    @Test
    public void testeNaoDeveSubtrairDesligada(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();


        //Given
        Calculadora calculadora = new Calculadora(1.0,2.0);

        //When
        calculadoraService.subtrair(calculadora);


        //Then
        Assert.assertEquals(null,calculadora.getResultadoOperacao());



    }

    @Test
    public void testeNaoDeveMultiplicarDesligada(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();


        //Given
        Calculadora calculadora = new Calculadora(1.0,2.0);

        //When
        calculadoraService.multiplicar(calculadora);


        //Then
        Assert.assertEquals(null,calculadora.getResultadoOperacao());



    }

    @Test
    public void testeNaoDeveDividirDesligada(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();


        //Given
        Calculadora calculadora = new Calculadora(1.0,2.0);

        //When
        calculadoraService.dividir(calculadora);


        //Then
        Assert.assertEquals(null,calculadora.getResultadoOperacao());



    }

    @Test

    public void testeDeSoma(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();

        //Given

        Calculadora calculadora = new Calculadora(2.0,2.0);

        //When
        calculadoraService.ligar(calculadora);
        calculadoraService.somar(calculadora);

        //Then
        Assert.assertEquals(Double.valueOf(4.0),calculadora.getResultadoOperacao());
    }

    @Test
    public void testeDeSubtracao(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();

        //Given

        Calculadora calculadora = new Calculadora(2.0,2.0);

        //When
        calculadoraService.ligar(calculadora);
        calculadoraService.subtrair(calculadora);

        //Then
        Assert.assertEquals(Double.valueOf(0.0),calculadora.getResultadoOperacao());
    }

    @Test
    public void testeDeMultiplicacao(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();

        //Given

        Calculadora calculadora = new Calculadora(2.0,2.0);

        //When
        calculadoraService.ligar(calculadora);
        calculadoraService.multiplicar(calculadora);

        //Then
        Assert.assertEquals(Double.valueOf(4.0),calculadora.getResultadoOperacao());
    }
    @Test
    public void testeDeDivisao(){
        CalculadoraService calculadoraService = new CalculadoraServiceImpl();

        //Given

        Calculadora calculadora = new Calculadora(2.0,2.0);

        //When
        calculadoraService.ligar(calculadora);
        calculadoraService.dividir(calculadora);

        //Then
        Assert.assertEquals(Double.valueOf(1.0),calculadora.getResultadoOperacao());
    }
}
