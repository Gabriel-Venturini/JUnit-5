package test.java;
import main.java.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void somaDois() {
        // instancia calculadora
        Calculadora calc = new Calculadora();

        // instancia resultados
        int resultado = calc.soma(10, 5); // 15

        // testes
        Assertions.assertEquals(15, resultado);
    }

    @Test
    public void subtraiDois() {
        // instancia calculadora
        Calculadora calc = new Calculadora();

        // resultados
        int resultado = calc.subtracao(10, 20); // -10

        // testes
        Assertions.assertEquals(-10, resultado);
    }
}
